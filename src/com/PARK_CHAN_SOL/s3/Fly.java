package com.PARK_CHAN_SOL.s3;

public interface Fly extends Landing{

	// 상수
	// 접근지정자는 public만 가능, 그외지정자는 final
	public final static int NUM = 1;
	
	// 무조건 public final이기 때문에 생략 가능
	String NAME = "abc";
	
	// 추상 메서드
	// 접근지정자 public, 그외지정자는 추상메서드니까 abstract
//	public abstract void t1();
	
	// 무조건 public abstract라서 둘다 생략가능
//	public int t2();
//	abstract String t3(int num);
//	String t4();
	
	public abstract void flyAble();
	
	
}
