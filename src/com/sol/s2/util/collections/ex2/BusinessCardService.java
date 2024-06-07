package com.sol.s2.util.collections.ex2;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class BusinessCardService {

	private StringBuffer sb;

	public BusinessCardService() {
		sb = new StringBuffer();
		sb.append("김철수 구디아카데미 010-1234-5678 abc@naver.com");
		sb.append(" 이영희 국정원 010-9999-9999 kkk@KIC.go.kr");
		sb.append(" 박박박 토스 010-7777-7777 parkpp@toss.com");
		sb.append(" 최양락 kbs 010-8888-6666 cyr@kbs.co.kr");
	}

	public ArrayList<BusinessCardDTO> init() {
		StringTokenizer st = new StringTokenizer(this.sb.toString());
		ArrayList<BusinessCardDTO> bDTOs = new ArrayList<BusinessCardDTO>();
		while (st.hasMoreTokens()) {
			BusinessCardDTO bDTO = new BusinessCardDTO();
			bDTO.setName(st.nextToken());
			bDTO.setCompany(st.nextToken());
			bDTO.setPhone(st.nextToken());
			bDTO.setEmail(st.nextToken());
			bDTOs.add(bDTO);
		}
		return bDTOs;
	}

	public void addBusinessCard(Scanner sc, ArrayList<BusinessCardDTO> bDTOs) {
		BusinessCardDTO bDTO = new BusinessCardDTO();

		System.out.print("이름을 입력하세요\n:");
		bDTO.setName(sc.next());
		System.out.print("회사명을 입력하세요\n:");
		bDTO.setCompany(sc.next());
		while (true) {
//			int flagPhone = 0;
			System.out.print("전화번호를 입력하세요 (000-0000-0000) \n:");
			StringTokenizer st = new StringTokenizer(sc.next(), "-");
			StringBuffer addSb = new StringBuffer();
			if (st.countTokens() != 3) {
				System.out.println("잘못입력하셨습니다2");
				continue;
			}
			addSb.append(st.nextToken().trim()).append("-").append(st.nextToken().trim()).append("-")
					.append(st.nextToken().trim());
//			if (addSb.length() != 13) {
//				System.out.println("잘못입력하셨습니다3");
//				addSb.delete(0, addSb.length());
//				continue;
//			}
//			for (int i = 0; i < addSb.length(); i++) {
//				if (i == 3 || i == 8) {
//					continue;
//				}
//				if (!(addSb.charAt(i) >= '0' && addSb.charAt(i) <= '9')) {
//					flagPhone = 1;
//					System.out.println("잘못입력하셨습니다4");
//					break;
//				}
//			}
//			if (flagPhone == 1) {
//				continue;
//			}
			bDTO.setPhone(sb.toString());
			break;
		}
		while (true) {
			System.out.print("이메일을 입력하세요 (abc@dddd.com)\n:");
			bDTO.setEmail(sc.next());
			break;
		}

		bDTOs.add(bDTO);
	}

	public int removeBusinessCard(Scanner sc, ArrayList<BusinessCardDTO> bDTOs) {
		BusinessCardDTO bDTO = new BusinessCardDTO();

		System.out.print("삭제할 이름을 입력하세요\n:");
		String name = sc.next();

		for (int i = 0; i < bDTOs.size(); i++) {
			if (name.equals(bDTOs.get(i).getName())) {
				bDTOs.remove(i);
				return 1;
			}
		}
		return 0;
	}

//		private String name;
//		private String company;
//		private String phone;
//		private String email;
//		private String address;

}
