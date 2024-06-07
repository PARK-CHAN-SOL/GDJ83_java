package com.sol.s2.util.collections;

import java.util.ArrayList;
import java.util.LinkedList;

public class ListMain1 {

	public static void main(String[] args) {
		ArrayList ar = new ArrayList();
		String name = "winter";
		int num = 2;

		// 다형성
		ar.add(name); 	// 							0
		ar.add(num); 	// autoBoxing -> Integer 	1
		ar.add(3.12); 	// autoBoxing -> Double 	2
		ar.add('a'); 	// autoBoxing -> Character 	3
		ar.add(false); 	// autoBoxing -> Boolean 	4
		ar.add(num);	// 중복된 값을 허용				5
		
		ar.add(1, "test"); 	// 삽입
		
		ar.set(0, 'c');		// 수정
		
		ar.remove(0);	// 해당 인덱스에 있는 녀석을 지워라
//		ar.remove(주소(Object));	// 같은 주소를 가진 녀석을 지워라

		ar.clear(); 	// 전체 삭제
		for (int i = 0; i < ar.size(); i++) {
			System.out.println(ar.get(i));
		}
		
		LinkedList lk = new LinkedList();
		lk.add(name);
		
		for (int i = 0; i < lk.size(); i++) {
			System.out.println(lk.get(i));
		}
	}

}
