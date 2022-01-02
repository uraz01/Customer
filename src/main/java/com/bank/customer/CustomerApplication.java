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

}
