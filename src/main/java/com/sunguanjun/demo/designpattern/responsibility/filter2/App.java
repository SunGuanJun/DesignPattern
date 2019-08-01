package com.sunguanjun.demo.designpattern.responsibility.filter2;

public class App {
	public static void main(String[] args){
		FilterChain chain = new FilterChain();
		chain.addFilter(new FilterA()).addFilter(new FilterB());
		
		Request request = new Request();
		Response response = new Response();
		request.value = "request";
		response.value = "response";
		
		chain.doFilter(request, response);
		System.out.println(request);
		System.out.println(response);
	}
}
