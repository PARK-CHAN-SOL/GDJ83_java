package com.sol.s2.util.collections.ex3;

import java.util.List;
import java.util.Map;

public class Collection2 {
	public void useList(List<Integer> ar) {
		
//		// for(초기식;조건식;증감식){}
//		for(int i = 0; i < ar.size(); i++) {
//			System.out.println(ar.get(i));	
//		}
		
		// 향상된 for: for(꺼낼데이터타입 변수명 : collection의 참조변수명){}
		for(Integer num : ar) {
			System.out.println(num);
		}
		
	}
	
	public void useMap(Map<String, Integer> map) {
		map.get("");
	}
}
