package com.PARK_CHAN_SOL.study1;

public class Study3 {
	public static void main(String[] args) {
		// 연산자: +, -, *, /, %
		// + 산술연산자
		// + 연결연산자: 문자열 + primitive => 문자열

		// sysout + Ctrl + Space
		System.out.println("1" + 1);
		System.out.println(1 + "1" + 1);

		// a가 2byte char타입 => 4byte int 타입에 더해지며 자동 형변환
		System.out.println(1 + 'a' + "1"); // 981

		// 물건을 고르고, 물건의 총합계, 돈을 내고,
		int total = 25760;
		int don = 50000;

		// 잔돈 계산
		int jandon = don - total;

		// 만원 개수를 담을 변수
		int man = 0;
		int chun = 0;
		int bak = 0;
		int sip = 0;
		int il = 0;

		man = jandon / 10000;
//		chun = (jandon - 10000 * man) / 1000;
//		bak = (jandon - 10000 * man - 1000 * chun) / 100;
//		sip = (jandon - 10000 * man - 1000 * chun - 100 * bak) / 10;
//		il = (jandon - 10000 * man - 1000 * chun - 100 * bak - 10 * sip) / 1;
		chun = jandon % 10000 / 1000;
		bak = jandon % 1000 / 100;
		sip = jandon % 100 / 10;
		il = jandon % 10 / 1;
		System.out.println("잔돈: " + jandon);
		System.out.println("만원: " + man + "장");
		System.out.println("천원: " + chun + "장");
		System.out.println("백원: " + bak + "장");
		System.out.println("십원: " + sip + "장");
		System.out.println("일원: " + il + "장");

//		System.out.println("상품 가격: " + total + "원");
//		System.out.println("지불한 금액: " + don + "원");
//		int money = 10000;
//		if (jandon > 0) {
//			System.out.println("잔돈: " + jandon + "원");
//			for (int i = 0; i < 5; i++) {
//				int jd = jandon / money;
//				jandon = jandon % money;
//				if (money >= 1000) {
//					System.out.print(money + "원: " + jd + "장    ");
//				} else {
//					System.out.print(money + "원: " + jd + "개    ");
//				}
//
//				money = money / 10;
//			}
//		} else if (jandon == 0) {
//			System.out.print("정확한 금액을 지불하셨습니다.");
//		} else {
//			System.out.print("금액을 " + -jandon + "원 더 지불하셔야합니다.");
//		}
	}
}
