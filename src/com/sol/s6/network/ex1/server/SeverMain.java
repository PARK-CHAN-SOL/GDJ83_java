package com.sol.s6.network.ex1.server;

public class SeverMain {

	public static void main(String[] args) {

		ServerConnect serverConnect = new ServerConnect();
		
		try {
			serverConnect.getConnection();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
