package com.sol.s6.network.ex1.server;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerConnect {
	private ServerSocket ss;
	private Socket socket;
	private InputStream is;
	private InputStreamReader ir;
	private BufferedReader br;
	private OutputStream os;
	private OutputStreamWriter ow;

	public void getConnection() throws Exception {
		ss = new ServerSocket(8282);

		socket = ss.accept();

		is = socket.getInputStream();
		ir = new InputStreamReader(is);
		br = new BufferedReader(ir);

		os = socket.getOutputStream();
		ow = new OutputStreamWriter(os);

	}

	public void disConnect() throws Exception {
		br.close();
		ir.close();
		is.close();
		
		ow.close();
		os.close();
		
		socket.close();
		
	}

	public BufferedReader getBr() {
		return br;
	}

	public OutputStream getOs() {
		return os;
	}
}
