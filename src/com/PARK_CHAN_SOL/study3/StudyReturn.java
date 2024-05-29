package com.PARK_CHAN_SOL.study3;

import java.util.Random;

public class StudyReturn {
	// 접근지정자 [그외지정자] 리턴타입 메서드명 ([매개변수 선언]){}

	public int t1() {
		int num = 3;
		if (num % 2 == 0) {
			return 0;
		}
		int num2 = 6;
		int result = num * num2;

		// 리턴의 데이터 개수는 딱 하나만 가능
		return result;
	}

	public void t2() {
		Random random = new Random();
		// 0 <= num < 10 정수 하나를 랜덤하게 리턴
		int num = random.nextInt(10);
		if (num % 2 == 0) {
			return;
		} else {
			System.out.println(num);
		}
	}
}
