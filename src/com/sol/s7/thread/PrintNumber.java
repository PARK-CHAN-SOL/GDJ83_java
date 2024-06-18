package com.sol.s7.thread;

public class PrintNumber extends Thread {
	public synchronized void info() {
		for(int i = 0; i < 10; i++) {
			System.out.println(i);
			
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
		this.info();
	}
}
