package com.sol.s6;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class StudentDAO {
	private File file;
	private FileReader fr;
	private BufferedReader br;
	private List<StudentDTO> sDTOs;
	
	public StudentDAO() throws FileNotFoundException {
		file = new File("C:\\study","ServerClientStudy.txt");
		fr = new FileReader(file);
		br = new BufferedReader(fr);
	}
	
	public List<StudentDTO> getStudents() throws IOException{
		String s = br.readLine();
		sDTOs = new ArrayList<StudentDTO>();
		while(s != null) {
			String[] infos = s.split(",");
			StudentDTO sDTO = new StudentDTO();
			sDTO.setNum(Long.parseLong(infos[0].trim()));
			sDTO.setName(infos[1].trim());
			sDTO.setAge(Integer.parseInt(infos[2].trim()));
			sDTO.setHeight(Double.parseDouble(infos[3].trim()));
			sDTOs.add(sDTO);
			
		}
		return sDTOs;
	}
	
}
