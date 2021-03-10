package com.callor.score.service.impl;

import java.util.Scanner;

import com.callor.score.service.MenuService;
import com.callor.score.values.VaLine;
import com.callor.score.values.Values;

public class ScoreMenu implements MenuService {
	Scanner scan = new Scanner(System.in);

	@Override
	public Integer menu() {

		while (true) {
			System.out.println(VaLine.dLine(50));
			System.out.println("메뉴 프로그램");
			System.out.println(VaLine.sLine(50));
			System.out.println("1. 성적 만들기");
			System.out.println("2. 성적 저장하기");
			System.out.println("3. 성적 불러오기");
			System.out.println("QUIT. 종료");
			System.out.println(VaLine.sLine(50));
			System.out.print("입력 >> ");
			String select = scan.nextLine();

			if (select.equalsIgnoreCase("quit")) {
				return null;
			}

			try {
				int intSelect = Integer.valueOf(select);
				if (intSelect >= Values.MENU_START && intSelect <= Values.MENU_QUIT) {
					if (intSelect == Values.MAKE_SCORE) {
						return 1;
					} else if (intSelect == Values.SAVE_SCORE) {
						return 2;
					} else if (intSelect == Values.LOAD_SCORE) {
						return 3;
					}

				} else {
					System.out.printf("%d ~ %d의 수를 입력하세요",
							Values.MENU_START,
							Values.MENU_QUIT);
				}

			} catch (Exception e) {
				System.out.printf("QUIT / %d ~ %d의 수를 입력하세요",
						Values.MENU_START,
						Values.MENU_QUIT);
			}

		}
	}

}
