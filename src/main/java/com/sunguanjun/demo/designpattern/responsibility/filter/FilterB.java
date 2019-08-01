package com.sunguanjun.demo.designpattern.responsibility.filter;

public class FilterB implements Filter {

	public String doFilter(String msg) {
		return msg+"bbbbb";
	}

}
