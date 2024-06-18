package com.sol.s6.network.ex1.client;

public class ClientMain {

	public static void main(String[] args) {
		ClientConnect clientConnect = new ClientConnect();
		ClientService clientService = new ClientService();
		try {
//			clientConnect.getConnection();
			String info = "1,홍길동,3500,192.4,2,원빈,46,178";
			clientService.getInfo(info);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
