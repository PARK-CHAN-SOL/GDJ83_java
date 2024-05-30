package com.PARK_CHAN_SOL.study3.student;

import java.util.InputMismatchException;
import java.util.Scanner;

public class StudentService {

	// findByNum 일치하는 학생의 객체를 리턴

	public Student[] findByNum(Student[] students, Scanner sc) {
		if(students == null) {
			return students;
		}
		int count = 0;
		int yourNum = 0;
		Student[] studentsFound = new Student[students.length];

		while (true) {
			try {
				System.out.println("");
				System.out.println("찾으려고 하는 학생의 번호를 입력하세요 (1이상의 정수)");
				System.out.print(": ");
				yourNum = sc.nextInt();
				sc.nextLine();
				if (yourNum <= 0) {
					throw new InputMismatchException();
				}
				break;
			} catch (InputMismatchException e) {
				sc = new Scanner(System.in);
			}
		} //whlie try catch - yourNum
		
		
		for(int i = 0; i < students.length; i++) {
			if(yourNum == students[i].num) {
				studentsFound[count] = students[i];
				count++;
			}
		}
		
		students = new Student[count];
		if (count == 0) {
			students = null;
		}
		for(int i = 0; i < count; i++) {
			students[i] = studentsFound[i];
		}
		

		return students;
	}

	public Student[] makeStudent(Scanner sc) {
		System.out.println("");
		System.out.println("학생의 수를 입력하세요");
		System.out.print(": ");
		int num;

		while (true) {
			try {
				num = sc.nextInt();
				sc.nextLine();
				if (num < 0) {
					throw new InputMismatchException();
				}
				break;
			} catch (InputMismatchException e) {
				sc = new Scanner(System.in);
//				System.out.println("");
//				System.out.println("잘못 입력하셨습니다");
//				System.out.println("0 이상의 숫자를 입력하세요");
//				System.out.print(": ");
			}
		} // while try catch - num

//		// 학생 수 만큼 정수배열을 만들어서 return
//		int[] result = new int[num];
//		return result;

		// 학생 한명을 생성해서 리턴
//		Student st = new Student();
//		return st;

		// 학생 수만큼 학생들을 리턴 (아래와 유사)
		// Student students[0];
		// Student students[1];
		// Student students[2];
		// ...
		// Student students[num];
		Student[] students = new Student[num];

		for (int i = 0; i < students.length; i++) {
			Student s = new Student();

			System.out.println("");
			System.out.print(i + 1 + " 번째 이름 입력\t: ");
			s.name = sc.next();

			while (true) {
				try {
					System.out.print(s.name + "의 번호 입력\t: ");
					s.num = sc.nextInt();
					sc.nextLine();
					if (s.num <= 0) {
						throw new InputMismatchException();
					}
					break;
				} catch (InputMismatchException e) {
					sc = new Scanner(System.in);
				}
			} // while try catch - s.num

			while (true) {
				try {

					System.out.print(s.name + "의 국어 점수 입력\t: ");
					s.kor = sc.nextInt();
					sc.nextLine();

					break;
				} catch (InputMismatchException e) {
					sc = new Scanner(System.in);
				}
			} // while try catch - s.kor

			while (true) {
				try {

					System.out.print(s.name + "의 영어 점수 입력\t: ");
					s.eng = sc.nextInt();
					sc.nextLine();

					break;
				} catch (InputMismatchException e) {
					sc = new Scanner(System.in);
				}
			} // while try catch - s.eng

			while (true) {
				try {

					System.out.print(s.name + "의 수학 점수 입력\t: ");
					s.math = sc.nextInt();
					sc.nextLine();

					break;
				} catch (InputMismatchException e) {
					sc = new Scanner(System.in);
				}
			} // while try catch - s.math
			System.out.println("");

			s.total = s.kor + s.eng + s.math;
			s.avg = s.total / 3.0;

			students[i] = s;
		}

//		sc.close();
		return students;
	}

}
