package com.sol.s6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.List;

public class MyServerMain {

	public static void main(String[] args) {
		ServerSocket serverSocket = null;
		Socket socket = null;
		OutputStream os = null;
		OutputStreamWriter ow = null;
		InputStream is = null;
		InputStreamReader ir = null;
		BufferedReader br = null;
		StudentService ss = new StudentService();
		List<StudentDTO> sDTOs;
		try {
			serverSocket = new ServerSocket(8282);
			while (true) {

				socket = serverSocket.accept();
				System.out.println("클라이언트 접속");
				os = socket.getOutputStream();
				ow = new OutputStreamWriter(os);

				is = socket.getInputStream();
				ir = new InputStreamReader(is);
				br = new BufferedReader(ir);

				while (true) {
					System.out.println("first while loop start");
					sDTOs = ss.getStudents();
					System.out.println("getStudents call");
					String commend = "DEFALUT";
					commend = br.readLine();
					while(commend == null) {
						commend = br.readLine();
					}
					commend = commend.trim();
					StringBuilder sb = new StringBuilder();
					System.out.println(commend + "chk1");
					if (commend.equals("1")) {
						for (StudentDTO sDTOTmp : sDTOs) {
							sb.append(sDTOTmp.getNum()).append(",").append(sDTOTmp.getName()).append(",")
									.append(sDTOTmp.getAge()).append(",").append(sDTOTmp.getHeight()).append(",");
						}
						sb.delete(sb.length() - 1, sb.length());
						System.out.println(sb.toString());
						ow.write(sb.toString() + "\r\n");
						ow.flush();
					} else if (commend.equals("2")) {
						ow.write("검색할 학생의 번호를 입력하세요\r\n");
						ow.flush();
						String strNum = br.readLine().trim();
						long longNum = Long.parseLong(strNum);

						for (StudentDTO sDTOTmp : sDTOs) {
							if (sDTOTmp.getNum() == longNum) {
								sb.append(sDTOTmp.getNum()).append(",").append(sDTOTmp.getName()).append(",")
										.append(sDTOTmp.getAge()).append(",").append(sDTOTmp.getHeight());
								System.out.println(sb.toString());
								ow.write(sb.toString() + "\r\n");
								ow.flush();
							}
						}
					} else if (commend.equals("3")) {
						break;
					} else {
						System.out.println("undefined input");
					}

				}
				br.close();
				ir.close();
				is.close();
				
				ow.close();
				os.close();
				
				socket.close();
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				serverSocket.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
