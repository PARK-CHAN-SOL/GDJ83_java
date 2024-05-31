package com.PARK_CHAN_SOL.s3;

public class Tiger extends Animal {
	int power;

	// 메서드 오버라이딩(overriding): 상속 받은 메서드를 재정의 하는것
	// 메서드의 선언부(Header)는 동일하게
	// 접근지정자는 같은 범위나 더 넓은 범위로는 수정 가능
	public void sleep() {
		System.out.println("누워자기");
	}

}
