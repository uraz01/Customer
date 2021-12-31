package com.bank.customer.service;

import com.bank.customer.model.Card;

public interface CardType {
	
	public String getCardType();
	public double getLimit();
	public double getPointPerDollar();
	public double getIssuanceFees();
	
	
	public Card doTransact(Card card);
	

}
