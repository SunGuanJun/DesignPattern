package com.sunguanjun.demo.designpattern.proxy_pattern;


public class App {
	public static void main(String[] args){
		Leader leader = new Leader(new WorkerB());
		leader.solveProblem();
	}
}
