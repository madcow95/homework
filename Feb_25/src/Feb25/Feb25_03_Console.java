package Feb25;

import java.util.Scanner;

public class Feb25_03_Console {

	public static void main(String[] args) {

		Feb25_03 febVO = new Feb25_03();
		Scanner scan = new Scanner(System.in);
		while (true) {
			System.out.print("�л��̸� �Է� : ");
			String strName = scan.nextLine();
			febVO.setStrName(strName);
			febVO.getStrName(strName);

			while (true) {
				System.out.print("���������Է� : ");
				String strKor = scan.nextLine();
				febVO.setIntKor(strKor);
				febVO.getIntKor();
				if (febVO.getIntKor() < 0) {
					System.out.println("�������� ��ȿ�� �˻� ����");
					continue;
				}
				break;
			}
			while (true) {
				System.out.print("���������Է� : ");
				String strEng = scan.nextLine();
				febVO.setIntEng(strEng);
				febVO.getIntEng();
				if (febVO.getIntEng() < 0) {
					System.out.println("�������� ��ȿ�� �˻� ����");
					continue;
				}
				break;
			}
			while (true) {
				System.out.print("���������Է� : ");
				String strMath = scan.nextLine();
				febVO.setIntMath(strMath);
				febVO.getIntMath();
				if (febVO.getIntMath() < 0) {
					System.out.println("�������� ��ȿ�� �˻����");
					continue;
				}
				break;
			}
			break;
		}// while end
		febVO.print();
	}

}
