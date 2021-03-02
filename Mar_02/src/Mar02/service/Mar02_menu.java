package Mar02.service;

import java.util.Scanner;

import Mar02.inter.inter02;

public class Mar02_menu implements inter02 {

	Mar02_service mService;
	Scanner scan;

	public Mar02_menu() {
		mService = new Mar02_service();
		scan = new Scanner(System.in);
	}

	@Override
	public Integer menu() {

		while (true) {
			System.out.println("====================");
			System.out.println("장바구니에 넣기 V1");
			System.out.println("--------------------");
			System.out.println("1. 리스트에 추가");
			System.out.println("2. 리스트 출력");
			System.out.println("(Q , q) : 작업종료");
			System.out.println("--------------------");

			int intNum = 0;

			System.out.print("입력 >> ");
			String strNum = scan.nextLine();
			if (strNum.equals("Q") || strNum.endsWith("q")) {
				System.out.println("작업끝!!");
				return null;
			}
			while (true) {
				try {
					intNum = Integer.valueOf(strNum);
						if (intNum == 1) {
							mService.input();
							break;
						} else if (intNum == 2) {
							mService.print();
							break;
						} else {
							System.out.println("숫자는 1과 2만 입력하세요");
						}

				} catch (NumberFormatException e) {
					System.out.println("Q , q , 1 , 2 에서만 입력하세요");
					break;
				}
			}
		}

	}
}
