package com.sunguanjun.demo.designpattern.responsibility.filter;

public class FilterA implements Filter {

	public String doFilter(String msg) {
		return msg+"aaaaa";
	}

}
