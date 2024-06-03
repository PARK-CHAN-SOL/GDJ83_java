package com.PARK_CHAN_SOL.s1.lang;

public class S3Main {

	public static void main(String[] args) {

		String name = "finfal.ffpdffaafffaffafa";

		for (int i = 0; i < name.length();) {
			if (name.indexOf("f", i) != -1) {
				System.out.println(name.indexOf("f", i));
				i = name.indexOf("f", i) + 1;
			} else {
				break;
			}
		}
		System.out.println("for문 종료");

		int i = 0;
		while (true) {
			
			if (name.indexOf("f", i) == -1) break;
			
			System.out.println(name.indexOf("f", i));
			i = name.indexOf("f", i) + 1;
		}
		System.out.println("while문 종료");
	}

}
