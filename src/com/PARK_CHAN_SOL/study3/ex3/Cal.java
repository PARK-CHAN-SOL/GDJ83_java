package com.PARK_CHAN_SOL.study3.ex3;

public class Cal {

	// Method Overloading
	// 같은 이름의 메서드를 여러개 만드는 것 (New)
	// 조건: 매개변수의 타입의 조합이나 개수가 달라야함
	// 메서드의 내용은 달라도 상관없다.
	
//	public void hap(int num1, int num2, int kk) {
//	}

	public void hap(int n1, int n2) {
		System.out.println(n1 + n2);
	}

	public void hap(int n1, long n2) {
		System.out.println(n1 + n2);
	}

	public void hap(long n1, int n2) {
		System.out.println(n1 + n2);
	}

	public void hap(long n1, long n2) {
		System.out.println(n1 + n2);
	}
}
