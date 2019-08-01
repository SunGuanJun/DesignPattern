package com.sunguanjun.demo.designpattern.observer.push;

import java.util.ArrayList;
import java.util.List;

public class SubjectA implements Subject {
	private int state = 0;

	private List<Observer> list = new ArrayList<Observer>();
	
	public void addObserver(Observer o) {
		list.add(o);
	}

	public void deleteObserver(Observer o) {
		list.remove(o);
	}

	public void notifyObservers() {
		for(Observer o : list){
			o.update(state);
		}
	}
	
	public void change(int state){
		this.state = state;
		System.out.println("subjectA change state :" + state);
		notifyObservers();
	}

}
