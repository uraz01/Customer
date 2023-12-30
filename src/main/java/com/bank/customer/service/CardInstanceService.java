package com.bank.customer.service;

import org.springframework.stereotype.Component;

import com.bank.customer.model.Card;
import com.bank.customer.model.DiamondCard;
import com.bank.customer.model.GoldCard;
import com.bank.customer.model.PlatinumCard;

@Component
public class CardInstanceService {

	
	
	public Card getCardType(String customerCardType) throws Exception {

		Card card;
		switch (customerCardType) {
		case "Gold": {
			 card = new GoldCard();
			 break;
		}
		case "Platinum": {
			card = new PlatinumCard();
			break;
		}
		case "Diamond": {
			 card =new DiamondCard();
			 break;
		}
		default:
			throw new Exception("Unexpected value: ");
		}
		
		return card;
	}
}

