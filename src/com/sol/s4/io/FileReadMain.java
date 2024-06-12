package com.sol.s4.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReadMain {

	public static void main(String[] args) {

		File file = new File("C:\\study", "Study.java");

		FileReader fr = null;
		BufferedReader br = null;
		try {
			fr = new FileReader(file);
			br = new BufferedReader(fr);

			while (true) {
				String s = br.readLine();
				if (s == null) break;
				System.out.println(s);
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// 연결된 순서의 역순으로 끊어준다
			try {
				br.close();
				fr.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("종료");
		}
	}

}
