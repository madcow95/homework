package Feb23;

import java.util.Scanner;

public class Feb_23_07_Console {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		Feb_23_08 fe08 = new Feb_23_08();
		System.out.print("숫자입력 : ");
		int keyNum = scan.nextInt();
		
		int primeNum = fe08.prime(keyNum);
		
		if(primeNum == -1) {
			System.out.println("소수 x");
		}
		else {
			System.out.println("소수 o");
		}
	}

}
