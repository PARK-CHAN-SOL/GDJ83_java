package com.sol.s6;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

public class StudentService {
	private StudentDAO sDAO;
	private StringBuffer sb;
	
	public StudentService() {
		try {
			this.sDAO = new StudentDAO();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			
		}
		
		sb = new StringBuffer();
	}
	
	public List<StudentDTO> getStudents(){		
		try {
			return sDAO.getStudents();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		
		return null;
	}
	
	public String sDTOsToString(List<StudentDTO> sDTOs) {
		for (StudentDTO sDTOTmp : sDTOs) {
			sb.append(sDTOTmp.getNum()).append(",").append(sDTOTmp.getName()).append(",")
					.append(sDTOTmp.getAge()).append(",").append(sDTOTmp.getHeight()).append(",");
		}
		sb.delete(sb.length() - 1, sb.length());
		return sb.toString();
	}
}
