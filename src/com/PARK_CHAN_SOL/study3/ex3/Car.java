package com.PARK_CHAN_SOL.study3.ex3;

public class Car {

	String color;
	String brand;
	String company;

	// 참조 변수 this => 자기 자신의 객체의 주소를 담고있다.
	// 객체 생성시 만들어져 값이 대입되는 변수
	// 각각의 객체 내에서만 사용 가능
	// this는 생략 가능

	public void info() {
		System.out.println("info");
		System.out.println(this);
		System.out.println(this.color);
		System.out.println(this.brand);

		this.go();
	}
	
	public void go() {
		System.out.println(this.company);
	}
}
