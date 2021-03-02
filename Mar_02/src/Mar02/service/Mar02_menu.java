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
			System.out.println("��ٱ��Ͽ� �ֱ� V1");
			System.out.println("--------------------");
			System.out.println("1. ����Ʈ�� �߰�");
			System.out.println("2. ����Ʈ ���");
			System.out.println("(Q , q) : �۾�����");
			System.out.println("--------------------");

			int intNum = 0;

			System.out.print("�Է� >> ");
			String strNum = scan.nextLine();
			if (strNum.equals("Q") || strNum.endsWith("q")) {
				System.out.println("�۾���!!");
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
							System.out.println("���ڴ� 1�� 2�� �Է��ϼ���");
						}

				} catch (NumberFormatException e) {
					System.out.println("Q , q , 1 , 2 ������ �Է��ϼ���");
					break;
				}
			}
		}

	}
}
