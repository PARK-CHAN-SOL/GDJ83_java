package com.PARK_CHAN_SOL.study1;

import java.util.Scanner;

public class Study8 {
	public static void main(String[] args) {
		// 이중 for문

		// FPS(배그, 서든, 배필, ... )
		// 총알(30발, 탄창 3개)
		// 점사(3발씩), 단발(1발씩)

		// 1. 단발 모드, 2. 점사 모드
		// 1번이라면 탕 * 30
		// 2번이라면 타타탕 * 10

		Scanner sc = new Scanner(System.in);
		int tan = 3;

		for (int i = 0; i < tan; i++) {

			System.out.println("사격 모드를 선택하세요. (탄창: " + (i + 1) + " / " + tan + ")");
			System.out.println("1: 단발, 2: 점사");

			int mode = sc.nextInt();

			if (mode == 1) {
				System.out.println("단발 모드로 사격합니다.");
				mode = 1;
			} else if (mode == 2) {
				System.out.println("점사 모드로 사격합니다.");
				mode = 3;
			} else {
				System.out.println("잘못 선택하셨습니다.");
				System.out.println("기본 사격 모드로 사격합니다.(단발)");
				mode = 1;
			}

			for (int j = 0; j < 30; j += mode) {

				if (j % 6 == 0) {
					System.out.println("");
				}

				switch (mode) {
				case 1:
					System.out.print("탕 ");
					break;
				case 3:
					System.out.print("타타탕 ");
					break;
				}

			}

			System.out.println("");
			System.out.println("");

		}

		System.out.println("사격 종료.");

		sc.close();
	}
}
