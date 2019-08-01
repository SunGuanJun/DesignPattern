package com.sunguanjun.demo.designpattern.proxy_pattern;

public class Leader implements Work{
	private Work worker;
	
	public Leader(Work worker){
		this.worker = worker;
	}
	
	public void solveProblem(){
		worker.solveProblem();
	}
}
