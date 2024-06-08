package com.sol.s2.util.collections.ex2;

import java.util.ArrayList;
import java.util.Scanner;

public class BusinessCardView {

	public void view(ArrayList<BusinessCardDTO> bDTOs) {
		System.out.println("\n이름\t회사\t\t전화번호\t\t\t이메일");
		for (int i = 0; i < bDTOs.size(); i++) {
			view(bDTOs.get(i));
		}
		System.out.println("");
	}

	public void view(Scanner sc, String name, ArrayList<BusinessCardDTO> bDTOs) {
		System.out.print("찾으시는 이름을 입력하세요\n:");
		name = sc.next();
		
		for (int i = 0; i < bDTOs.size(); i++) {
			if (name.equals(bDTOs.get(i).getName())) {
				System.out.println("\n이름\t회사\t\t전화번호\t\t\t이메일");
				view(bDTOs.get(i));
				System.out.println("");
				return;
			}
		}
		
		System.out.println("\n해당 이름이 존재하지 않습니다\n");
	}

	public void view(BusinessCardDTO bDTO) {
		System.out.print(bDTO.getName()+"\t");
		System.out.print(bDTO.getCompany()+"\t\t");
		System.out.print(bDTO.getPhone()+"\t\t");
		System.out.println(bDTO.getEmail());
	}
}
