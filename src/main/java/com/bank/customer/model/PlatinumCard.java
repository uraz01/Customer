package com.bank.customer.model;

import javax.persistence.Entity;
@Entity
public class PlatinumCard extends Card  {

	
	
	@Override
	public String getCardType() {
		return "Platinum";
	}
	@Override
	public double getCardLimit() {
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
	
	

}
