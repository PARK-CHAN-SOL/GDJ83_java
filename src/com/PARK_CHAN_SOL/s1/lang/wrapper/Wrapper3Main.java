package com.PARK_CHAN_SOL.s1.lang.wrapper;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Wrapper3Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		bw.write("주민 번호 입력\n");
		bw.flush();

		StringTokenizer st = new StringTokenizer(br.readLine(), "-", true);

		// 1. 성별검증
		String id1 = st.nextToken();
		st.nextToken();
		String id2 = st.nextToken();

		if (id1.length() != 6) {
			bw.write("잘못 입력하셨습니다.");
			bw.close();
			br.close();
			return;
		} else if (id2.length() != 7 || Integer.parseInt(id2.substring(0, 1)) > 4) {
			bw.write("잘못 입력하셨습니다.1");
			bw.close();
			br.close();
			return;
		} else {
			for (int i = 0; i < id1.length(); i++) {
				if (!Character.isDigit(id1.charAt(i))) {
					bw.write("잘못 입력하셨습니다.2");
					bw.close();
					br.close();
					return;
				}
			}
			for (int i = 0; i < id2.length(); i++) {
				if (!Character.isDigit(id2.charAt(i))) {
					bw.write("잘못 입력하셨습니다.3");
					bw.close();
					br.close();
					return;
				}
			}
			int year = Integer.parseInt(id1.substring(0, 2));
			int month = Integer.parseInt(id1.substring(2, 4));
			int day = Integer.parseInt(id1.substring(4, 6));
			int age = Integer.parseInt(id2) / 1000000;

			if (age == 1 || age == 2) {
				year += 1900;
			} else {
				year += 2000;
			}

			if (month > 12 || month == 0) {
				bw.write("잘못 입력하셨습니다.4");
				bw.close();
				br.close();
				return;
			} else if (day > 31 || day == 0) {
				bw.write("잘못 입력하셨습니다.5");
				bw.close();
				br.close();
				return;
			} else if (month == 2 && day > 28) {

				// 윤년이 아니다
				if (!((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)) {
					bw.write("잘못 입력하셨습니다.6");
					bw.close();
					br.close();
					return;
				} else if (day > 29) {// 윤년이다
					bw.write("잘못 입력하셨습니다.7");
					bw.close();
					br.close();
					return;
				}

			} else if ((month == 4 || month == 6 || month == 9 || month == 11) && day > 30) {
//				bw.write("잘못 입력하셨습니다.8\n" + year + "\n" + month + "\n" + day);
				bw.write("잘못 입력하셨습니다.8");
				bw.close();
				br.close();
				return;
			}
			// 3. 주민번호 검증
			// 9 5 1 2 2 6 - 1 2 3 4 5 6 7(검증용 숫자)
			// *2 *3 *4 *5 *6 *7 *8 *9 *2 *3 *4 *5
			// 18 15 4 10 12 42 8 18 6 12 20 30
			// 다 더함 => 195
			// 총합을 11로 나눈 나머지를 구하기 = 8
			// 11에 나머지를 뺀 결과값을 검증용 숫자와 같은지 비교
			// 11 - 8 == 7 ??
			// 결과값이 2자리수 라면
			// 뺀 결과값을 10으로 나눈 나머지를 검증용 숫자와 같은지 비교
			int sum = 0;
			for (int i = 0; i < 6; i++) {
				sum = sum + Integer.parseInt(id1.substring(i, i + 1)) * (i + 2)
						+ Integer.parseInt(id2.substring(i, i + 1)) * (((i + 8) / 10) * 2 + (i + 8) % 10);
			}

			if ((11 - sum % 11) % 10 == Integer.parseInt(id2.substring(6, 7))) {
				bw.write("올바른 주민번호 형식입니다.\n");
			} else {
				bw.write("올바르지 않은 주민번호 형식입니다.\n");
				bw.close();
				br.close();
				return;
			}

			// 1. 성별 검증
			if (age % 2 == 1) {
				bw.write("남자입니다.\n");
			} else {
				bw.write("여자입니다.\n");
			}

			// 2. 나이 검증
			if (age == 1 || age == 2) {
				bw.write("나이는 " + (2024 - year) + "살 입니다.\n");
			} else {
				bw.write("나이는 " + (2024 - year) + "살 입니다.\n");
			}

		}
		bw.close();
		br.close();

	}

}
