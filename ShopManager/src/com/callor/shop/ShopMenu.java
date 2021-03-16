package com.callor.shop;

import java.util.Scanner;

import com.callor.shop.value.Valine;
import com.callor.shop.value.Values;

public class ShopMenu {

	public Integer menu() {
		Scanner scan = new Scanner(System.in);

		while (true) {
			System.out.println(Valine.dLine(50));
			System.out.println("빛나라 쇼핑몰 2021");
			System.out.println(Valine.sLine(50));
			System.out.printf("%d. 장바구니 상품담기\n",
					Values.MAKE_CART);
			System.out.println("2. 장바구니 전체 리스트 보기");
			System.out.println("3. 구매자별 장바구니 리스트 보기");
			System.out.println("QUIT. 종료");
			System.out.println(Valine.dLine(50));
			System.out.print("선택 >> ");
			String strSelect = scan.nextLine();
			if (strSelect.equalsIgnoreCase("q")) {
				return null;
			}

			try {
				int select = Integer.valueOf(strSelect);
				if (select == Values.MAKE_CART) {
					return Values.MAKE_CART;
				} else if (select == Values.SHOW_CART) {
					return Values.SHOW_CART;
				} else if (select == Values.PRINT_CART) {
					return Values.PRINT_CART;
				}
			} catch (Exception e) {
				System.out.printf("Q / %d ~ %d만 입력하세요",
						Values.START_MENU,
						Values.QUIT_MENU);
			}
		}
	}

}
