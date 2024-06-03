package com.PARK_CHAN_SOL.s1.lang;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class S1Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		// import 생략:
		// 1. 같은 패키지 내에 있는 클래스를 사용할 때
		// 2. java.lang 내의 클래스를 사용할 때

//		Object obj = new Object();
//		Object obj2 = new Object();
		String n = new String("winter");
//		String n2 = "n2n2n2n2n2n2";
		
//		System.out.println(obj);
		
		//int index --> 배열,String은 문자 배열이다
//		System.out.println(n2.charAt(0));
		
		bw.write("문자열 입력\n");
		bw.flush();
		n = br.readLine();
		
		for(int i = 0; i < n.length(); i++) {
//			System.out.println(n.charAt(i));	
			bw.write(n.charAt(i) + "\n");
		}
		bw.write(n.length()*1000 + "원\n");
		bw.flush();
		bw.close();
	}

}
