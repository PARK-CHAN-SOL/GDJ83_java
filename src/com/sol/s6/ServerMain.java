package com.sol.s6;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ServerMain {

	public static void main(String[] args) {
		// Network
		// ip:port => Socket
		// Network 통신은 Socket끼리 1:1 통신 (Client : Server)
		ServerSocket ss = null;
		Socket sc = null;

		InputStream is = null;
		InputStreamReader ir = null;
		BufferedReader br = null;

		OutputStream os = null;
		OutputStreamWriter ow = null;

		Scanner scanner = new Scanner(System.in);
		try {
			ss = new ServerSocket(8282);
			// 서버를 열고 Client 접속을 기다림
			System.out.println("서버 실행 후 Client를 기다림...");
			sc = ss.accept();
			System.out.println("Client와 연결 성공");
			is = sc.getInputStream();
			ir = new InputStreamReader(is);
			br = new BufferedReader(ir);

			os = sc.getOutputStream();
			ow = new OutputStreamWriter(os);

			while (true) {
				System.out.println("\nClient로부터 메세지를 기다리고 있습니다...");
				String msg = br.readLine();
				System.out.println("\nClient: " + msg);
				if (msg.toLowerCase().equals("exit")) break;

				System.out.println("\nClient로 보낼 메세지를 입력하세요");
				msg = scanner.nextLine();
				ow.write(msg + "\r\n");
				ow.flush();
				if (msg.toLowerCase().equals("exit")) break;

			}
			
			System.out.println("연결 종료");
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		} finally {
			try {
				br.close();
				ir.close();
				is.close();

				ow.close();
				os.close();

				sc.close();
				ss.close();

				scanner.close();

			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();

			}

		}
	}

}
