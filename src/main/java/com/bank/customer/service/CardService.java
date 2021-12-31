package com.bank.customer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bank.customer.dao.CardRepository;
import com.bank.customer.model.Card;

@Service
public class CardService {
	CardType cardType;

	@Autowired
	CardRepository cardDao;

	public Card doTransaction(Card customerCard) throws Exception {
		// get card type from user request
		// instantiate card class as per card type send by user
		// get old record and validate with it set points
		// if good do transact and save in record
		// send success , new balance and new points accured to user
		// if fails send declined message

		cardType = getCardType(customerCard.getCardType());

		Card oldCardDao = cardDao.findByCardType(customerCard.getCardType());

		// first-time
		if (oldCardDao == null) {
			if (customerCard.getTransactAmount() <= cardType.getLimit()) {
				Card card = new Card();
				card.setBalance(customerCard.getTransactAmount());
				card.setPointsCollected(customerCard.getTransactAmount() * cardType.getPointPerDollar());
				card.setCardType(cardType.getCardType());
				card.setMessage("Success");
				return cardDao.save(card);
			}

		}
		// if record exist
		if ((customerCard.getTransactAmount() + oldCardDao.getBalance()) <= cardType.getLimit()) {
			oldCardDao.setBalance(customerCard.getTransactAmount() + oldCardDao.getBalance());
			oldCardDao.setPointsCollected(
					oldCardDao.getPointsCollected() + customerCard.getTransactAmount() * cardType.getPointPerDollar());
			oldCardDao.setMessage("Success");
		} else {
			customerCard.setMessage("Declined!");
			return customerCard;
		}

		return cardDao.save(oldCardDao);
	}

	private CardType getCardType(String cusotmerCardType) throws Exception {

		switch (cusotmerCardType) {
		case "Gold": {
			return cardType = new GoldCardServiceImpl();
		}
		case "Platinum": {
			return cardType = new PlatinumCardServiceImpl();
		}
		case "Diamond": {
			return cardType = new DiamondCardServiceImpl();
		}
		default:
			throw new Exception("Unexpected value: ");

		}

	}
}
