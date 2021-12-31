package com.bank.customer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bank.customer.dao.CardRepository;
import com.bank.customer.model.Card;

@Service
public class DiamondCardServiceImpl implements CardType  {

	@Autowired
	CardRepository cardDao;
	
	@Override
	public String getCardType() {
		return "Diamond";
	}

	@Override
	public double getLimit() {
		return 2000.00;
	}

	@Override
	public double getPointPerDollar() {
		return 1.0;
	}

	@Override
	public double getIssuanceFees() {
		return 100.00;
	}

	@Override
	public Card doTransact(Card card) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
