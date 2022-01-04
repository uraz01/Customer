package com.bank.customer.model;

import javax.persistence.Entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bank.customer.dao.CardRepository;
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
