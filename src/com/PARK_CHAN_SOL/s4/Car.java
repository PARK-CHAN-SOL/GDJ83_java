package com.PARK_CHAN_SOL.s4;

public final class Car {

	// 접근지정자 [그외지정자] 데이터타입 변수명
	public static final String COMPANY = "abc"; // static은 이태릭체
	public final int MAX_PRICE;

	//final 변수는 초기화를 해줘야한다.
//	{
//		this.MAX_PRICE = 30;
//	}

	static {
//		company = "def";
	}
	
	public Car() {
		this.MAX_PRICE = 100;
	}
	
	public static void info() {
		System.out.println(Car.COMPANY);

		// static method안에 this로 참조 불가
		// **new로 객체가 만들어지는게 보장이 안됨**
		// System.out.println(this.price);
		// this.info2();
		
		System.out.println("static method");
	}

	public final void info2() {
		Car.info();
		System.out.println(Car.COMPANY);

		final int num = 30;
		
//		final은 한번 값이 들어가면 변경할 수 없다.
//		num = 20;
	}
}
