package com.callor.score;

import com.callor.score.impl.MenuScore;
import com.callor.score.impl.ScoreServiceImplV1;

public class ScoreEx {

	public static void main(String[] args) {

		MenuScore ms = new MenuScore();
		ScoreServiceImplV1 ssV1 = new ScoreServiceImplV1();

		while (true) {
			try {
				Integer select = ms.selectMenu();
				if (select == null) {
					break;
				}
				
				if (select >= Values.START_MENU && select <= Values.QUIT_MENU) {
					if (select == Values.MAKE_SCORE) {
						ssV1.makeScore();
					} else if (select == Values.SAVE_SCORE) {
						ssV1.saveScoreToFile();
					} else if (select == Values.LOAD_SCORE) {
						ssV1.loadScoreFromFile();
					}
				}
			} catch (Exception e) {
				System.out.printf("q / %d ~ %d만 입력하세요\n",
						Values.START_MENU,
						Values.QUIT_MENU);
			}

		}
		System.out.println("프로그램 종료!!");
	}

}
