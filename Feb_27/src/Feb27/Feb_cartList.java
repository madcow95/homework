package Feb27;

import java.util.Scanner;

import Feb27.Service.CartVO;

public class Feb_cartList {
	
	public static void main(String[] args) {
		
		CartVO[] cartVO = new CartVO[3];
		Scanner scan = new Scanner(System.in);
		
		for(int i = 0; i < cartVO.length; i++) {
			cartVO[i] = new CartVO();
		}
		
		System.out.print("�������̸� �Է� : ");
		String strUName = scan.nextLine();
		cartVO[0].setCartUserName(strUName);
		
		System.out.print("��ǰ�� �Է� : ");
		String strPName = scan.nextLine();
		cartVO[0].setCartPName(strPName);
		
		System.out.print("���� �Է� : ");
		String strQty = scan.nextLine();
		int iQty = Integer.valueOf(strQty);
		cartVO[0].setCartQty(iQty);
		
		System.out.print("���� �Է� : ");
		String strPrice = scan.nextLine();
		int iPrice = Integer.valueOf(strPrice);
		cartVO[0].setCartPrice(iPrice);
		
		System.out.println(cartVO[0].toString());
		System.out.println("=======================================================================================================");
		for(int i = 0; i < cartVO.length; i++) {
			System.out.print("�������̸� �Է� : ");
			strUName = scan.nextLine();
			cartVO[i].setCartUserName(strUName);
			
			System.out.print("��ǰ�� �Է� : ");
			strPName = scan.nextLine();
			cartVO[i].setCartPName(strPName);
			
			System.out.print("���� �Է� : ");
			strQty = scan.nextLine();
			iQty = Integer.valueOf(strQty);
			cartVO[i].setCartQty(iQty);
			
			System.out.print("���� �Է� : ");
			strPrice = scan.nextLine();
			iPrice = Integer.valueOf(strPrice);
			cartVO[i].setCartPrice(iPrice);
			System.out.println("=======================================================================================================");	
			System.out.println(cartVO[i].toString());
			
		}
		
		
	}

}
