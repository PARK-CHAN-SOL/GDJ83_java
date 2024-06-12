package com.sol.s4.io.ex1;

import java.util.ArrayList;

public class Ex1Main {

	public static void main(String[] args) {

		ReadStudy rs = new ReadStudy();
		try {
			ArrayList<MenuDTO> mDTOs = (ArrayList<MenuDTO>)rs.read();
			for(MenuDTO mDTO:mDTOs) {
				System.out.print(mDTO.getMenuName() + " ");
				System.out.print(mDTO.getPrice() + " ");
				System.out.println(mDTO.getKcal());
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
