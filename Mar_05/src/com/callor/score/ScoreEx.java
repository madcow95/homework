package com.callor.score;

public class ScoreEx {

	public static void main(String[] args) {

		ScoreMenu sMenu = new ScoreMenu();
		ScoreService sService = new ScoreService();

		while (true) {
			int select = sMenu.selectMenu();
			if (select == 1) {
				sService.makeScore();
			}
			if (select == 2) {
				sService.saveScoreToFile();
			} 
			if (select == 3) {
				sService.loadScoreFromFile();
			}
		}
	}

}
