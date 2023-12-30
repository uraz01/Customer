package com.bank.customer.model;

import jakarta.persistence.Entity;

@Entity
public class GoldCard extends Card{
	
	public String getCardType() {
		return "Gold";
	}


	public double getCardLimit() {
		return 100.00;
	}

	public double getPointPerDollar() {
		return 0.00;
	}


	public double getIssuanceFees() {
		return 0;
	}



}
