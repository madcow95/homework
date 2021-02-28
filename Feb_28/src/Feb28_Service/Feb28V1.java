package Feb28_Service;

import java.util.Scanner;

public class Feb28V1 {

	public static void main(String[] args) {

		CartVO[] cVO = new CartVO[3];
		Scanner scan = new Scanner(System.in);
		for (int i = 0; i < cVO.length; i++) {
			cVO[i] = new CartVO();
		}

		System.out.print("이름입력 : ");
		String userName = scan.nextLine();
		cVO[0].setCartUserName(userName);
		System.out.print("물품입력 : ");
		String prodName = scan.nextLine();
		cVO[0].setCartPName(prodName);
		System.out.print("수량입력 : ");
		String strQty = scan.nextLine();
		int intQty = Integer.valueOf(strQty);
		cVO[0].setCartQty(intQty);
		System.out.print("가격입력 : ");
		String strPrice = scan.nextLine();
		int intPrice = Integer.valueOf(strPrice);
		cVO[0].setCartPrice(intPrice);
		
		System.out.print("이름입력 : ");
		userName = scan.nextLine();
		cVO[1].setCartUserName(userName);
		System.out.print("물품입력 : ");
		prodName = scan.nextLine();
		cVO[1].setCartPName(prodName);
		System.out.print("수량입력 : ");
		strQty = scan.nextLine();
		intQty = Integer.valueOf(strQty);
		cVO[1].setCartQty(intQty);
		System.out.print("가격입력 : ");
		strPrice = scan.nextLine();
		intPrice = Integer.valueOf(strPrice);
		cVO[1].setCartPrice(intPrice);
		
		System.out.print("이름입력 : ");
		userName = scan.nextLine();
		cVO[2].setCartUserName(userName);
		System.out.print("물품입력 : ");
		prodName = scan.nextLine();
		cVO[2].setCartPName(prodName);
		System.out.print("수량입력 : ");
		strQty = scan.nextLine();
		intQty = Integer.valueOf(strQty);
		cVO[2].setCartQty(intQty);
		System.out.print("가격입력 : ");
		strPrice = scan.nextLine();
		intPrice = Integer.valueOf(strPrice);
		cVO[2].setCartPrice(intPrice);

		for (int i = 0; i < cVO.length; i++) {
			System.out.println("이름\t물품\t수량\t가격");
			System.out.printf("%s\t%s\t%d\t%d\n",
					cVO[i].getCartUserName(),
					cVO[i].getCartPName(),
					cVO[i].getCartQty(),
					cVO[i].getCartPrice());
			System.out.println("=========================================");
		}
	}

}
