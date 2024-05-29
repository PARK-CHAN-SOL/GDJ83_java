package com.PARK_CHAN_SOL.study3.ex1;

public class GameController {
	public void start() {
		//몬스터 생성 1마리, 3마리
		MonsterFactory mf = new MonsterFactory();
		Monster m = mf.createMonster();
		System.out.print(" ");
		System.out.print(m.name);
		System.out.print("\t");
		System.out.println(m.level);
		
		System.out.println("===========");
		Monster[] monsters = mf.createMonsterGroup();
		for(int i =0; i < monsters.length; i++) {
			System.out.print(" ");
			System.out.print(monsters[i].name);
			System.out.print("\t");
			System.out.println(monsters[i].level);
		}
	}
}
