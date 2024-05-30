package com.PARK_CHAN_SOL.study3.ex2;

public class Ex2Main {

	public static void main(String[] args) {
		Study study = new Study();
		int[] ar = { 1, 2, 3, 4, 5, 6 };

//		ar = study.add(ar);// 매개변수로 보내는 값 => 인자값

		ar = study.remove(ar);
		
		for (int i = 0; i < ar.length; i++) {
			System.out.println(ar[i]);
		}
		
	}

}
