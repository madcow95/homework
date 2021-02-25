package Feb25;

import java.util.Scanner;

public class Feb25_02_Console {
	
	public static void main(String args[]) {
		
		Feb25_02 feb25 = new Feb25_02();
		Scanner scan = new Scanner(System.in);
		
		System.out.print("상품코드 입력 : ");
		feb25.PCode = scan.nextLine();
		
		System.out.print("상품명 입력 : ");
		feb25.PName = scan.nextLine();
		
		System.out.print("거래처 입력 : ");
		feb25.depart = scan.nextLine();
		
		System.out.print("품목 입력 : ");
		feb25.itemN = scan.nextLine();
		
		System.out.print("매입단가 입력 : ");
		String strIPrice = scan.nextLine();
		feb25.iPrice = Integer.valueOf(strIPrice);
		
		System.out.print("매출단가 입력 : ");
		String strOPrice = scan.nextLine();
		feb25.oPrice = Integer.valueOf(strOPrice);
	}

}
