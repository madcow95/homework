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
			System.out.println("빛나라 고교 성적처리 시스템");
			System.out.println(Values.sLine);
			System.out.println("1. 학생성적 점수 생성");
			System.out.println("2. 학생성적 점수 파일에 저장");
			System.out.println("3. 성적결과 확인");
			System.out.println("QUIT. 끝내기");
			System.out.println(Values.dLine);
			System.out.print("선택 >> ");
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
					System.out.printf("%d ~ %d의 수만 입력하세요\n",
							Values.START_MENU,
							Values.LAST_MENU);
				}

			} catch (Exception e) {
				System.out.printf("Q / %d ~ %d의 정수만 입력하세요\n",
						Values.START_MENU,
						Values.LAST_MENU);
			}

		}
	}

}
