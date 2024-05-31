package com.PARK_CHAN_SOL.s4;

public class Customer {
	int money;
	int point;

	// 가진 돈에서 물건의 가격을 뺌
	// 가진 포인트에 물건의 포인트를 더함
	public void buy(Product product) {
		this.money -= product.price;
		this.point += product.point;
		
		System.out.println("남은 돈: " + money);
		System.out.println("현재 포인트: " + point);
	}
}
