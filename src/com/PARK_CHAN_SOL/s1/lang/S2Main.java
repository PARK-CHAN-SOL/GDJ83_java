package com.PARK_CHAN_SOL.s1.lang;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class S2Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		Object obj1 = new Object();
		Object obj2 = new Object();

		boolean flag = obj1.equals(obj2);
		System.out.println(flag); // false

		Test t1 = new Test();
		Test t2 = new Test();

		System.out.println(t1 == t2); // false

		t1.age = 9;
		flag = t1.equals(t2);
		System.out.println(flag); // false

		String name = "winter";
		System.out.println("문자열을 입력하세요");
		String name2 = br.readLine();
		String name3 = "winter";
		System.out.println(name == name2);
		System.out.println(name == name3);
		System.out.println(name.equals(name2));
		name3 = name3 + "";
		System.out.println(name3 == name);
		
		//객체가 3번 새로 만들어짐 (메모리 차지)
		System.out.println("1" + 1 + 1 + '1');

	}

}
