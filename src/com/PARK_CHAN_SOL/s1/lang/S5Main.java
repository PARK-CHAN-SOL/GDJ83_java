package com.PARK_CHAN_SOL.s1.lang;

public class S5Main {

	public static void main(String[] args) {

		String name = "\t\tw  i nter ";
		System.out.println(name);
		System.out.println("name.length(): " + name.length());
		name = name.trim();
		System.out.println(name);
		System.out.println("name.length(): " + name.length());

		name = name.replace(" ", "");
		System.out.println(name);
		System.out.println("name.length(): " + name.length());

		name = "winter-24*서울";
		
		//파싱(parsing)
		name = name.replace("*", "-");
		String[] datas = name.split("-");
		

		for (int i = 0; i < datas.length; i++) {
			System.out.println(datas[i]);
		}
		String vOf = String.valueOf(3.14159);
		System.out.println(vOf);
	}

}
