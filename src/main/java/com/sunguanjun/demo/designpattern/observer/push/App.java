package com.sunguanjun.demo.designpattern.observer.push;

public class App {
	public static void main(String[] args){
		ObserverA oa = new ObserverA();
		SubjectA sa = new SubjectA();
		
		oa.getState();
		sa.addObserver(oa);
		sa.change(1);
		oa.getState();
		sa.change(2);
		oa.getState();
	}
}
