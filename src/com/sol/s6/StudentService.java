package com.sol.s6;

import java.util.ArrayList;
import java.util.List;

public class StudentService {
	List<StudentDTO> sDTOs;
	StringBuilder sb;
	public StudentService() {
		this.sDTOs = new ArrayList<StudentDTO>();
		this.sb  = new StringBuilder();
		StudentDTO sDTO = new StudentDTO();
		sDTO.setNum(1L);
		sDTO.setName("홍길동");
		sDTO.setAge(3500);
		sDTO.setHeight(192.4);
		this.sDTOs.add(sDTO);
		
		sDTO = new StudentDTO();
		sDTO.setNum(2L);
		sDTO.setName("원빈");
		sDTO.setAge(46);
		sDTO.setHeight(178.3);
		this.sDTOs.add(sDTO);
		
		sDTO = new StudentDTO();
		sDTO.setNum(3L);
		sDTO.setName("박찬솔");
		sDTO.setAge(27);
		sDTO.setHeight(176.7);
		this.sDTOs.add(sDTO);
	}
	
	public List<StudentDTO> getStudents(){
		return this.sDTOs;
	}
}
