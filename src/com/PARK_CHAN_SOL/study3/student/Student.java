package com.PARK_CHAN_SOL.study3.student;

public class Student {
	// 멤버 변수, instance variable
	int num;
	String name;
	int kor;
	int eng;
	int math;
	int total;
	double avg;

	// 변수 선언 공식: 데이터타입명 변수명;
	// 객체 생성 공식: new 클래스명();
	// 메서드 선언 공식
	// public static void main(String[] args){}
	// 접근지정자 [그외지정자] 리턴타입 메서드명([매개변수들 선언]){실행코드}
	// 소괄호까지를 메서드의 헤더 또는 선언부, 중괄호 부분을 바디
	public void info() {
		int num = 10;
		System.out.println("info() 실행됨, num: " + num);
	}
}
