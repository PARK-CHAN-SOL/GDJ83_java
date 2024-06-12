package com.sol.s4.io.ex1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class ReadStudy {
	
	public List<MenuDTO> read() throws Exception {
		//info.txt 파일 읽어오기
		//1. 읽어서 파싱 후 출력
		//2. 출력이 아니라 DTO들을 만들고 리턴
		File file = new File("C:\\study\\info.txt");
		FileReader fr = new FileReader(file); 
		BufferedReader br = new BufferedReader(fr);
		
		String s = br.readLine();
		StringTokenizer st = null;
		
		if(s != null) st = new StringTokenizer(s, ",");
		ArrayList<MenuDTO> mDTOs = new ArrayList<>();
		
		while(st.hasMoreTokens()) {
			MenuDTO menuDTO = new MenuDTO();
			menuDTO.setMenuName(st.nextToken().trim());
			menuDTO.setPrice(Integer.parseInt(st.nextToken().trim()));
			menuDTO.setKcal(Integer.parseInt(st.nextToken().trim()));
			mDTOs.add(menuDTO);
			s = br.readLine();
			if(s != null) st = new StringTokenizer(s, ",");
		}
		 
		br.close();
		fr.close();
		
		return mDTOs;
	}
}
