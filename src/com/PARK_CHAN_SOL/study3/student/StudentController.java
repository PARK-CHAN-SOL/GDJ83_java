package com.PARK_CHAN_SOL.study3.student;

import java.util.InputMismatchException;
import java.util.Scanner;

public class StudentController {
	public void start() {
//		System.out.println("STUDENT CONTROLLING");

		// S2_2
		// 1. 학생 정보 입력, 2. 학생 정보 출력, 3. 학생 검색, 4. 프로그램 종료
		Scanner sc = new Scanner(System.in);
		StudentService service = new StudentService();
		StudentView studentView = new StudentView();
		boolean flag = true;
		Student[] students = null;
		while (flag) {
			System.out.println("");
			System.out.println("1.학생정보입력  2.학생정보출력  3.학생검색  4.프로그램종료");
			System.out.print(": ");
			int select;

			while (true) {
				try {
					select = sc.nextInt();
					sc.nextLine();
					if (select == 1) {

						students = service.makeStudent(sc);

					} else if (select == 2) {
						
						studentView.view(students);

					} else if (select == 3) {

						studentView.view(service.findByNum(students, sc));
						
//						선생님이 작성한 코드
//						Student student = service.findByNum(students);
//						if (student != null) {
//							studentView.view2(student);
//						} else {
//							studentView.view3("검색 결과가 없습니다");
//						}

					} else if (select == 4) {

						System.out.println("프로그램 종료");
						flag = !flag;

					} else {

						throw new InputMismatchException();

					}

					break;
				} catch (InputMismatchException e) {
					sc = new Scanner(System.in);
//					System.out.println("잘못 입력하셨습니다");
//					System.out.println("1~4 사이의 정수를 입력하세요");
//					System.out.println("");
				}
			} // while try catch - select

		} // while(flag)

		sc.close();
	}
}
