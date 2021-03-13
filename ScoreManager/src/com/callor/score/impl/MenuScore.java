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
			System.out.println("빛나라 고교 성적처리 시스템");
			System.out.println(Valine.sLine(50));
			System.out.printf("%d. 학생성적 점수 생성\n", Values.MAKE_SCORE);
			System.out.printf("%d. 학생성적 점수 파일에 저장\n", Values.SAVE_SCORE);
			System.out.printf("%d. 성적결과 확인\n", Values.LOAD_SCORE);
			System.out.println("QUIT. 끝내기");
			System.out.println(Valine.dLine(50));
			System.out.print("선택 >> ");
			String strSelect = scan.nextLine();
			if (strSelect.equalsIgnoreCase("q")) {
				System.out.print("종료하시겠습니까?(y/n) : ");
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
