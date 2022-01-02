package com.bank.customer.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Card {
	
	@Id
	private String cardType;
	private double cardLimit;
	private double pointPerDollar;
	private double issuanceFees;

	private double balance;
	private double transactAmount;
	private double pointsCollected;
	private String message;
	
	public String getCardType() {
		return cardType;
	}
	public void setCardType(String cardType) {
		this.cardType = cardType;
	}
	public double getLimit() {
		return cardLimit;
	}
	public void setLimit(double limit) {
		this.cardLimit = limit;
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