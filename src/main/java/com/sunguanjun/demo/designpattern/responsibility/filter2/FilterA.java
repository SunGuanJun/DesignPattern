package com.sunguanjun.demo.designpattern.responsibility.filter2;

public class FilterA implements Filter {

	public void doFilter(Request request, Response response, FilterChain chain) {
		request.value = request.value + "aaaaa";
		System.out.println(request);
		chain.doFilter(request, response);
		response.value = response.value + "aaaaa";
		System.out.println(response);
	}

}
