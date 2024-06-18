package com.sol.s6.network.ex1.client;

import java.util.Scanner;

public class ClientController {

	private ClientConnect clientConnect;
	private ClientService clientService;
	
	public ClientController() {
		clientConnect = new ClientConnect();
		clientService = new ClientService();
	}
	
	public void start() throws Exception {
		Scanner sc = new Scanner(System.in);
		boolean flag = true;

		clientConnect.getConnection();
		
		while (flag) {
			System.out.println("1.전체 2.상세 3.종료");
			int select = sc.nextInt();
			
			if (select == 1) {
				clientConnect.getOw().write(select + "\r\n");
				clientConnect.getOw().flush();
				
				String info = clientConnect.getBr().readLine();
				
				clientService.getInfo(info);
				
			} else if (select == 2) {

			} else if (select == 3) {

			} else {
			}
			
		}
	}
}
