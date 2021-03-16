package com.callor.shop;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.shop.service.ShopService;
import com.callor.shop.value.Valine;
import com.callor.shop.vo.CartVO;

public class ServiceShop implements ShopService {
	Scanner scan;
	List<CartVO> cartList;

	public ServiceShop() {
		scan = new Scanner(System.in);
		cartList = new ArrayList<CartVO>();
	}

	@Override
	public void makeCart() {

		System.out.println(Valine.dLine(50));
		System.out.println("정보입력(종료(Q))");
		System.out.println(Valine.sLine(50));

		System.out.print("구매자 입력 >> ");
		String userName = scan.nextLine();
		System.out.print("상품이름 입력 >> ");
		String pName = scan.nextLine();
		System.out.print("수량 입력 >> ");
		String strQty = scan.nextLine();
		int qty = Integer.valueOf(strQty);
		System.out.print("단가 입력 >> ");
		String strPrice = scan.nextLine();
		int price = Integer.valueOf(strPrice);

		CartVO vo = new CartVO();
		vo.setUserName(userName);
		vo.setpName(pName);
		vo.setQty(qty);
		vo.setPrice(price);
		vo.setTotal(price * qty);

		cartList.add(vo);

		System.out.println(userName + " 장바구니 추가 완료!");
	}

	@Override
	public void allCartList() {
		System.out.println(Valine.dLine(50));
		System.out.println("구매자\t상품명\t수량\t단가\t합계");
		System.out.println(Valine.sLine(50));
		int nSize = cartList.size();
		int count = 0;
		int sum = 0;
		System.out.println("전체 장바구니 리스트");
		System.out.println(Valine.sLine(50));
		for (int i = 0; i < nSize; i++) {
			++count;
			System.out.printf("%s\t%s\t%d\t%d\t%d\n",
					cartList.get(i).getUserName(),
					cartList.get(i).getpName(),
					cartList.get(i).getQty(),
					cartList.get(i).getPrice(),
					cartList.get(i).getTotal());
			sum += cartList.get(i).getTotal();
		}
		System.out.println(Valine.dLine(50));
		System.out.printf("합계\t%d가지\t\t\t%d\n",
				count,
				sum);
	}

	@Override
	public void userCartList() {
		System.out.println(Valine.dLine(50));
		System.out.print("확인할 구매자 입력 >> ");
		
		String name = scan.nextLine();
		System.out.println(Valine.dLine(50));
		System.out.println("구매자\t상품명\t수량\t단가\t합계");
		System.out.println(Valine.sLine(50));
		int nSize = cartList.size();
		int count = 0;
		int sum = 0;
		System.out.println("* " + name + " 장바구니 리스트");
		System.out.println(Valine.sLine(50));
		for (int i = 0; i < nSize; i++) {
			if (name.equals(cartList.get(i).getUserName())) {
				++count;
				System.out.printf("%s\t%s\t%d\t%d\t%d\n",
						cartList.get(i).getUserName(),
						cartList.get(i).getpName(),
						cartList.get(i).getQty(),
						cartList.get(i).getPrice(),
						cartList.get(i).getTotal());
				sum += cartList.get(i).getTotal();
			}
			
		}
		System.out.println(Valine.dLine(50));
		System.out.printf("합계\t%d가지\t\t\t%d\n",
				count,
				sum);
	}

}
