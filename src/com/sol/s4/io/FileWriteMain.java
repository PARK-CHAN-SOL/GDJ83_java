package com.sol.s4.io;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWriteMain {
	public static void main(String[] args) {
		// 문자열 -> 문자 -> 01
		Scanner sc = new Scanner(System.in);
		System.out.println("파일명을 입력");
		String fileName = sc.next();

		File file = new File("C:\\study", fileName);
		FileWriter fw = null;
		try {
			fw = new FileWriter(file, true);

			System.out.println("입력");
			// e, E가 입력되면 종료
			while (true) {
				String s = sc.next();
				if (s.equals("e") || s.equals("E")) break;
				fw.write(s + "\n");
			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				fw.close();
				sc.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		System.out.println("프로그램 종료");
	}
}
