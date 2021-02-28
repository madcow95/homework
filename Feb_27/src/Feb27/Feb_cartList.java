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
		
		System.out.print("구매자이름 입력 : ");
		String strUName = scan.nextLine();
		cartVO[0].setCartUserName(strUName);
		
		System.out.print("상품명 입력 : ");
		String strPName = scan.nextLine();
		cartVO[0].setCartPName(strPName);
		
		System.out.print("수량 입력 : ");
		String strQty = scan.nextLine();
		int iQty = Integer.valueOf(strQty);
		cartVO[0].setCartQty(iQty);
		
		System.out.print("가격 입력 : ");
		String strPrice = scan.nextLine();
		int iPrice = Integer.valueOf(strPrice);
		cartVO[0].setCartPrice(iPrice);
		
		System.out.println(cartVO[0].toString());
		System.out.println("=======================================================================================================");
		for(int i = 0; i < cartVO.length; i++) {
			System.out.print("구매자이름 입력 : ");
			strUName = scan.nextLine();
			cartVO[i].setCartUserName(strUName);
			
			System.out.print("상품명 입력 : ");
			strPName = scan.nextLine();
			cartVO[i].setCartPName(strPName);
			
			System.out.print("수량 입력 : ");
			strQty = scan.nextLine();
			iQty = Integer.valueOf(strQty);
			cartVO[i].setCartQty(iQty);
			
			System.out.print("가격 입력 : ");
			strPrice = scan.nextLine();
			iPrice = Integer.valueOf(strPrice);
			cartVO[i].setCartPrice(iPrice);
			System.out.println("=======================================================================================================");	
			System.out.println(cartVO[i].toString());
			
		}
		
		
	}

}
