package com.PARK_CHAN_SOL.study1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Study4 {
	public static void main(String[] args) {
		// 키보드와 연결 준비
		Scanner sc = new Scanner(System.in);

		System.out.println("숫자를 입력하세요");// 0 이상의 정수

		// 엔터칠 때 까지
		int num = 0;
		try {
			num = sc.nextInt();
		} catch (InputMismatchException e) {
			System.out.println("잘못 입력하셨습니다.");
			System.out.println("프로그램을 종료합니다.");
			sc.close();
			return;
		}

		int result = num % 4;
		int i = 1;
		int tmp = num;
		while (tmp >= 4) {
			tmp = tmp / 4;
			i++;
		}
		tmp = 1;

		int dec = 1;
		int j = i;
		for (; j > 1; j--) {
			for (i = j; i > 1; i--) {
				tmp = tmp * 4;
				dec = dec * 10;
			}
			result = result + (num / tmp) * dec;
			num = num % tmp;
			tmp = 1;
			dec = 1;
		}

		System.out.println(result);

		System.out.println("프로그램을 종료합니다.");
		sc.close();
	}
}
