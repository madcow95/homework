package Feb25;

import java.util.Scanner;

public class Feb25_02_Console2 {

	public static void main(String args[]) {

		Scanner scan = new Scanner(System.in);
		Feb25_02[] feb = new Feb25_02[5];
		// 배열 사용하기 위해 선언
		for (int i = 0; i < feb.length; i++) {
			feb[i] = new Feb25_02();
		}
		
		System.out.println("=========================");
		System.out.println("∥	상품정보	∥");
		System.out.println("=========================");
		
		// 상품정보 입력
		for (int i = 0; i < feb.length; i++) {
			System.out.print((i + 1) + "번째 상품코드 입력 : ");
			feb[i].PCode = scan.nextLine();
			System.out.print((i + 1) + "번째 상품명 입력 : ");
			feb[i].PName = scan.nextLine();
			System.out.print((i + 1) + "번째 거래처  입력 : ");
			feb[i].depart = scan.nextLine();
			System.out.print((i + 1) + "번째 품목 입력 : ");
			feb[i].itemN = scan.nextLine();
			System.out.print((i + 1) + "번째 매입단가 입력 : ");
			String striPrice = scan.nextLine();
			feb[i].iPrice = Integer.valueOf(striPrice);
			System.out.print((i + 1) + "번째 매출단가 입력 : ");
			String stroPrice = scan.nextLine();
			feb[i].oPrice = Integer.valueOf(stroPrice);
			System.out.println();
		} // for() end
		
		// 출력
		for(int i = 0; i < feb.length; i++) {
			System.out.println("==========================");
			System.out.println((i + 1) + "번째 프로그램 내용 확인");
			System.out.println("==========================");
			System.out.printf("상품코드 : %s\n",feb[i].PCode);
			System.out.printf("상품명 : %s\n",feb[i].PName);
			System.out.printf("거래처 : %s\n",feb[i].depart);
			System.out.printf("품목 : %s\n",feb[i].itemN);
			System.out.printf("매입단가 : %s\n",feb[i].iPrice);
			System.out.printf("매출단가 : %s\n",feb[i].oPrice);
		} // for() end
	}// main() end

} // class end
