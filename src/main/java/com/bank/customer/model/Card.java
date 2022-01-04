package com.bank.customer.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

import lombok.Data;

@Entity
@Data
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
public class Card {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	private String cardType;
	private double cardLimit;
	private double pointPerDollar;
	private double issuanceFees;

	private double balance;
	private double transactAmount;
	private double pointsCollected;
	private String message;
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public double getCardLimit() {
		return cardLimit;
	}
	public void setCardLimit(double cardLimit) {
		this.cardLimit = cardLimit;
	}
	public String getCardType() {
		return cardType;
	}
	public void setCardType(String cardType) {
		this.cardType = cardType;
	}
	public double getPointPerDollar() {
		return pointPerDollar;
	}
	public void setPointPerDollar(double pointPerDollar) {
		this.pointPerDollar = pointPerDollar;
	}
	public double getIssuanceFees() {
		return issuanceFees;
	}
	public void setIssuanceFees(double issuanceFees) {
		this.issuanceFees = issuanceFees;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public double getTransactAmount() {
		return transactAmount;
	}
	public void setTransactAmount(double transactAmount) {
		this.transactAmount = transactAmount;
	}
	public double getPointsCollected() {
		return pointsCollected;
	}
	public void setPointsCollected(double pointsCollected) {
		this.pointsCollected = pointsCollected;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
	
}