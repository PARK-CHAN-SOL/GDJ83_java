package com.sol.s6.network.ex1.client;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class ClientConnect {
	private Socket socket;
	private InputStream is;
	private InputStreamReader ir;
	private BufferedReader br;
	private OutputStream os;
	private OutputStreamWriter ow;
	
	// 1. 자원 연결
	public void getConnection() throws Exception {
		socket = new Socket("localhost", 8282);
		
		is = socket.getInputStream();
		ir = new InputStreamReader(is);
		br = new BufferedReader(ir);
		
		os = socket.getOutputStream();
		ow = new OutputStreamWriter(os);
		
		// 1. 클래스를 리턴? 1번만 쓸건데 클래스 만들기는 낭비다
		//			자바는 재사용이 가능한지가 중요하다
		// 2. Collection 개열? 형변환 귀찮다 
		
	}
	
	public BufferedReader getBr() {
		return br;
	}

	public OutputStreamWriter getOw() {
		return ow;
	}

	// 2. 자원 해제
	public void disConnect() throws Exception {
		br.close();
		ir.close();
		is.close();
		
		ow.close();
		os.close();
		
		socket.close();
		
	}
	
}
