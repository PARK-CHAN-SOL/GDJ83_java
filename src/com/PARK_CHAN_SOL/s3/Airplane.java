package com.PARK_CHAN_SOL.s3;

public class Airplane implements Fly{
	
	@Override
	public void flyAble() {
		System.out.println("flyAble() Airplane");
		
	}
	
	@Override
	public void land() {
		System.out.println("land() Airplane");
		
	}
}
