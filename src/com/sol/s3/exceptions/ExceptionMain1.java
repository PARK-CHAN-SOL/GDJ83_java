package com.sol.s3.exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionMain1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자 입력");
		
		try {
			int num = 10;
			int num2 = sc.nextInt();
			System.out.println(num / num2);
		} catch (ArithmeticException e) {
			System.out.println("0으로 나눌 수 없습니다");
		} catch (InputMismatchException e) {
			System.out.println("숫자 이외에는 입력하지 마세요");
		} catch (Exception e) {
			System.out.println("그만좀 하세요");
		} catch (Throwable e) {
			System.out.println("제발 그만좀 하세요 ㅠㅠ");
		}
		
		Exception1 ex1 = new Exception1();
		try {
			ex1.ex1(1);
		} catch (ArithmeticException e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
			System.out.println(e.getMessage());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Exception2 ex2 = new Exception2();
		try {
			ex2.hap(99, 99);			
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("프로그램 종료");
		sc.close();
	}

}
