package com.callor.shop;

import com.callor.shop.value.Values;

public class CartEx {

	public static void main(String args[]) {

		ShopMenu sm = new ShopMenu();
		ServiceShop ss = new ServiceShop();

		while (true) {
			Integer select = sm.menu();
			if (select == null) {
				break;
			}
			if(select >= Values.START_MENU && select <= Values.QUIT_MENU) {
				if(select == Values.MAKE_CART) {
					ss.makeCart();
				} else if(select == Values.SHOW_CART) {
					ss.allCartList();
				} else if(select == Values.PRINT_CART) {
					ss.userCartList();
				}
			} else {
				System.out.printf("%d ~ %d의 수만 입력하세요\n",
						Values.START_MENU,
						Values.QUIT_MENU);
			}
		}
		System.out.println("프로그램 종료!");

	}

}
