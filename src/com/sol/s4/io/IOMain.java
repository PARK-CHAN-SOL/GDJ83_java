package com.sol.s4.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class IOMain {

	public static void main(String[] args){
		// bit를 받는다
		InputStream is = System.in;
		
		// 문자를 처리한다
		InputStreamReader ir = new InputStreamReader(is);
		
		// 문자열을 처리한다
		BufferedReader br = new BufferedReader(ir);
		// 입력받을 준비가 끝
		
		System.out.println("입력하세요");
		String s = "";
		
		try {
			s = br.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(s);
	}

}
