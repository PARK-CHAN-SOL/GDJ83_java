package com.PARK_CHAN_SOL.s1.lang.buffer;

public class StringBuffer1Main {

	public static void main(String[] args) {
		// 문자열을 누적 하고 싶을 때
		StringBuffer sb = new StringBuffer();
		System.out.println(sb);
		
		sb.append("winter");
		System.out.println(sb);
		
		sb.append("iu");

		System.out.println(sb);
		
		sb.append(1012);
		System.out.println(sb);
		
		String result = sb.toString();
		System.out.println(result);
	}

}
