package com.sol.s4.io;

import java.io.File;

public class FileMain2 {

	private static void deleteAll(File f) {
		if (f.exists()) {
			if (f.isFile()) f.delete();
			else {
				File[] files = f.listFiles();
				for (File file : files) {
					deleteAll(file);
					file.delete();
				}
			}
			f.delete();
		}
	}

	public static void main(String[] args) {
		// study2 폴더를 삭제
		File f = new File("C:\\study2");
		deleteAll(f);
	}

}
