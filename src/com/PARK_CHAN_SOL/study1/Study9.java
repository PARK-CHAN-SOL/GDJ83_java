package com.PARK_CHAN_SOL.study1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Study9 {
	public static void main(String[] args) {

//		로그인 검증
//		id = 1234, pw = 5678
//		
//		로그인 시도 전에 1번 누르면 로그인 시도, 2번 누르면 종료
//		사용자의 id와 pw를 입력 받아서 로그인을 N번 시도
//		틀리면 로그인 실패 출력 후 다시 로그인 할거냐 물어봄
//		종료를 선택했다면 반복문 탈출 후 그냥 프로그램 종료
//		로그인 성공하면 성공 출력하고 반복문 종료후 게임을 시작하자
//		
//		MMORPG:
//		시작 레벨은 1로 시작해서 15가 만렙
//		1 -> 2: 3마리
//		2 -> 3: 6마리
//		3 -> 4: 9마리
//		...
//		14 -> 15: 42마리
//		GOLD는 0으로 시작,
//		5레벨 달성시 1,000 G 지급
//		10레벨 달성시 2,000 G 지급
//		만렙 달성시 3,000 G 지급
//		15레벨 되면 현재 레벨 현재 GOLD 출력 후 프로그램 종료
//		추가 과제: 사냥 하기 전에 사냥 할건지 종료할건지 물어봄
		int id = 1234;
		int pw = 5678;
		Scanner sc = new Scanner(System.in);

		while (true) {
			int logInFlag = 2;
			int yourId;
			int yourPw;

			// 로그인 할지 종료할지 입력 받음
			// while try catch로 nextInt() 예외 처리, 제대로 입력 될 때까지 무한 루프
			while (true) {
				try {
					System.out.println("로그인 하시겠습니까? (1: Yes, 2: No)");
					System.out.print(": ");
					logInFlag = sc.nextInt();

					// 개행 문자 버퍼 처리
					sc.nextLine();
					System.out.print("");
					break;
				} catch (InputMismatchException e) {

					// Exception 발생하면 sc 변수 초기화 해줘야 함 (new Scanner(System.in)으로 재정의
					sc = new Scanner(System.in);
					System.out.println("");
					System.out.println("잘못 입력하셨습니다");
					System.out.println("1, 2 또는 3의 숫자로 입력해주세요");
					System.out.println("");
				}
			}

			// 로그인 하겠다고 할 때에만 ID, PW 입력받음
			if (logInFlag == 1) {

				// ID 입력받음
				// while try catch로 nextInt() 예외 처리, 제대로 입력 될 때까지 무한 루프
				while (true) {
					try {
						System.out.println("");
						System.out.println("ID를 입력하세요");
						System.out.print("ID: ");
						yourId = sc.nextInt();

						// 개행 문자 버퍼 처리
						sc.nextLine();
						System.out.println("");
						break;
					} catch (InputMismatchException e) {

						// Exception 발생하면 sc 변수 초기화 해줘야 함 (new Scanner(System.in)으로 재정의
						sc = new Scanner(System.in);
						System.out.println("ID형식이 틀렸습니다 (ID는 숫자 형식입니다)");
						System.out.println("다시 입력하세요");
						System.out.println("");
					}
				}

				// PW 입력받음
				// while try catch로 nextInt() 예외 처리, 제대로 입력 될 때까지 무한 루프
				while (true) {
					try {
						System.out.println("PW를 입력하세요");
						System.out.print("PW: ");
						yourPw = sc.nextInt();

						// 개행 문자 버퍼 처리
						sc.nextLine();
						System.out.println("");
						break;
					} catch (InputMismatchException e) {

						// Exception 발생하면 sc 변수 초기화 해줘야 함 (new Scanner(System.in)으로 재정의
						sc = new Scanner(System.in);
						System.out.println("PW형식이 틀렸습니다 (PW는 숫자 형식입니다)");
						System.out.println("다시 입력하세요");
						System.out.println("");
					}
				}

				// 아이디와 패스워드가 모두 같으면 로그인 반복문 탈출
				if (id == yourId && pw == yourPw) {
					System.out.println("로그인 성공");
					System.out.println("");
					break;
				} else {
					System.out.println("ID 또는 PW가 틀렸습니다.");
					System.out.println("");
				}

				// 로그인 안하겠다고 입력 받으면 그냥 프로그램 종료
			} else if (logInFlag == 2) {
				System.out.println("프로그램 종료");

				// 종료 전 Scanner 닫아주기
				sc.close();
				return;
			} else {
				System.out.println("잘못 입력하셨습니다");
				System.out.println("1 또는 2의 숫자로 입력해주세요");
				System.out.println("");
				continue;
			}
		} // while 끝

		System.out.println("게임을 시작합니다");

		int level = 1;
		int gold = 0;
		int maxExp = 30;
		int myExp = 0;
		int huntFlag = 2;
		int autoHunt = 1;

		// 종료를 입력받거나 15레벨에 도달할 때까지 반복문 실행
		while (true) {

			// 고블린 사냥 반복, myExp가 maxExp에 도달하면 반복문 탈출 => 레벨업
			for (myExp = 0; myExp < maxExp; myExp += 10) {

				// 입력 받은 자동 사냥 횟수만큼 아래 반복문 건너뜀
				// 아래 반복문은 1회 사냥할 지 n회 자동 사냥할 지 프로그램 종료할 지 결정함
				if (autoHunt >= 1) {
					autoHunt--;
				}

				// 1회 사냥할 지 n회 자동 사냥할 지 프로그램 종료할 지 결정함
				// huntFlag 입력받음
				// while try catch로 nextInt() 예외 처리, 제대로 입력 될 때까지 무한 루프
				while (autoHunt == 0) {
					try {
						System.out.println("고블린을 사냥할까요? (1: 1회 사냥, 2: n회 자동 사냥, 3: 프로그램 종료)");
						System.out.print(": ");
						huntFlag = sc.nextInt();

						// 개행 문자 버퍼 처리
						sc.nextLine();
						System.out.print("");

						if (huntFlag == 1) {
							System.out.println("고블린 사냥 시작");
							System.out.println("");
							break;
						} else if (huntFlag == 2) {
							
							// 몇회 자동 사냥할 지 결정
							// autoHunt 입력받음
							// while try catch로 nextInt() 예외 처리, 제대로 입력 될 때까지 무한 루프
							while (true) {
								try {
									System.out.println("몇회 자동 사냥 할까요? (1 이상의 숫자 입력)");
									System.out.print(": ");
									autoHunt = sc.nextInt();

									// 개행 문자 버퍼 처리
									sc.nextLine();
									System.out.print("");
									if (autoHunt >= 1) {
										System.out.println("고블린 " + autoHunt + "회 자동 사냥 시작");
										System.out.println("");
										break;
										// 1 미만의 숫자 입력해도 예외 강제 발생 (1회 미만 자동 사냥은 할 수 없음)
									} else {
										throw new InputMismatchException();
									}
								} catch (InputMismatchException e) {
									System.out.println("잘못 입력하셨습니다");
									System.out.println("1 이상의 숫자를 입력하세요");
									System.out.println("");

									// Exception 발생하면 sc 변수 초기화 해줘야 함 (new Scanner(System.in)으로 재정의)
									sc = new Scanner(System.in);
								}
							}
						} else if (huntFlag == 3) {
							System.out.println("프로그램 종료");

							// 프로그램 종료 전 스캐너 닫아줌
							sc.close();
							return;
							// 다른 숫자 입력해도 예외 강제 발생 (1회 사냥, n회 자동 사냥, 프로그램 종료 각각 1, 2, 3)
						} else {
							throw new InputMismatchException();
						}
					} catch (InputMismatchException e) {
						System.out.println("잘못 입력하셨습니다");
						System.out.println("1 또는 2의 숫자를 입력하세요");
						System.out.println("");

						// Exception 발생하면 sc 변수 초기화 해줘야 함 (new Scanner(System.in)으로 재정의)
						sc = new Scanner(System.in);
					}
				}

				System.out.println("");
				System.out.println("고블린을 사냥했습니다");
				System.out.println("");
				System.out.println("경헙치 10 증가 ( " + (myExp + 10) + " / " + maxExp + " )");
				System.out.println("");

			}

			// myExp 가 maxExp와 같아지면 레벨업
			// myExp 초기화
			if (myExp == maxExp) {
				System.out.println("");
				maxExp += 30;
				level++;
				System.out.println("레벨업!! (현재 레벨: " + level + ")");
				myExp = 0;
				System.out.println("");
			}

			// 5레벨 단위로 골드 축하금 지급
			// 15레벨 달성시 프로그램 종료
			if (level == 5) {
				System.out.println("");
				System.out.println("5레벨 달성 기념으로 축하금 1000G가 지급됩니다");
				gold += 1000;
				System.out.println("현재 소지 골드: " + gold + "G");
				System.out.println("");
			} else if (level == 10) {
				System.out.println("");
				System.out.println("10레벨 달성 기념으로 축하금 2000G가 지급됩니다");
				gold += 2000;
				System.out.println("현재 소지 골드: " + gold + "G");
				System.out.println("");
			} else if (level == 15) {
				System.out.println("");
				System.out.println("15레벨 달성 기념으로 축하금 3000G가 지급됩니다");
				gold += 3000;
				System.out.println("현재 소지 골드: " + gold + "G");
				System.out.println("");
				System.out.println("레벨이 달성 가능한 최대 레벨에 도달했습니다");
				System.out.println("현재 레벨\t\t: " + level);
				System.out.println("현재 소지 골드\t: " + gold);
				System.out.println("");
				System.out.println("게임을 종료합니다");
				System.out.println("");

				// 15 레벨 달성시 사냥 반복문 탈출 => 프로그램 종료
				break;
			}

			// 레벨업 시 자동사냥을 지속할 것인지 재입력 받음
			if (autoHunt >= 1) {
				
				// autoStopFlag 입력받음
				// while try catch로 nextInt() 예외 처리, 제대로 입력 될 때까지 무한 루프
				while (true) {
					try {
						int autoStopFlag = 1;
						System.out.println("자동 사냥을 계속할까요? (1: Yes, 2: No)");
						System.out.println(": ");
						autoStopFlag = sc.nextInt();

						// 개행 문자 처리
						sc.nextLine();
						System.out.print("");
						if (autoStopFlag == 1) {
							System.out.println("자동사냥 계속");
							System.out.println("");
							break;
						} else if (autoStopFlag == 2) {
							System.out.println("자동사냥 종료");
							System.out.println("");

							// 자동사냥 종료 입력시 (2 입력), 자동사냥 반복횟수 변수 autoHunt 를 0으로 변환
							autoHunt = 0;
							break;

							// 1, 2 (yes, no) 이외의 다른 숫자 입력 받아도 강제예외 발생 (재입력)
						} else {
							throw new InputMismatchException();
						}
					} catch (InputMismatchException e) {
						System.out.println("잘못 입력하셨습니다");
						System.out.println("1 또는 2의 숫자를 입력하세요");
						System.out.println("");

						// Exception 발생하면 sc 변수 초기화 해줘야 함 (new Scanner(System.in)으로 재정의)
						sc = new Scanner(System.in);
					}
				}
			}

		}
		// 프로그램 종료 전 System.in 스캐너 닫아줌
		sc.close();
	}
}
