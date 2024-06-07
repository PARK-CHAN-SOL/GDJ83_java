package com.sol.s2.util.collections.ex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ProductMain {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		ProductService ps = new ProductService();
		ArrayList<ProductDTO> pDTOs = ps.init();
//		ps.addProduct(br, pDTOs);
		int result = ps.removeProduct(br, pDTOs);
		if(result == 0) {
			System.out.println("삭제실패");
		}else {
			System.out.println("삭제성공");
		}
//		for (int i = 0; i < pDTOs.size(); i++) {
//			System.out.println("가격: " + pDTOs.get(i).getPrice() + "\t");
//			System.out.println("품명: " + pDTOs.get(i).getName() + "\t");
//			System.out.println("재고: " + pDTOs.get(i).getStock() + "\t");
//			System.out.println("");
//		}
		
		br.close();

	}

}
