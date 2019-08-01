package com.sunguanjun.demo.designpattern.responsibility.filter;

public class App {
	public static void main(String[] args){
		test1();
	}
	
	public static void test1(){
		String msg = "Hello world!";
		Filter[] filters = {new FilterA(), new FilterB()};
		
		for (Filter filter : filters){
			msg = filter.doFilter(msg);
		}
		
		System.out.println(msg);
	}
}
