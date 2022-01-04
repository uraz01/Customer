package com.bank.customer.model;

import javax.persistence.Entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bank.customer.dao.CardRepository;
@Entity
public class GoldCard extends Card{
	
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



}
