package com.bank.customer.configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CorsConfiguration {

	@Value("$allowed.Origin")
	private String allowedOrigin;
	
	@Bean
	public WebMvcConfigurer getCorsConfiguration() {
		return new WebMvcConfigurer() {
			
			
			public void addCorsMappings(CorsRegistry registry) {
				
				registry.addMapping("/**")
						.allowedOrigins(allowedOrigin)
						.allowedMethods("GET","POST","PUT","DELTE")
						.allowedHeaders("*");
			}
		};
		
	}
}
