package com.bank.customer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bank.customer.model.Card;
import com.bank.customer.service.CardService;

@RestController
public class CardController {

	@Autowired
	CardService cardService;
	
	
	@PostMapping("/transact")
	public void doTransaction(@RequestParam String cardType,  @RequestParam double transacationAmount) throws Exception {
		cardService.doTransaction(cardType, transacationAmount);
	}
	
	@GetMapping("/detail")
	public Card getCardDetail(@RequestParam String cardType) throws Exception {
		return cardService.getCardDetailByType(cardType);
	}
	
	@GetMapping("/all")
	public List<Card> getAllCardRecord(){
		
		return cardService.findAll();
	}
}
