package com.sol.s2.util.token;

import java.util.StringTokenizer;

public class TokenStudy2Main {

	public static void main(String[] args) {
		String name = "a-b-c";

		StringTokenizer st = new StringTokenizer(name);

		while (st.hasMoreTokens()) {
			System.out.println(st.nextToken("-"));
		}
	}

}
