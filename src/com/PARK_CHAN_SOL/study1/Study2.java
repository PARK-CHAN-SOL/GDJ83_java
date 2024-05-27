package com.PARK_CHAN_SOL.study1;

public class Study2 {
	public static void main(String[] args) {
		//
		// Reference Type (객체)
		String name = "PARK_CHAN_SOL";

		String name2 = new String("PARK_CHAN_SOL");
		Object obj = new Object();
		int age = 30;
		String na = "1";

		// 같은 타입끼리만 비교 가능
		// age = 1;
		// na = "1";
		// System.out.println(age == na);

		// 형변환(Cascading)
		// Primitive 타입끼리만 형변환 가능 (boolean 제외)

		// 형태를 변환(type의 변환)
		// 강제 형변환(명시적 형변환)
		long num1 = 30L;
		int num2 = (int) num1;

		float f1 = 1.2F;
		// 자동 형변환 (묵시적 형변환)
		// 작은 타입을 큰 타입에 넣을 때
		// double d1 = (double) f1;
		double d1 = f1;

		// 자동형변환
		// byte -> short, char -> int -> long -> float -> double
		// 수 표현의 갯수(비트 조합)
		// float은 1.00000001, 1.0000002도 1이라고 생각함
		// double은 1.0000000000000001도 1이라고 생각함

		int total = 100;
		double avg = total / 3;

		avg = 33.22;
		total = (int) (avg * 10);

		System.out.println(avg);
		System.out.println(total);

		// over flow
		byte b = 127;
		byte b2 = 1;
		byte b3 = (byte) (b + b2);
		System.out.println(b3);
		// under flow
		b = -128;
		b3 = (byte) (b - b2);
		System.out.println(b3);

		// 연산자는 같은 타입끼리만 연산이 가능
		// 산술연산자: +, -, *, /, %

	}
}
