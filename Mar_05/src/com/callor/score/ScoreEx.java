package com.callor.score;

import java.util.Scanner;

public class ScoreEx {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		ScoreMenu sMenu = new ScoreMenu();
		ScoreService sService = new ScoreService();

		while (true) {
			Integer select = sMenu.selectMenu();
			if (select == null) {
				break;
			}
			if (select == Values.MAKE_SCORE) {
				sService.makeScore();
			}
			else if (select == Values.SAVE_SCORE) {
				sService.saveScoreToFile();
			} 
			else if (select == Values.LOAD_SCORE) {
				sService.loadScoreFromFile();
			}
		}
		System.out.println("프로그램 종료!");
	}

}
