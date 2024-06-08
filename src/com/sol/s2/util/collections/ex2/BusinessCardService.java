package com.sol.s2.util.collections.ex2;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.regex.Pattern;

public class BusinessCardService {

	private StringBuffer sb;

	public BusinessCardService() {
		sb = new StringBuffer();
		sb.append("김철수 구디 010-1234-5678 abc@naver.com");
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
			String phoneNum = sc.next();
			boolean regexChk = Pattern.matches("^01([0|1|6|7|8|9])-([0-9]{3,4})-([0-9]{4})+$", phoneNum);
			if(!regexChk) {
				regexChk = Pattern.matches("^\\+82-01([0|1|6|7|8|9])-([\\d]{3,4})-([\\d]{4})+$", phoneNum);
			}
			if(!regexChk) {
				regexChk = Pattern.matches("^\\+82-10-([\\d]{3,4})-([\\d]{4})+$", phoneNum);
			}
			if (!regexChk) {
				System.out.println("잘못입력하셨습니다2");
				continue;
			}
			bDTO.setPhone(phoneNum);
			break;
		}
		while (true) {
			System.out.print("이메일을 입력하세요 (abc@dddd.com)\n:");
			String emailAddress = sc.next();
			
			boolean regexChk = Pattern.matches("\\w+@\\w+.\\w+(\\.\\w+)?", emailAddress);
			if(!regexChk) {
				System.out.println("잘못입력하셨습니다3");
				continue;
			}
			bDTO.setEmail(emailAddress);
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
