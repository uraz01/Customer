package com.bank.customer.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bank.customer.CardException;
import com.bank.customer.dao.CardRepository;
import com.bank.customer.model.Card;

@Service
public class CardService {
	
	CardType cardType;
	@Autowired
	CardINstanceService cardINstanceService;

	@Autowired
	CardRepository cardDao;
	

	public void doTransaction(String cardType, double transactAmount) throws Exception {
		// get card type from user request
		// instantiate card class as per card type send by user
		// get old record and validate with it set points
		// if good do transact and save in record
		// send success , new balance and new points accured to user
		// if fails send declined message

		Card card = cardINstanceService.getCardType(cardType);

		Optional<Card> oldCardfromDao = cardDao.findById(1);
		Card oldCardDao= oldCardfromDao.isPresent()? oldCardfromDao.get(): null;
		// first-time
		if (oldCardDao == null) {
			
			if (transactAmount <= card.getLimit()) {
				card.setBalance(transactAmount);
				card.setPointsCollected(transactAmount * card.getPointPerDollar());
			   cardDao.save(card);
			} else {
				//card.setMessage("Declined!");
				//return customerCard;
				throw new CardException();
			}

		}
		// if record exist
		else if ((transactAmount + oldCardDao.getBalance()) <= card.getLimit()) {
			oldCardDao.setBalance(transactAmount + oldCardDao.getBalance());
			oldCardDao.setPointsCollected(
					oldCardDao.getPointsCollected() + transactAmount * card.getPointPerDollar());
			cardDao.save(oldCardDao);
			//oldCardDao.setMessage("Success");
		} else {
			throw new CardException();
		}

		
	}


	public Optional<Card> getCardDetailByType(String cardType) {
		return cardDao.findById(1);
	}

	
	
}
