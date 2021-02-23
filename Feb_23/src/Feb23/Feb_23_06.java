package Feb23;

import java.util.Scanner;

public class Feb_23_06 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("숫자입력 : ");
		int keyNum = scan.nextInt();
		
		int i = 0;
		for(i = 2; i < keyNum; i++) {
			
			if(keyNum % i == 0) {
				break;
			}
		}
		if(keyNum > i) {
			System.out.println(keyNum + "은(는) 소수x");
		}
		else {
			System.out.println(keyNum + "은(는) 소수o");
		}
		
	}

}
