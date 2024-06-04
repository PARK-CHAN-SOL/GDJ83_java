package com.PARK_CHAN_SOL.s1.lang.wrapper;

import java.io.BufferedReader;
//import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
//import java.io.OutputStreamWriter;

public class Wrapper2Main {

	public static void main(String[] args) throws IOException {

		// 비번 길이는 최소 6자 이상
		// 대소문자, 숫자 1개 이상
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

//		bw.write("pw를 입력\n");
//		bw.flush();

		StringBuffer sb = new StringBuffer();

		sb.append("pw를 입력");
		System.out.println(sb.toString());
		sb.delete(0, sb.length());

		String pw = br.readLine();
		int upperCount = 0;
		int lowerCount = 0;
		int digitCount = 0;

		for (int i = 0; i < pw.length(); i++) {
			if (Character.isUpperCase(pw.charAt(i))) {
				upperCount++;
			} else if (Character.isLowerCase(pw.charAt(i))) {
				lowerCount++;
			} else if (Character.isDigit(pw.charAt(i))) {
				digitCount++;
			}
		}

		if (upperCount == 0 || lowerCount == 0 || digitCount == 0) {
//			bw.write("적어도 하나의 대문자를 사용하세요\n");
			sb.append("적어도 하나이상의 대문자, 소문자, 숫자를 사용하세요");
		} else {
//			bw.write("pw입력 완료\n");
			sb.append("pw입력 완료");
		}
		System.out.println(sb.toString());
		sb.delete(0, sb.length());

//		bw.flush();

//		bw.close();

	}

}
