package com.callor.score.impl;

import java.util.Scanner;

import com.callor.score.Valine;
import com.callor.score.Values;
import com.callor.score.service.ScoreMenu;

public class MenuScore implements ScoreMenu {

	@Override
	public Integer selectMenu() {
		Scanner scan = new Scanner(System.in);

		while (true) {
			System.out.println(Valine.dLine(50));
			System.out.println("������ �� ����ó�� �ý���");
			System.out.println(Valine.sLine(50));
			System.out.printf("%d. �л����� ���� ����\n", Values.MAKE_SCORE);
			System.out.printf("%d. �л����� ���� ���Ͽ� ����\n", Values.SAVE_SCORE);
			System.out.printf("%d. ������� Ȯ��\n", Values.LOAD_SCORE);
			System.out.println("QUIT. ������");
			System.out.println(Valine.dLine(50));
			System.out.print("���� >> ");
			String strSelect = scan.nextLine();
			if (strSelect.equalsIgnoreCase("q")) {
				System.out.print("�����Ͻðڽ��ϱ�?(y/n) : ");
				String yesNo = scan.nextLine();
				if (yesNo.equalsIgnoreCase("y")) {
					return null;
				} else if (yesNo.equalsIgnoreCase("n")) {
					continue;
				}
			}
			int select = Integer.valueOf(strSelect);
			if(select == Values.MAKE_SCORE) {
				return Values.MAKE_SCORE;
			} else if(select == Values.SAVE_SCORE) {
				return Values.SAVE_SCORE;
			} else if(select == Values.LOAD_SCORE) {
				return Values.LOAD_SCORE;
			}

		}

	}

}
