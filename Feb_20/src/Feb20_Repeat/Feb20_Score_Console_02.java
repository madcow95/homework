package Feb20_Repeat;

import java.util.Scanner;

public class Feb20_Score_Console_02 {
	
	public static void main(String[] args) {
		
		Feb20_Score_Console feb1 = new Feb20_Score_Console();
		Feb20_Score feb = new Feb20_Score();
		Scanner scan = new Scanner(System.in);
		
		System.out.println("=================================");
		System.out.println("����Ȯ�� ���α׷�");
		System.out.println("=================================");
		while (true) {
			System.out.println("�ֱ��� : 0\t������ : 1\t������ : 2");
			System.out.print(" >> ");
			int num = scan.nextInt();
			feb.call(num);
			System.out.println("----------------------------");
			System.out.println("���Է� �㽯?");
		}
		
	}

}
