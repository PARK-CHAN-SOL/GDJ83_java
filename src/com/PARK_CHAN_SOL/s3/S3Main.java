package com.PARK_CHAN_SOL.s3;

public class S3Main {

	public static void main(String[] args) {

		//배열 선언
		Tiger marine = new Tiger();
		marine.age = 5;
		marine.name = "호돌이";
		marine.power = 500;
		
		Penguin tank = new Penguin();
		tank.age = 3;
		tank.name = "펭수";
		tank.wing = 2;
		
		Animal animal = new Animal();
		animal = tank;
		
		// 드랍쉽에 담아도 데이터 유실은 안되는구나
		Animal[] dropShip = new Animal[8];
		dropShip[0] = tank;
		dropShip[1] = marine;
		
		// Penguin 타입인 애들만 (Penguin)으로 형변환 가능
		// Tiger 타입인 애들만 (Tiger)으로 형변환 가능
		Penguin ani = (Penguin)dropShip[0];
		Tiger ani2 = (Tiger)dropShip[1];
		
		System.out.print(dropShip[0].name);
		System.out.println(ani.wing);
		System.out.print(dropShip[1].name);
		System.out.println(ani2.power);

		
//		marine = (Tiger)dropShip; 
		
//		Animal a = new Animal();
//		
//		tiger = (Tiger)a;
		
		//Tiger[] dropShip = new Tiger[8];
		//dropShip[0] = marine;
		
		Eagle eagle = new Eagle();
		Airplane airplane = new Airplane();
		
		Fly fly = eagle;
		fly = airplane;
		

	}

}
