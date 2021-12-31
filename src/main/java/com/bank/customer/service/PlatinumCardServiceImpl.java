package com.bank.customer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bank.customer.dao.CardRepository;
import com.bank.customer.model.Card;
@Service
public class PlatinumCardServiceImpl implements CardType  {

	@Autowired
	CardRepository cardDao;
	
	@Override
	public String getCardType() {
		return "Platinum";
	}
	@Override
	public double getLimit() {
		return 1500.0;
	}
	@Override
	public double getIssuanceFees() {
		return 50.0;
	}

	@Override
	public double getPointPerDollar() {
		return 0.5;
	}
	
	@Override
	public Card doTransact(Card card) {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
