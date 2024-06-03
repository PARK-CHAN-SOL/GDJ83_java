package com.PARK_CHAN_SOL.s1.lang;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class S4Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String name = "computer Science";

		String result = name.substring(3);
		// puter Science

		result = name.substring(3, 5);

		bw.write(result + "\n");

		bw.write("파일명을 입력하세요 (확장자 포함)\n");
		bw.flush();
		name = br.readLine();

		// 확장자만 분리
		// jpg, png, gif, jpeg, jiff
		String[] img = {"jpg", "png", "gif", "jpeg", "jiff"};
		
		result = name.substring(name.lastIndexOf('.') + 1);
		
		if(result.equals("jpg") || result.equals("png") || result.equals("gif") || result.equals("jpeg") || result.equals("jiff")) {
			bw.write("이미지 파일입니다.\n");
		} else {
			bw.write("이미지 파일이 아입니다.\n");
		}
		
//		for(int i = 0; i < img.length; i++) {
//			if(img[i].equals(result)) {
//				bw.write("이미지 파일입니다.\n");
//				break;
//			}else if(i == img.length-1) {
//				bw.write("이미지 파일이 아닙니다.\n");
//			}
//		}
//		bw.write(result + "\n");
		bw.flush(); //System.out.println();

		bw.close();
	}

}
