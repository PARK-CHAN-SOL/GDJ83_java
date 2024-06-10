package com.sol.s2.util.collections.ex3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
//import java.util.ArrayList;
//import java.util.LinkedList;
//import java.util.Vector;

public class Collection1 {

	public List<Integer> makeList() {
//		ArrayList<Integer> ar = new ArrayList<Integer>();
//		LinkedList<Integer> ar = new LinkedList<Integer>();
		ArrayList<Integer> ar = new ArrayList<Integer>();
		ar.add(1);
		ar.add(2);
		
		return ar;
	}
	
	public Map<String, Integer> makeMap(){
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		return map;
	}
}
