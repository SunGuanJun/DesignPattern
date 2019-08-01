package com.sunguanjun.demo.designpattern.responsibility.filter2;

public interface Filter {
	void doFilter(Request request, Response response, FilterChain chain);
}
