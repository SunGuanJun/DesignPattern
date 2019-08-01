package com.sunguanjun.demo.designpattern.responsibility.filter2;

public class FilterB implements Filter {

	public void doFilter(Request request, Response response, FilterChain chain) {
		request.value = request.value + "bbbbb";
		System.out.println(request);
		chain.doFilter(request, response);
		response.value = response.value + "bbbbb";
		System.out.println(response);
	}

}
