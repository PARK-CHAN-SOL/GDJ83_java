package com.PARK_CHAN_SOL.s2;

public class MidStudent extends Student{
	private int history;

	public MidStudent() {
		super(10);
	}
	
	public void midInfo() {
//		부모 객체의 num 멤머 변수가 private으로 선언되어있기 때문에
//		자식 객체에서 num을 사용할 때도 getter 메서드를 사용해야한다.
//		System.out.println(this.num);
//		System.out.println(this.getNum());
		
//		this.info();
		super.info();
		System.out.println(this.history);
	}
	
	public int getHistory() {
		return history;
	}

	public void setHistory(int history) {
		this.history = history;
	}
}
