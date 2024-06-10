package com.sol.s3.exceptions;

public class Exception2 {
	public void hap(int n1, int n2) throws Exception{
		// 3살 아가가 더하기를 한다 - 3자리수 이상은 몰라요
		// 59, 68
		int h = n1 + n1;
		if (h > 99) throw new MyException("3자리수는 몰라요 ㅠㅠ");
	}
}
