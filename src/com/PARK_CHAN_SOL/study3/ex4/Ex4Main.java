package com.PARK_CHAN_SOL.study3.ex4;

import java.util.Scanner;

public class Ex4Main {

	public static void main(String[] args) {
		// Scanner 클래스는 기본생성자가 존재하지 않음
		// Scanner sc = new Scanner(System.in);
		
		// 객체를 생성하려면
		// new 생성자호출;
		
		Car car = new Car();
		car.info();
		
		Car car2 = new Car(200);
		car2.info();
		
		Bike bike = new Bike();

	}

}
