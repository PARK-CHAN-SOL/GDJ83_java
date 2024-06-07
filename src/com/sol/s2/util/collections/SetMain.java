package com.sol.s2.util.collections;

import java.util.HashSet;

import com.sol.s2.util.collections.ex.ProductDTO;

public class SetMain {

	public static void main(String[] args) {
		
		// 중복된 값이 없어야할 때 Set을 쓴다
		HashSet<String> hs = new HashSet<String>();
		
		hs.add("메롱");
		hs.add("두번째메롱");
		hs.add("세번째메롱");
		hs.add("메롱");
		
		HashSet<ProductDTO> hs2 = new HashSet<ProductDTO>();
		
		ProductDTO productDTO = new ProductDTO();
		ProductDTO productDTO2 = new ProductDTO();
		productDTO2 = productDTO;
		hs2.add(productDTO);
		hs2.add(productDTO2);
		
		System.out.println(hs2);

	}

}
