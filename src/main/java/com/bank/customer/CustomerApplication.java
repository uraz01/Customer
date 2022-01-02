package com.bank.customer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.bank.customer.service.CardType;
import com.bank.customer.service.DiamondCardServiceImpl;
import com.bank.customer.service.GoldCardServiceImpl;
import com.bank.customer.service.PlatinumCardServiceImpl;

@SpringBootApplication
public class CustomerApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustomerApplication.class, args);
	}

	//create instance of each card and allow spring to manage it- dynamically inject as per user request
	@Bean
	public static CardType getGoldCardServiceImpl() {
		return new GoldCardServiceImpl();
		
	}
	@Bean
	public static CardType getPlatinumCardServiceImpl() {
		return new PlatinumCardServiceImpl();
		
	}
	@Bean
	public static CardType getDiamondCardServiceImpl() {
		return new DiamondCardServiceImpl();
		
	}
}
