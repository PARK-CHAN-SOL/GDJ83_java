package com.sol.s2.util.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;

public class SetMain2 {

	public static void main(String[] args) {

		// 로또 번호
		// 1 - 45 : 6개
		Random random = new Random();
		
		
		int[] ar = new int[6];
		
		
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i = 1; i <= 45; i++) {
			list.add(i);
		}
		
		for(int i = 0; i < ar.length; i++) {
			int num = random.nextInt(list.size()) + 1;
			ar[i] = list.get(num-1);
			list.remove(num-1);
			System.out.println(ar[i]);
		}
		
		HashSet<Integer> hs = new HashSet<Integer>();
		while(hs.size() != 6) {
			hs.add(random.nextInt(45) + 1);
		}
		System.out.println(hs);
	}

}
