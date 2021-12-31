package com.bank.customer.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bank.customer.model.Card;

public interface CardRepository extends JpaRepository<Card, Integer> {

	Card findByCardType(String cardType);

		
}
