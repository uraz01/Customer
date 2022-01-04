package com.bank.customer.model;

import javax.persistence.Entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bank.customer.dao.CardRepository;
@Entity
public class PlatinumCard extends Card  {

	
	
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
	
	

}
