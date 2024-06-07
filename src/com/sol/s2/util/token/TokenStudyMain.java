package com.sol.s2.util.token;

import java.util.StringTokenizer;

public class TokenStudyMain {

	public static void main(String[] args) {
		String names = "winter,25, iu,30, hani,29,  철수,18, 영희,20";
		StringTokenizer st = new StringTokenizer(names, ",");
		System.out.println(st.countTokens());
		
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken().trim());
			System.out.println(st.nextToken().trim());
		}
		
		String[] n = names.split(",");
	}

}
