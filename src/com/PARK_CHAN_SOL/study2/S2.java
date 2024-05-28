package com.PARK_CHAN_SOL.study2;

public class S2 {
	public static void main(String[] args) {
		
		// 1. primitive type: byte, short, int, long, float, double, char, boolean
		// 2. reference type: String, ...
		
		// 자바의 메모리 영역 구분
		// 1. 메서드 영역:
		//				메서드 영역에 선언된 변수를 클래스 변수라고 함.
		// 2. 스택 영역: 메서드가 실행될 때 차지하는 영역,
		// 				메서드 안에 선언된 변수를 지역 변수라고 함.
		// 3. 힙 영역: 동적 영역 (변수가 만들어질 수도 있고 안만들어질 수도 있다.)
		//				힙 영역에 선언된 변수를 인스턴스 변수라고 함.
		
		// 배열: 하나의 변수로 여러개의 데이터를 다룰 때 사용.
		//		그러나 같은 데이터 타입만 모을 수 있음.
		
		// 변수 선언
		// 데이터타입명 변수명;
		// String name;
		
		// 지역변수는 {시작되면 만들어지고 }만나면 소멸
		// 			초기화 하지 않고 사용하면 에러 발생
		int num = 0;
		System.out.println(num);
		
		// 배열 선언
		// 모을려고하는데이터타입명 [] 변수명 = new 모을려고하는데이터타입명[모을려고하는개수]
		// new는 객체 만드는 연산자, 객체는 힙 영역에 만들어짐, new는 힙 영역에 뭔가 새로 만들라는 이야기다.
		// new int[3]은 힙 영역에 int형 메모리 자리 3개를 마련하라는 의미.
		// 변수 ar은 스택 영역에 존재하고 heap영역 데이터의 첫 자리 주소를 가짐. 
		// 배열 선언시에 대괄호 내부에 숫자는 int형 숫자만 들어갈 수 있다. 'a'의 경우 자동 형변환 되어 int형으로 들어간다
		
		int[] ar = new int[3];
		int[] ar2 = {1, 2, 3};
		
		String[] names = new String[2];
		System.out.println(ar);
		System.out.println(names);
		
		// 일반적인 초기값: 정수형-0, 실수형-0.0, char-' ' (공백), boolean-false, String-null
		// 인스턴스변수는 자동으로 초기화됨
		System.out.println(ar[0]);
		System.out.println(names[0]);
		ar[0] = 50;
		ar = ar2;
		System.out.println(ar[0]);
	}
}
