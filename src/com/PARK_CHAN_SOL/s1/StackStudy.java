package com.PARK_CHAN_SOL.s1;

import java.util.Random;

public class StackStudy {

	public static int[] add(int[] intArr) {
		// 받은 배열에서 하나의 임의의 데이터를 추가
		// 제일 앞에 추가
		// 추가된 배열을 리턴
		int[] tmpArr = new int[intArr.length+1];
		for (int i = 0; i < intArr.length; i++) {
			tmpArr[i + 1] = intArr[i];
		}
		Random random = new Random();
		tmpArr[0] = (random.nextInt(10)+1);
		intArr = tmpArr;
		return intArr;
	}

	public static int[] remove(int[] intArr) {
		// 맨앞의 요소를 삭제하고
		// 삭제된 배열을 리턴
		int[] tmpArr = new int[intArr.length-1];
		for (int i = 0; i < intArr.length-1; i++) {
			tmpArr[i] = intArr[i+1];
		}
		intArr = tmpArr;
		return intArr;
	}
}
