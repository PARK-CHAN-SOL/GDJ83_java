package com.sol.s2.util.collections.ex;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class ProductService {
	private StringBuffer sb;
	
	public ProductService() {
		this.sb = new StringBuffer();
		this.sb.append("50000, 아이폰, 50,");
		this.sb.append("45000, 갤럭시, 100,");
		this.sb.append("30000, 노키아, 20");
	}
	
	//init 메서드로 데이터를 파싱해서 ProductDTO객체에 집어넣는다.
	//만든 ProductDTO 객체는 ArrayList에 모은다
	public ArrayList<ProductDTO> init(){
		StringTokenizer st = new StringTokenizer(this.sb.toString(),",");
		ArrayList<ProductDTO> pDTOs = new ArrayList<ProductDTO>();
		while(st.hasMoreElements()) {
			ProductDTO pDTO = new ProductDTO();
			pDTO.setPrice(Integer.parseInt(st.nextToken().trim()));
			pDTO.setName(st.nextToken().trim());
			pDTO.setStock(Integer.parseInt(st.nextToken().trim()));
			pDTOs.add(pDTO);
		}
		return pDTOs;
	}
	
	// 기존의 가방에다가 새상품을 추가
	public void addProduct(BufferedReader br, ArrayList<ProductDTO> pDTOs) throws IOException {
		System.out.println("*****제품추가*****");
		ProductDTO pDTO = new ProductDTO();
		System.out.println("가격을 입력하세요");
		pDTO.setPrice(Integer.parseInt(br.readLine().trim()));
		System.out.println("품명을 입력하세요");
		pDTO.setName(br.readLine().trim());
		System.out.println("재고를 입력하세요");
		pDTO.setStock(Integer.parseInt(br.readLine().trim()));
		pDTOs.add(pDTO);
	}
	
	// 기존의 가방을 받아서 삭제, 물건의 이름을 입력받아서 삭제
	public int removeProduct(BufferedReader br, ArrayList<ProductDTO> pDTOs) throws IOException {
		System.out.println("*****제품삭제*****");
		System.out.println("제거할 품목을 입력하세요");
		String s = br.readLine();
		for(int i = 0; i < pDTOs.size(); i++) {
			if(s.equals(pDTOs.get(i).getName())) {
				pDTOs.remove(i);
				return 1;
			}
		}
//		System.out.println("해당 품목은 존재하지 않습니다");
		return 0;
	}
	
}
