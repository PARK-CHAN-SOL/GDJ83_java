package com.PARK_CHAN_SOL.study3.student;

public class StudentView {

	public void view(String str) {
		System.out.println(str);
	}

	public void view(Student student) {
		System.out.println(student.num);
		System.out.println(student.name);
	}


	public void view(Student[] students) {

		System.out.println("");
		if (students == null) {
			System.out.println("출력할 정보가 없습니다");
			return;
		}
		System.out.println("번호\t이름\t국어성적\t영어성적\t수학성적\t 총점\t  평균");
		for (int i = 0; i < students.length; i++) {
			System.out.print(students[i].num);
			System.out.print("\t");
			System.out.print(students[i].name);
			System.out.print("\t ");
			System.out.print(students[i].kor);
			System.out.print("\t ");
			System.out.print(students[i].eng);
			System.out.print("\t ");
			System.out.print(students[i].math);
			System.out.print("\t ");
			System.out.print(students[i].total);
			System.out.print("\t ");
			System.out.println(students[i].avg);

		}
	}
}
