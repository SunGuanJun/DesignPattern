package com.sunguanjun.demo.designpattern.observer.push;


public interface Subject {
	public void addObserver(Observer o);
	
	public void deleteObserver(Observer o);
	
	public void notifyObservers();
}
