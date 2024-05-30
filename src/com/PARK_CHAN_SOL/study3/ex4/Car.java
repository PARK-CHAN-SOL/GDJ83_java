package com.PARK_CHAN_SOL.study3.ex4;

public class Car {

	// 첫번째로 실행
	String color = "white";
	String brand;
	String company;
	int price = 1000;

	/*
	 *  생성자 (Constructor)
	 *  생성자 선언 문법
	 *  접근지정자 클래스명과동일한이름 ([매개변수 선언]){}
	 *  인스턴스 초기화 블럭
	 *  두번째로 실행
	 *  거의 안씀
	 *  
	 * */	{
		price = 200;
	}

	// 세번째로 실행
	public Car() {
		// 기본 생성자 ( 매개변수가 없음 )
		this(2500);
		
//		System.out.println("자동차가 만들어집니다");
//		this.color = "Black";
//		this.brand = "K3";
//		this.company = "KIA";
//		this.price = 2500;
		
		// this()는 생성자 내에서 제일 첫줄에 위치 해야 함
	}

	// 생성자 오버로딩
	public Car(int price) {
		this(price, "black");
//		this.price = price;
//		this.color = "Black";
//		this.brand = "K3";
//		this.company = "KIA";
	}

	public Car(int price, String color) {
		this(price, color, "K3");
//		this.price = price;
//		this.color = color;
//		this.brand = "K3";
//		this.company = "KIA";
	}

	public Car(int price, String color, String brand) {
		this.price = price;
		this.color = color;
		this.brand = brand;
		this.company = "KIA";
	}

	public void info() {
		System.out.println("info");

		System.out.println(this.color);
		System.out.println(this.brand);
		System.out.println(company);
		System.out.println(price);
	}

}
