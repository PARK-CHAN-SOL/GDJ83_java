package com.PARK_CHAN_SOL.study1;

public class Study6 {
	public static void main(String[] args) {

		int total = 256;
		int avg = total / 3;

		// 평균이 90점 이상이면 A
		// 평균이 80점 이상이면 B
		// 평균이 70점 이상이면 C
		// 평균이 60점 이상이면 D
		// 그 외 F

		switch (avg / 10) {
		case 10:
		case 9:
			int n = 10;
			System.out.println("A, 그냥 출력 n:" + n);
			break;
		case 8:
//			int n; 위에 break;가 없으면 오류가 날 수 있음.(중복 선언)
			System.out.println("B");
			break;
		case 7:
			System.out.println("C");
			break;
		case 6:
			System.out.println("D");
			break;
		default:
			System.out.println("F");
			break;
		}
	}
}
