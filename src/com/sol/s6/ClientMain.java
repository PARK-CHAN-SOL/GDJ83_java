package com.sol.s6;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

public class ClientMain {

	public static void main(String[] args) {
		Socket socket = null;

		OutputStream os = null;
		OutputStreamWriter ow = null;

		InputStream is = null;
		InputStreamReader ir = null;
		BufferedReader br = null;

		Scanner sc = new Scanner(System.in);
		try {
			socket = new Socket("localhost", 8282);

			os = socket.getOutputStream();
			ow = new OutputStreamWriter(os);

			is = socket.getInputStream();
			ir = new InputStreamReader(is);
			br = new BufferedReader(ir);

			System.out.println("Server와 연결 성공");

			while (true) {
				System.out.println("\nServer로 보낼 메세지를 입력하세요");
				String str = sc.nextLine();
				ow.write(str + "\r\n");
				ow.flush();
				if (str.toLowerCase().equals("exit")) break;
				
				System.out.println("\nServer로부터 메세지를 기다리고 있습니다...");
				str = br.readLine();
				System.out.println("\nSever: " + str);
				if (str.toLowerCase().equals("exit")) break;
				
			}
			
			System.out.println("연결 종료");

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		} finally {
			try {
				ow.close();
				os.close();

				br.close();
				ir.close();
				is.close();

				socket.close();

				sc.close();

			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();

			}
		}

	}

}
