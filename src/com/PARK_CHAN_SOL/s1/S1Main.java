package com.PARK_CHAN_SOL.s1;

public class S1Main {

	public static void main(String[] args) {

//		Object obj = new Object();
//		Test test = new Test();
//		System.out.println(obj.toString());
//		System.out.println(test.toString());
//		System.out.println(test);
//		System.out.println(String.CASE_INSENSITIVE_ORDER);
		
		//String name = new String("sol");
//		String name = "sol";
//		System.out.println(name.toString());
//		System.out.println(name);
		
		int[] testArr = new int[0];
		
		testArr = StackStudy.add(testArr);
		testArr = StackStudy.add(testArr);
		testArr = StackStudy.add(testArr);
		testArr = StackStudy.add(testArr);
		testArr = StackStudy.add(testArr);
		testArr = StackStudy.add(testArr);
		
		for(int i = 0; i < testArr.length; i++) {
			System.out.print(testArr[i]);			
		}
		
		System.out.println("");
		testArr = StackStudy.remove(testArr);
		
		for(int i = 0; i < testArr.length; i++) {
			System.out.print(testArr[i]);			
		}
		
		System.out.println("");
		testArr = StackStudy.remove(testArr);
		
		for(int i = 0; i < testArr.length; i++) {
			System.out.print(testArr[i]);			
		}
		
		System.out.println("");
		testArr = QueStudy.remove(testArr);
		
		for(int i = 0; i < testArr.length; i++) {
			System.out.print(testArr[i]);			
		}
		
		
		
	}

}
