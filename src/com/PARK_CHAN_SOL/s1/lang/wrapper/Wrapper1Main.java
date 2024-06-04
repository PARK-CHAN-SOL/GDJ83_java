package com.PARK_CHAN_SOL.s1.lang.wrapper;

public class Wrapper1Main {

	public static void main(String[] args) {

		System.out.println(Integer.BYTES);
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.SIZE);

		System.out.println(Double.BYTES);
		System.out.println(Double.MAX_VALUE);
		System.out.println(Double.MIN_VALUE);
		System.out.println(Double.SIZE);

		Integer i = new Integer("10");
		int num = 10;
		i = new Integer(num);

		int n = Integer.parseInt("2147483647");
		double d = Double.parseDouble("3.12");
		long l = Long.parseLong("50000000000000000");

		// wrapper
		num = 10;
		//auto boxing
		Integer n1 = num;
		
		// auto unboxing
		num = n1;
		
		Double d1 = 3.12;
		
		n1 = (int)3.12;

	}

}
