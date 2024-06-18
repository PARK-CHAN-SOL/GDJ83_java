package com.sol.s7.thread;

public class PrintWord implements Runnable{
	public void print() {
		for(int i = 'a'; i < 'a' + 10; i++) {
			System.out.println((char)i);
			try {
				Thread.sleep(5);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	@Override
	public void run() {
		this.print();
		
	}
}
