package com.sol.s2.util.collections;

import java.util.HashMap;
import java.util.Iterator;

public class MapMain1 {

	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<String, Integer>();

		System.out.println(map.isEmpty());

		map.put("k1", 1);
		map.put("k2", 2);

		System.out.println(map.get("k1"));
		System.out.println(map.size());
		System.out.println(map.containsKey("k1"));
		System.out.println(map.containsValue(1));
		System.out.println(map);
		
//		map.remove("k2", 3); // key value 다 맞아야 지워짐
		map.clear(); // key value 전체 삭제
		
		Iterator<String> iter = map.keySet().iterator();

		while (iter.hasNext()) {
			String k = iter.next();
			Integer v = map.get(k);
			System.out.println(k + ": " + v);
		}
	}

}
