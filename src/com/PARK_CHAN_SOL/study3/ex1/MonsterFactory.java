package com.PARK_CHAN_SOL.study3.ex1;

import java.util.Random;

public class MonsterFactory {

	public Monster createMonster() {
		Monster m = new Monster();
		return m;
	}

	public Monster[] createMonsterGroup() {
		
		Random random = new Random();
		int count = random.nextInt(5) + 2; // 2 ~ 6 사이 정수 난수 대입

		Monster[] monsters = new Monster[count];
		
		for (int i = 0; i < monsters.length; i++) {
			Monster m = new Monster();
			monsters[i] = m;
		}
		
		return monsters;
	}
}
