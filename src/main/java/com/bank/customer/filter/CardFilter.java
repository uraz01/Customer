package com.bank.customer.filter;

import java.io.IOException;
import java.util.Date;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;

@Component
public class CardFilter implements Filter{

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {

	 HttpServletRequest req = (HttpServletRequest) request;
	 long lStartTime = new Date().getTime();
	 
	 System.out.println("request Method received: "+ req.getMethod());
	 
	 HttpServletResponse res = (HttpServletResponse) response;
	
	 chain.doFilter(request, response);
	 
	 long lEndTime = new Date().getTime();
	 
	 long timeTaken= lEndTime - lStartTime;
	 
	 System.out.println("Resposne send in this time : "+ timeTaken +"ms with this status code: " +res.getStatus() +" for this request: "+ req.getContextPath());
	 
	}

	
	
	
}
