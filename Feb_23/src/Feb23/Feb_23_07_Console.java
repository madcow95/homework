package Feb23;

import java.util.Scanner;

public class Feb_23_07_Console {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		Feb_23_08 fe08 = new Feb_23_08();
		System.out.print("�����Է� : ");
		int keyNum = scan.nextInt();
		
		int primeNum = fe08.prime(keyNum);
		
		if(primeNum == -1) {
			System.out.println("�Ҽ� x");
		}
		else {
			System.out.println("�Ҽ� o");
		}
	}

}
