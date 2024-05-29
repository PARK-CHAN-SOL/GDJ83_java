package com.PARK_CHAN_SOL.study3.ex1;

public class RpgMain {

	public static void main(String[] args) {
		Monster gob1 = new Monster();
		gob1.hp = 15;
		gob1.level = 1;
		gob1.race = "goblin";
		gob1.exp = 10;
		gob1.name = "gob1";
		
		Weapon axe22 = new Weapon();
		axe22.atkDamage = 3;
		axe22.atkRange = 1;
		axe22.durability = 100;
		axe22.enchantLevel = 0;
		axe22.name = "이빨 빠진 도끼";
		
		gob1.axe = axe22;
		
		axe22 = new Weapon();
		axe22.name = "황금도끼";
		
//		gob1.axe.atkDamage = 3;
//		gob1.axe.atkRange = 1;
//		gob1.axe.durability = 100;
//		gob1.axe.enchantLevel = 0;
//		gob1.axe.name = "이빨 빠진 도끼";

		System.out.print("  이름\t: " + gob1.name + " (종족: " + gob1.race + ")" + "\t");
		System.out.println("  무기\t: " + gob1.axe.name);
		System.out.print("  레벨\t: " + gob1.level + "\t" + "\t" + "\t");
		System.out.println("  데미지\t: " + gob1.axe.atkDamage);
		System.out.print("  체력\t: " + gob1.hp + "\t" + "\t" + "\t");
		System.out.println("  사거리\t: " + gob1.axe.atkRange);
		System.out.print("  경험치\t: " + gob1.exp + "\t" + "\t" + "\t");
		System.out.println("  내구도\t: " + gob1.axe.durability);
		System.out.println("\t\t\t\t  강화\t: +" + gob1.axe.enchantLevel);
		System.out.println("");

		Monster gob2 = new Monster();
		gob2.axe = axe22; // gob2.axe.name => 황금도끼
		
	}

}
