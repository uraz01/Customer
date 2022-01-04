package com.bank.customer.model;

import javax.persistence.Entity;
@Entity
public class DiamondCard extends Card {

	public String getCardType() {
		return "Diamond";
	}

	public double getLimit() {
		return 2000.00;
	}

	public double getPointPerDollar() {
		return 1.0;
	}
	public double getIssuanceFees() {
		return 100.00;
	}

}
