package Feb25;

import java.util.Scanner;

public class Feb25_02_Console3 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		Feb25_02[] feb25 = new Feb25_02[5];

		for (int i = 0; i < feb25.length; i++) {
			feb25[i] = new Feb25_02();
		}

		for (int i = 0; i < feb25.length; i++) {
			System.out.println((i + 1) + "��° ��ǰ�����Է�");
			System.out.print("��ǰ�ڵ� �Է� : ");
			feb25[i].PCode = scan.nextLine();

			System.out.print("��ǰ�� �Է� : ");
			feb25[i].PName = scan.nextLine();

			System.out.print("�ŷ�ó �Է� : ");
			feb25[i].depart = scan.nextLine();

			System.out.print("ǰ�� �Է� : ");
			feb25[i].itemN = scan.nextLine();
			while (true) {
				System.out.print("���Դܰ� �Է� : ");
				String iPrice = scan.nextLine();
				feb25[i].iPrice = Integer.valueOf(iPrice);

				if (feb25[i].iPrice < 0) {
					System.out.println("0�̻��� ���� �Է����ּ���");
				} else {
					break;
				}
			}
			
			while (true) {
				System.out.print("����ܰ� �Է� : ");
				String oPrice = scan.nextLine();
				feb25[i].oPrice = Integer.valueOf(oPrice);
				
				if (feb25[i].oPrice < 0) {
					System.out.println("0�̻��� ���� �Է����ּ���");
				} else {
					break;
				}
			}
			feb25[i].print(i);
			System.out.println("=====================================");
		} // for end

	}

}
