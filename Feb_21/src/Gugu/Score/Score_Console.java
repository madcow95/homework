package Gugu.Score;

import java.util.Scanner;

public class Score_Console {

	public static void main(String[] args) {

		Score score = new Score();
		Scanner scan = new Scanner(System.in);

		score.input();
		System.out.println("====================");
		System.out.println("����Ȯ��");
		System.out.println("====================");
		while (true) {
			System.out.println("�ֱ���(0)  ������(1)  ������(2) �����Է� : ");
			System.out.println("�׸� �Ϸ��� -1 �Է�");
			int num = scan.nextInt();
			score.scoreCall(num);
			System.out.println("========================");
			if(num == -1) {
				System.out.println("���α׷� ����");
				break;
			}
			if(num > 2 || num <0) {
				System.out.println("0, 1, 2�߿����� �������ּ���");
			}
			System.out.println("���Է�?");
		}
	}
}
