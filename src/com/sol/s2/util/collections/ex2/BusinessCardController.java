package com.sol.s2.util.collections.ex2;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class BusinessCardController {
	private Scanner sc;
	public BusinessCardController() {
		sc = new Scanner(System.in);
	}

	// 1. 전체정보출력
	// 2. 신규명함추가
	// 3. 명함검색
	// 4. 명함제거
	// 5. 프로그램종료
	public void start() {
		BusinessCardService bcs = new BusinessCardService();
		BusinessCardView bcv = new BusinessCardView();
		ArrayList<BusinessCardDTO> bDTOs = bcs.init();

		int flag = 0;
		while (flag != 5) {
			while (true) {
				try {
					System.out.println("1.전체정보출력 2.신규명함추가 3.명함검색 4.명함제거 5.프로그램종료");
					flag = sc.nextInt();
					if (flag != 1 && flag != 2 && flag != 3 && flag != 4 && flag != 5) {
						throw new InputMismatchException();
					}
					break;
				} catch (InputMismatchException e) {
					sc = new Scanner(System.in);
					System.out.println("잘못입력하셨습니다1");
				}
			}

			if (flag == 1) {
				bcv.view(bDTOs);
			} else if (flag == 2) {
				bcs.addBusinessCard(sc, bDTOs);
			} else if (flag == 3) {
				bcv.view(sc, new String(), bDTOs);
			} else if (flag == 4) {
				int remove = bcs.removeBusinessCard(sc, bDTOs);
				if (remove == 1) {
					System.out.println("\n제거 완료\n");
				} else {
					System.out.println("\n해당 이름이 존재하지 않습니다\n");
				}
			} else {
				System.out.println("\n프로그램종료");
			}
		}
	}
}
