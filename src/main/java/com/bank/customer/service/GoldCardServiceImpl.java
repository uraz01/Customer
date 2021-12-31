package com.bank.customer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bank.customer.dao.CardRepository;
import com.bank.customer.model.Card;
@Service
public class GoldCardServiceImpl implements CardType {
	
	@Autowired
	CardRepository cardDao;
	
	
	public String getCardType() {
		return "Gold";
	}


	public double getLimit() {
		return 100.00;
	}

	public double getPointPerDollar() {
		return 0.00;
	}


	public double getIssuanceFees() {
		return 0;
	}


	@Override
	public Card doTransact(Card card) {
		
		
		return null;
	}

}
