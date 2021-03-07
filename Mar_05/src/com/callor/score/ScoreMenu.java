package com.callor.score;

import java.util.Scanner;

public class ScoreMenu implements MenuService {

	private Scanner scan;

	public ScoreMenu() {
		scan = new Scanner(System.in);
	}

	@Override
	public Integer selectMenu() {
		// TODO Auto-generated method stub
		while (true) {
			System.out.println(Values.dLine);
			System.out.println("������ �� ����ó�� �ý���");
			System.out.println(Values.sLine);
			System.out.println("1. �л����� ���� ����");
			System.out.println("2. �л����� ���� ���Ͽ� ����");
			System.out.println("3. ������� Ȯ��");
			System.out.println("QUIT. ������");
			System.out.println(Values.dLine);
			System.out.print("���� >> ");
			String select = scan.nextLine();

			if (select.equalsIgnoreCase("q")) {
				return null;
			}
			try {
				int intSelect = Integer.valueOf(select);
				if (intSelect == Values.MAKE_SCORE) {
					return intSelect;
				} else if (intSelect == Values.SAVE_SCORE) {
					return intSelect;
				} else if (intSelect == Values.LOAD_SCORE) {
					return intSelect;
				} else {
					System.out.printf("%d ~ %d�� ���� �Է��ϼ���\n",
							Values.START_MENU,
							Values.LAST_MENU);
				}

			} catch (Exception e) {
				System.out.printf("Q / %d ~ %d�� ������ �Է��ϼ���\n",
						Values.START_MENU,
						Values.LAST_MENU);
			}

		}
	}

}
