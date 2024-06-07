package com.sol.s2.util.collections;

import java.util.HashSet;
import java.util.Iterator;

public class SetMain3 {

	public static void main(String[] args) {

		HashSet<Integer> ar = new HashSet<Integer>();
		ar.add(10);
		ar.add(8);
		ar.add(16);
		
		// Set에 있는 데이터를 꺼낼 때는 Iterator를 사용해서 꺼낸다
		Iterator<Integer> iter = ar.iterator();
		while(iter.hasNext()) {
			Integer num = iter.next();
			System.out.println(num);
		}
		
		System.out.println(ar);

	}

}
