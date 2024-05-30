package com.PARK_CHAN_SOL.s2;

public class Member {

	private String name;
	private int age;

	// 생성자로 초기화 하면, get으로 꺼내올 수는 있지만
	// 변수에 다른 값을 대입할 수 없다 (새로 만들어야한다)

	public int getAge() {
		return this.age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}

}
