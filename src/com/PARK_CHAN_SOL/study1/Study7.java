package com.PARK_CHAN_SOL.study1;

import java.util.Scanner;

public class Study7 {
	public static void main(String[] args) {
		// 반복문 - for, while
		// for(초기식; 조건식; 증감식){}
		// while(조건식){}
		// do{}while(조건식);
		// break; continue;

		// 3과목의 점수를 입력 받아서 합계 구하기
		Scanner sc = new Scanner(System.in);
//		int score = 0;
//		for (int i = 0; i < 3; i++) {
//			score += sc.nextInt();
//		}
//		System.out.println(score);

		for (char i = 'a'; i <= 'z'; i++) {
			System.out.print(i);
		}
//		System.out.print("abc");
//		System.out.print("def");
//		System.out.println("");
//		System.out.println("123");

		sc.close();
	}
}
