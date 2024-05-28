package com.PARK_CHAN_SOL.study2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class S2_1 {
	public static void main(String[] args) {
		int[] ar = new int[5];
		Scanner sc = new Scanner(System.in);
		// 각 인덱스번호 칸에 값을 키보드로 입력받아서 저장하기

		for (int i = 0; i < ar.length; i++) {
			try {
				System.out.print("ar[" + i + "]: ");
				ar[i] = sc.nextInt();
				sc.nextLine();
			} catch (InputMismatchException e) {
				System.out.println("잘못 입력하셨습니다");
				sc.close();
				return;
			}
		}

		System.out.println("");

		for (int i = 0; i < ar.length; i++) {
			System.out.println("ar[" + i + "]: " + ar[i]);
		}

		System.out.println("");

		System.out.print("배열의 크기를 입력: ");

		try {
			int arrSize = sc.nextInt();
			sc.nextLine();
			int[] ar2 = new int[arrSize];
			System.out.println("");
			System.out.println("ar2.length: " + ar2.length);
		} catch (InputMismatchException e) {
			System.out.println("");
			System.out.println("잘못 입력하셨습니다");
			sc.close();
			return;
		}
		sc.close();
	}
}
