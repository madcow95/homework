package Feb28_Service;

import java.util.Scanner;

public class Feb28V1 {

	public static void main(String[] args) {

		CartVO[] cVO = new CartVO[3];
		Scanner scan = new Scanner(System.in);
		for (int i = 0; i < cVO.length; i++) {
			cVO[i] = new CartVO();
		}

		System.out.print("�̸��Է� : ");
		String userName = scan.nextLine();
		cVO[0].setCartUserName(userName);
		System.out.print("��ǰ�Է� : ");
		String prodName = scan.nextLine();
		cVO[0].setCartPName(prodName);
		System.out.print("�����Է� : ");
		String strQty = scan.nextLine();
		int intQty = Integer.valueOf(strQty);
		cVO[0].setCartQty(intQty);
		System.out.print("�����Է� : ");
		String strPrice = scan.nextLine();
		int intPrice = Integer.valueOf(strPrice);
		cVO[0].setCartPrice(intPrice);
		
		System.out.print("�̸��Է� : ");
		userName = scan.nextLine();
		cVO[1].setCartUserName(userName);
		System.out.print("��ǰ�Է� : ");
		prodName = scan.nextLine();
		cVO[1].setCartPName(prodName);
		System.out.print("�����Է� : ");
		strQty = scan.nextLine();
		intQty = Integer.valueOf(strQty);
		cVO[1].setCartQty(intQty);
		System.out.print("�����Է� : ");
		strPrice = scan.nextLine();
		intPrice = Integer.valueOf(strPrice);
		cVO[1].setCartPrice(intPrice);
		
		System.out.print("�̸��Է� : ");
		userName = scan.nextLine();
		cVO[2].setCartUserName(userName);
		System.out.print("��ǰ�Է� : ");
		prodName = scan.nextLine();
		cVO[2].setCartPName(prodName);
		System.out.print("�����Է� : ");
		strQty = scan.nextLine();
		intQty = Integer.valueOf(strQty);
		cVO[2].setCartQty(intQty);
		System.out.print("�����Է� : ");
		strPrice = scan.nextLine();
		intPrice = Integer.valueOf(strPrice);
		cVO[2].setCartPrice(intPrice);

		for (int i = 0; i < cVO.length; i++) {
			System.out.println("�̸�\t��ǰ\t����\t����");
			System.out.printf("%s\t%s\t%d\t%d\n",
					cVO[i].getCartUserName(),
					cVO[i].getCartPName(),
					cVO[i].getCartQty(),
					cVO[i].getCartPrice());
			System.out.println("=========================================");
		}
	}

}
