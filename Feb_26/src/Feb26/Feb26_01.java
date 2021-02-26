package Feb26;

import Feb26.Service.CartVO;

public class Feb26_01 {

	public static void main(String[] args) {

		CartVO[] cartVO = new CartVO[3];
		for (int i = 0; i < 3; i++) {
			cartVO[i]= new CartVO();
		}
		
		cartVO[0].setCartUserName("홍길동");
		cartVO[0].setCartPName("컴퓨터");
		cartVO[0].setCartQty(10);
		cartVO[0].setCartPrice(1500);
		
		cartVO[1].setCartUserName("홍길동");
		cartVO[1].setCartPName("컴퓨터");
		cartVO[1].setCartQty(10);
		cartVO[1].setCartPrice(1500);
		
		cartVO[2].setCartUserName("홍길동");
		cartVO[2].setCartPName("컴퓨터");
		cartVO[2].setCartQty(10);
		cartVO[2].setCartPrice(1500);
		
		for(int i = 0; i < cartVO.length; i++) {
			System.out.println(cartVO[i].toString());
			System.out.println("-------------------------------------");
		}
		
		
	}

}
