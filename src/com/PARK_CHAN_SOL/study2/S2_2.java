package com.PARK_CHAN_SOL.study2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class S2_2 {
	public static void main(String[] args) {
		// 프로그램이 시작하고 숫자 입력
		// 1. 학생 정보 입력, 2. 학생 정보 출력, 3. 프로그램 종료

		Scanner sc = new Scanner(System.in);

		int pc = 1;
		int numStudents = 100000;
		int[] studentId = new int[numStudents];
		String[] studentNames = new String[numStudents];
		int[] korScores = new int[numStudents];
		int[] engScores = new int[numStudents];
		int[] mathScores = new int[numStudents];
		int[] totals = new int[numStudents];
		double[] avgs = new double[numStudents];

//		int[] studentId = null;
//		String[] studentNames = null;
//		int[] korScores = null;
//		int[] engScores = null;
//		int[] mathScores = null;
//		int[] totals = null;
//		double[] avgs = null;

		int i = 0;
		int searchIndex = 0;

		while (pc != 5) {
			while (true) {
				if (i == numStudents) {
					System.out.println("허용 가능한 학생 수를 초과하였습니다");
					System.out.println("프로그램을 종료합니다.");
					sc.close();
					return;
				}
				try {
					System.out.println("1. 학생 정보 입력, 2. 학생 정보 출력, 3. 학생 정보 검색, 4. 성적순 출력, 5. 프로그램 종료");
					System.out.print(": ");
					pc = sc.nextInt();
					sc.nextLine();
					if (pc != 1 && pc != 2 && pc != 3 && pc != 4 && pc != 5) {
						throw new InputMismatchException();
					}
					break;
				} catch (InputMismatchException e) {
					sc = new Scanner(System.in);
					System.out.println("");
					System.out.println("잘못 입력하셨습니다");
					System.out.println("");
					System.out.print("숫자를 다시 입력하세요: ");
					System.out.println("");
				}
			} // while try catch - pc

			if (pc == 1) {
				studentId[i] = i + 1;
				System.out.println("");
				System.out.print((i + 1) + "번째 학생의 이름: ");
				studentNames[i] = sc.next();
				while (true) {
					if (studentNames[i].length() > 4) {
						System.out.println("이름이 너무 깁니다.");
						System.out.println("4자 이하로 작성하세요");
						continue;
					}
					break;
				}
				System.out.print((i + 1) + "번째 학생의 국어점수: ");

				while (true) {
					try {
						korScores[i] = sc.nextInt();
						break;
					} catch (InputMismatchException e) {
						sc = new Scanner(System.in);
						System.out.println("");
						System.out.println("잘못 입력하셨습니다");
						System.out.println("");
						System.out.print("숫자를 다시 입력하세요: ");
						System.out.println("");
					}
				} // while try catch - korScores

				System.out.print((i + 1) + "번째 학생의 영어점수: ");

				while (true) {
					try {
						engScores[i] = sc.nextInt();
						break;
					} catch (InputMismatchException e) {
						sc = new Scanner(System.in);
						System.out.println("");
						System.out.println("잘못 입력하셨습니다");
						System.out.println("");
						System.out.print("숫자를 다시 입력하세요: ");
						System.out.println("");
					}
				} // while try catch - engScores

				System.out.print((i + 1) + "번째 학생의 수학점수: ");

				while (true) {
					try {
						mathScores[i] = sc.nextInt();
						break;
					} catch (InputMismatchException e) {
						sc = new Scanner(System.in);
						System.out.println("");
						System.out.println("잘못 입력하셨습니다");
						System.out.println("");
						System.out.print("숫자를 다시 입력하세요: ");
						System.out.println("");
					}
				} // while try catch - mathScores
				totals[i] = korScores[i] + engScores[i] + mathScores[i];
				avgs[i] = totals[i] / 3.0;
				i++;
				// if (pc == 1)
			} else if (pc == 2) {
				System.out.println("");
				System.out.println("번호\t 이름 \t국어 점수\t영어 점수\t수학 점수\t 총점\t 평균");
				for (int j = 0; j < i; j++) {
					System.out.print(" " + studentId[j] + "\t");
					System.out.print(" " + studentNames[j] + "\t");
					System.out.print(" " + korScores[j] + "\t");
					System.out.print(" " + engScores[j] + "\t");
					System.out.print(" " + mathScores[j] + "\t");
					System.out.print(" " + totals[j] + "\t");
					System.out.println(" " + avgs[j] + "\t");
				}
				System.out.println("");
				System.out.println("출력 종료");
				System.out.println("");
				// else if(pc == 2)
			} else if (pc == 3) {
				while (true) {
					try {
						System.out.println("정보를 출력할 학생의 번호를 입력하세요");
						System.out.print(": ");
						searchIndex = sc.nextInt();
						sc.nextLine();
						if (searchIndex > (i - 1)) {
							System.out.println("");
							System.out.println("해당 번호를 가진 학생은 존재하지 않습니다.");
							System.out.println("");
							break;
						}
						System.out.println("");
						System.out.println("번호\t 이름 \t국어 점수\t영어 점수\t수학 점수\t 총점\t 평균");
						System.out.print(" " + studentId[searchIndex - 1] + "\t");
						System.out.print(" " + studentNames[searchIndex - 1] + "\t");
						System.out.print(" " + korScores[searchIndex - 1] + "\t");
						System.out.print(" " + engScores[searchIndex - 1] + "\t");
						System.out.print(" " + mathScores[searchIndex - 1] + "\t");
						System.out.print(" " + totals[searchIndex - 1] + "\t");
						System.out.println(" " + avgs[searchIndex - 1] + "\t");
						System.out.println("");
						System.out.println("검색 종료");
						System.out.println("");
						break;
					} catch (InputMismatchException e) {
						sc = new Scanner(System.in);
						System.out.println("");
						System.out.println("잘못 입력하셨습니다");
						System.out.println("");
						System.out.print("숫자를 다시 입력하세요: ");
						System.out.println("");
					}
				} // while try catch - searchIndex
					// else if(pc == 3)
			} else {// (pc == 4)
				int[] studentIdTmp = new int[i];
				String[] studentNamesTmp = new String[i];
				int[] korScoresTmp = new int[i];
				int[] engScoresTmp = new int[i];
				int[] mathScoresTmp = new int[i];
				int[] totalsTmp = new int[i];
				double[] avgsTmp = new double[i];

				for (int j = 0; j < i; j++) {
					studentIdTmp[j] = studentId[j];
					studentNamesTmp[j] = studentNames[j];
					korScoresTmp[j] = korScores[j];
					engScoresTmp[j] = engScores[j];
					mathScoresTmp[j] = mathScores[j];
					totalsTmp[j] = totals[j];
					avgsTmp[j] = avgs[j];
				}
				for (int j = 0; j < i - 1; j++) {
					for (int k = 0; k < i - 1 - j; k++) {
						if (totalsTmp[k] < totalsTmp[k + 1]) {
							int tmp = studentIdTmp[k];
							studentIdTmp[k] = studentIdTmp[k + 1];
							studentIdTmp[k + 1] = tmp;

							String tmps = studentNamesTmp[k];
							studentNamesTmp[k] = studentNamesTmp[k + 1];
							studentNamesTmp[k + 1] = tmps;

							tmp = korScoresTmp[k];
							korScoresTmp[k] = korScoresTmp[k + 1];
							korScoresTmp[k + 1] = tmp;

							tmp = engScoresTmp[k];
							engScoresTmp[k] = engScoresTmp[k + 1];
							engScoresTmp[k + 1] = tmp;

							tmp = mathScoresTmp[k];
							mathScoresTmp[k] = mathScoresTmp[k + 1];
							mathScoresTmp[k + 1] = tmp;

							tmp = totalsTmp[k];
							totalsTmp[k] = totalsTmp[k + 1];
							totalsTmp[k + 1] = tmp;

							double tmpd = avgsTmp[k];
							avgsTmp[k] = avgsTmp[k + 1];
							avgsTmp[k + 1] = tmpd;
						}
					}
				}
				System.out.println("");
				System.out.println("번호\t 이름 \t국어 점수\t영어 점수\t수학 점수\t 총점\t 평균");
				for (int j = 0; j < i; j++) {

					System.out.print(" " + studentIdTmp[j] + "\t");
					System.out.print(" " + studentNamesTmp[j] + "\t");
					System.out.print(" " + korScoresTmp[j] + "\t");
					System.out.print(" " + engScoresTmp[j] + "\t");
					System.out.print(" " + mathScoresTmp[j] + "\t");
					System.out.print(" " + totalsTmp[j] + "\t");
					System.out.println(" " + avgsTmp[j] + "\t");

				}
				System.out.println("");
				System.out.println("출력 종료");
				System.out.println("");
			}
		} // while(pc != 5)

		System.out.println("");
		System.out.println("프로그램 종료");
		sc.close();
	}// main
}// class
