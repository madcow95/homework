package Feb20_Repeat;

import java.util.Scanner;

public class Feb20_Score_Console {

	public static void main(String args[]) {

		Feb20_Score feb = new Feb20_Score();
		Scanner scan = new Scanner(System.in);
		feb.score();

		System.out.println("=================================");
		System.out.println("����Ȯ�� ���α׷�");
		System.out.println("=================================");
		
		while (true) {
			System.out.println("�ֱ��� : 0\t������ : 1\t������ : 2 (�������� -1 �Է�)");
			System.out.print(" >> ");
			int num = scan.nextInt();
			if(num == -1) {
				System.out.println("���α׷� ����");
				break;
			}
			if(num < 0 || num > 2) {
				System.out.println("0, 1, 2�� �Է����ּ���");
			}
			
			feb.call(num);
			System.out.println("���Է� �㽯?");
		}
	}

}
