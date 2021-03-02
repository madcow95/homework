package Mar02.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Mar02.console.Mar02void;
import Mar02.inter.inter01;

public class Mar02_service implements inter01 {

	Mar02void marVoid;
	Scanner scan;
	List<Mar02void> marList;

	public Mar02_service() {
		marVoid = new Mar02void();
		scan = new Scanner(System.in);
		marList = new ArrayList<Mar02void>();
	}

	@Override
	public void input() {

		System.out.println("============================");
		System.out.println("��ٱ��Ͽ� �ֱ�");
		System.out.println("----------------------------");

			System.out.print("�̸� �Է� : ");
			String strName = scan.nextLine();

			System.out.print("ǰ�� �Է� : ");
			String proName = scan.nextLine();

			int intQty = 0;
			while (true) {
				System.out.print("���� �Է� : ");
				String strQty = scan.nextLine();
				try {
					intQty = Integer.valueOf(strQty);
					if (intQty < 1) {
						System.out.println("1 �̻��� ���� �Է��ϼ���");
					} else {
						break;
					}
				} catch (Exception e) {
					System.out.println("���ڸ� �Է��ϼ���");

				}
			}

			int intPrice = 0;
			while (true) {
				System.out.print("���� �Է� : ");
				String strPrice = scan.nextLine();
				try {
					intPrice = Integer.valueOf(strPrice);
					if (intPrice < 1000) {
						System.out.println("1000 �̻��� ���� �Է��ϼ���");
					} else {
						break;
					}
				} catch (Exception e) {
					System.out.println("���ڸ� �Է��ϼ���");
				}

			}

			marVoid = new Mar02void();
			marVoid.setName(strName);
			marVoid.setProductName(proName);
			marVoid.setQty(intQty);
			marVoid.setPrice(intPrice);
			marList.add(marVoid);
	} // end input

	@Override
	public void print() {
		int nSize = 0;
		nSize = marList.size();
		System.out.println("---------------------------------");
		System.out.println("�̸�\tǰ��\t����\t����");
		System.out.println("---------------------------------");
		for (int i = 0; i < nSize; i++) {
			System.out.printf("%s\t%s\t%d\t%d\n",marList.get(i).getName(),
					marList.get(i).getProductName(),
					marList.get(i).getQty(),
					marList.get(i).getPrice());
			System.out.println("---------------------------------");
		}

	}

}
