package com.bank.customer;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import com.bank.customer.dao.CardRepository;
import com.bank.customer.model.Card;
import com.bank.customer.model.GoldCard;
import com.bank.customer.service.CardInstanceService;
import com.bank.customer.service.CardService;

@SpringBootTest
class CustomerApplicationTests {
	
	@Mock
	CardInstanceService cardInstanceService;
	
	@Mock
	CardRepository cardDaoProxy;
	@InjectMocks
	CardService cardService;
	
	static Card card;
	
	@BeforeAll
	public static void init() {
		/*
		 * cardDaoProxy = EasyMock.createMock(CardRepository.class);
		 */
		 card = new Card(); 
		 card.setCardType("Gold");
		 card.setBalance(50.00);
		 /* 
		 * 
		 * EasyMock.expect(cardDaoProxy.findByCardType("Gold")) .andReturn(card);
		 * 
		 * EasyMock.replay(cardDaoProxy);
		 */
		
		
		
	}

	@Test
	void testCardLimit() throws Exception {
		
		when(cardInstanceService.getCardType("Gold")).thenReturn(new GoldCard());
		assertEquals(100.00, cardInstanceService.getCardType("Gold").getCardLimit());
	}
	
	@Test
	void testCardTypeFromCardDao() {
		
		when(cardDaoProxy.findByCardType("Gold"))
		.thenReturn(card);
		assertEquals(50.00,cardDaoProxy.findByCardType("Gold").getBalance() );
	}
	
	
	@Test
	void testDoTransact() throws Exception {
		when(cardInstanceService.getCardType("Gold")).thenReturn(new GoldCard());
		//when(cardDaoProxy.findByCardType("Gold"))
		//.thenReturn(card);
		
		cardService.doTransaction("Gold", 50.00);
		//verify(cardInstanceService).getCardType("Gold");
		verify(cardDaoProxy).findByCardType("Gold");
		
	}
}
