package Feb25;

import java.util.Scanner;

public class Feb25_02_Console3 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		Feb25_02[] feb25 = new Feb25_02[5];

		for (int i = 0; i < feb25.length; i++) {
			feb25[i] = new Feb25_02();
		}

		for (int i = 0; i < feb25.length; i++) {
			System.out.println((i + 1) + "번째 상품정보입력");
			System.out.print("상품코드 입력 : ");
			feb25[i].PCode = scan.nextLine();

			System.out.print("상품명 입력 : ");
			feb25[i].PName = scan.nextLine();

			System.out.print("거래처 입력 : ");
			feb25[i].depart = scan.nextLine();

			System.out.print("품목 입력 : ");
			feb25[i].itemN = scan.nextLine();
			while (true) {
				System.out.print("매입단가 입력 : ");
				String iPrice = scan.nextLine();
				feb25[i].iPrice = Integer.valueOf(iPrice);

				if (feb25[i].iPrice < 0) {
					System.out.println("0이상의 값을 입력해주세요");
				} else {
					break;
				}
			}
			
			while (true) {
				System.out.print("매출단가 입력 : ");
				String oPrice = scan.nextLine();
				feb25[i].oPrice = Integer.valueOf(oPrice);
				
				if (feb25[i].oPrice < 0) {
					System.out.println("0이상의 값을 입력해주세요");
				} else {
					break;
				}
			}
			feb25[i].print(i);
			System.out.println("=====================================");
		} // for end

	}

}
