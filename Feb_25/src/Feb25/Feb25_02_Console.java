package Feb25;

import java.util.Scanner;

public class Feb25_02_Console {
	
	public static void main(String args[]) {
		
		Feb25_02 feb25 = new Feb25_02();
		Scanner scan = new Scanner(System.in);
		
		System.out.print("��ǰ�ڵ� �Է� : ");
		feb25.PCode = scan.nextLine();
		
		System.out.print("��ǰ�� �Է� : ");
		feb25.PName = scan.nextLine();
		
		System.out.print("�ŷ�ó �Է� : ");
		feb25.depart = scan.nextLine();
		
		System.out.print("ǰ�� �Է� : ");
		feb25.itemN = scan.nextLine();
		
		System.out.print("���Դܰ� �Է� : ");
		String strIPrice = scan.nextLine();
		feb25.iPrice = Integer.valueOf(strIPrice);
		
		System.out.print("����ܰ� �Է� : ");
		String strOPrice = scan.nextLine();
		feb25.oPrice = Integer.valueOf(strOPrice);
	}

}
