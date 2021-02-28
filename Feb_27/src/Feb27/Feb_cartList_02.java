package Feb27;

import java.util.Scanner;

import Feb27.Service.CartVO;

public class Feb_cartList_02 {

	public static void main(String[] args) {

		CartVO[] cVO = new CartVO[3];
		Scanner scan = new Scanner(System.in);

		for (int i = 0; i < cVO.length; i++) {
			cVO[i] = new CartVO();
		}

		for (int i = 0; i < cVO.length; i++) {
			System.out.print("�̸� �Է� : ");
			String strName = scan.nextLine();
			cVO[i].setCartUserName(strName);

			System.out.print("��ǰ�̸� �Է� : ");
			String strPName = scan.nextLine();
			cVO[i].setCartPName(strPName);
			
			int intQty = 0;
			while (true) {
				System.out.print("���� �Է� : ");
				String strQty = scan.nextLine();
				try {
					intQty = Integer.valueOf(strQty);
					if (intQty >= 1) {
						cVO[i].setCartQty(intQty);
						break;
					} else {
						System.out.println("1 �̻��� ���� �Է��ϼ���");
						continue;
					}
				} catch (NumberFormatException e) {
					System.out.println("���ڸ� �Է��ϼ���");
				}

			}
			while (true) {
				System.out.print("���� �Է� : ");
				String strPrice = scan.nextLine();
				
				try {
					int intPrice = Integer.valueOf(strPrice);
					if (intPrice >= 1000) {
						cVO[i].setCartPrice(intPrice);
						break;
					} else {
						System.out.println("1000 �̻��� ���� �Է��ϼ���");
						continue;
					}
				} catch (NumberFormatException e) {
					System.out.println("���ڸ� �Է��ϼ���");
				}
			} // end while
			System.out.println("=================================");
			System.out.println("�̸�\t��ǰ\t����\t����");
			System.out.printf("%s\t%s\t%d\t%d\n", cVO[i].getCartUserName(), cVO[i].getCartPName(), cVO[i].getCartQty(),
					cVO[i].getCartPrice());
			System.out.println("=================================");
		} // end for

	}// end main

}
