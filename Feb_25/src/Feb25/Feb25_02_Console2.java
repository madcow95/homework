package Feb25;

import java.util.Scanner;

public class Feb25_02_Console2 {

	public static void main(String args[]) {

		Scanner scan = new Scanner(System.in);
		Feb25_02[] feb = new Feb25_02[5];
		// �迭 ����ϱ� ���� ����
		for (int i = 0; i < feb.length; i++) {
			feb[i] = new Feb25_02();
		}
		
		System.out.println("=========================");
		System.out.println("��	��ǰ����	��");
		System.out.println("=========================");
		
		// ��ǰ���� �Է�
		for (int i = 0; i < feb.length; i++) {
			System.out.print((i + 1) + "��° ��ǰ�ڵ� �Է� : ");
			feb[i].PCode = scan.nextLine();
			System.out.print((i + 1) + "��° ��ǰ�� �Է� : ");
			feb[i].PName = scan.nextLine();
			System.out.print((i + 1) + "��° �ŷ�ó  �Է� : ");
			feb[i].depart = scan.nextLine();
			System.out.print((i + 1) + "��° ǰ�� �Է� : ");
			feb[i].itemN = scan.nextLine();
			System.out.print((i + 1) + "��° ���Դܰ� �Է� : ");
			String striPrice = scan.nextLine();
			feb[i].iPrice = Integer.valueOf(striPrice);
			System.out.print((i + 1) + "��° ����ܰ� �Է� : ");
			String stroPrice = scan.nextLine();
			feb[i].oPrice = Integer.valueOf(stroPrice);
			System.out.println();
		} // for() end
		
		// ���
		for(int i = 0; i < feb.length; i++) {
			System.out.println("==========================");
			System.out.println((i + 1) + "��° ���α׷� ���� Ȯ��");
			System.out.println("==========================");
			System.out.printf("��ǰ�ڵ� : %s\n",feb[i].PCode);
			System.out.printf("��ǰ�� : %s\n",feb[i].PName);
			System.out.printf("�ŷ�ó : %s\n",feb[i].depart);
			System.out.printf("ǰ�� : %s\n",feb[i].itemN);
			System.out.printf("���Դܰ� : %s\n",feb[i].iPrice);
			System.out.printf("����ܰ� : %s\n",feb[i].oPrice);
		} // for() end
	}// main() end

} // class end
