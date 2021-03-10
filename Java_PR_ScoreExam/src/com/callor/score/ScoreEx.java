package com.callor.score;

import com.callor.score.service.impl.ScoreMenu;
import com.callor.score.service.impl.ScoreServiceImplV1;
import com.callor.score.values.Values;

public class ScoreEx {

	public static void main(String[] args) {

		ScoreServiceImplV1 ssV1 = new ScoreServiceImplV1();
		ScoreMenu sm = new ScoreMenu();
		while (true) {
			Integer select = sm.menu();
			if (select == null) {
				break;
			}
			if (select == Values.MAKE_SCORE) {
				ssV1.makeScore();
			} else if(select == Values.SAVE_SCORE) {
				ssV1.saveScore();
			} else if(select == Values.LOAD_SCORE) {
				ssV1.loadScore();
			}
		}
		System.out.println("시스템 종료!!");
	}

}
