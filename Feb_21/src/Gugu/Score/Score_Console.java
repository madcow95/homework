package Gugu.Score;

import java.util.Scanner;

public class Score_Console {

	public static void main(String[] args) {

		Score score = new Score();
		Scanner scan = new Scanner(System.in);

		score.input();
		System.out.println("====================");
		System.out.println("점수확인");
		System.out.println("====================");
		while (true) {
			System.out.println("최광우(0)  곽승훈(1)  강대훈(2) 숫자입력 : ");
			System.out.println("그만 하려면 -1 입력");
			int num = scan.nextInt();
			score.scoreCall(num);
			System.out.println("========================");
			if(num == -1) {
				System.out.println("프로그램 종료");
				break;
			}
			if(num > 2 || num <0) {
				System.out.println("0, 1, 2중에서만 선택해주세요");
			}
			System.out.println("재입력?");
		}
	}
}
