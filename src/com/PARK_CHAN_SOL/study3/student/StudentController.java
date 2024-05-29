package com.PARK_CHAN_SOL.study3.student;

import java.util.InputMismatchException;
import java.util.Scanner;

public class StudentController {
	public void start() {
//		System.out.println("STUDENT CONTROLLING");

		// S2_2
		// 1. 학생 정보 입력, 2. 학생 정보 출력, 3. 학생 검색, 4. 프로그램 종료
		Scanner sc = new Scanner(System.in);
		boolean flag = true;

		while (flag) {
			System.out.println("1. 학생 정보 입력, 2. 학생 정보 출력, 3. 학생 검색, 4. 프로그램 종료");
			int select;

			while (true) {
				try {
					select = sc.nextInt();
					sc.nextLine();
					if (select == 1) {
						System.out.println("학생 정보 입력 코드 작성해");
						StudentService sts = new StudentService();
						sts.makeStudent();
					} else if (select == 2) {
						System.out.println("학생 정보 출력 코드 작성해");
					} else if (select == 3) {
						System.out.println("학생 검색 코드 작성해");
					} else if (select == 4) {
						System.out.println("프로그램 종료");
						flag = !flag;
					} else {
						throw new InputMismatchException();
					}
					break;
				} catch (InputMismatchException e) {
					sc = new Scanner(System.in);
					System.out.println("잘못 입력하셨습니다");
					System.out.println("1~4 사이의 정수를 입력하세요");
					System.out.println("");
				}
			} // while try catch - select

		} // while(flag)

		sc.close();
	}
}
