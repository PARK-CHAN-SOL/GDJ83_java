package com.sol.s4.io;

import java.io.File;

public class FileMain {

	public static void main(String[] args) {
		// bit(byte) -> 문자 -> 문자열
		// 파일정보를 담고 있는 객체

		File file = new File("C:\\study");

		System.out.println(file.exists());
		System.out.println(file.isDirectory());
		System.out.println(file.isFile());
		System.out.println(file.getName());
		System.out.println(file.length());

		System.out.println("=======================");
//		file = new File("C:\\study", "test.txt");
		file = new File(file, "sub");
		System.out.println(file.exists());
		System.out.println(file.isDirectory());
		System.out.println(file.isFile());

		// 원래도 있으면 안만든다
		if (!file.exists()) {
			file.mkdir();
		}

		// 부모가 없으면 못만든다
		file = new File("C:\\study\\sub2\\student");
		file.mkdirs();

		file = new File("C:\\study\\test.txt");
		file.delete();

		file = new File("C:\\study\\sub2");
		file.delete();

		file = new File("C:\\study");
		String[] list = file.list();
		for (String s : list) {
			System.out.println(s);
		}
		
		System.out.println("=======================");
		File[] files = file.listFiles();
		for(File f : files) {
			if(f.exists()) System.out.println(f.getName() + (f.isFile()?" is file":" is directory"));
		}
	}

}
