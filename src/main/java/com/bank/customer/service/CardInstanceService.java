package com.bank.customer.service;

import org.springframework.stereotype.Component;

import com.bank.customer.model.Card;
import com.bank.customer.model.DiamondCard;
import com.bank.customer.model.GoldCard;
import com.bank.customer.model.PlatinumCard;

@Component
public class CardInstanceService {

	
	
	public Card getCardType(String customerCardType) throws Exception {

		return switch (customerCardType) {
			case "Gold" -> new GoldCard();
			case "Platinum" -> new PlatinumCard();
			case "Diamond" -> new DiamondCard();
			default -> throw new Exception("Unexpected value: ");
		};
	}
}

