package com.PARK_CHAN_SOL.s4;

public class S4Main {

	public static void main(String[] args) {

		// 클래스변수
		// 클래스명.변수명
		// 다른클래스에서 company(클래스변수)를 공유하기 위함
//		Car.COMPANY = "-";
		System.out.println(Car.COMPANY);
		
		// 클래스명.메서드명();
		Car.info();
		
		System.out.println(Math.E);
		
		double abs = Math.abs(-3.78);
		System.out.println(abs);
		
//		Bird는 추상 클래스, 선언 불가
//		Bird bird = new Bird();
	}

}
