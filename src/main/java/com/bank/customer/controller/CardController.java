package com.bank.customer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bank.customer.dao.CardRepository;
import com.bank.customer.model.Card;
import com.bank.customer.service.CardService;

@RestController
public class CardController {

	@Autowired
	CardService cardService;
	@Autowired
	CardRepository cardRepository;
	
	@PostMapping("/")
	public Card getTransactDetail(@RequestBody Card card) throws Exception {
		
		return cardService.doTransaction(card);
		
	}
	
	@GetMapping("/all")
	public List<Card> getAllCardRecord(){
		
		return cardRepository.findAll();
	}
}
