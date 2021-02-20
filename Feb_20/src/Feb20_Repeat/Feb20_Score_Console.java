package Feb20_Repeat;

import java.util.Scanner;

public class Feb20_Score_Console {

	public static void main(String args[]) {

		Feb20_Score feb = new Feb20_Score();
		Scanner scan = new Scanner(System.in);
		feb.score();

		System.out.println("=================================");
		System.out.println("점수확인 프로그램");
		System.out.println("=================================");
		
		while (true) {
			System.out.println("최광우 : 0\t곽승훈 : 1\t강대훈 : 2 (끝내려면 -1 입력)");
			System.out.print(" >> ");
			int num = scan.nextInt();
			if(num == -1) {
				System.out.println("프로그램 종료");
				break;
			}
			if(num < 0 || num > 2) {
				System.out.println("0, 1, 2만 입력해주세요");
			}
			
			feb.call(num);
			System.out.println("재입력 허쉴?");
		}
	}

}
