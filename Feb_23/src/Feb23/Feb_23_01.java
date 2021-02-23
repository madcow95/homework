package Feb23;

import java.util.Random;
import java.util.Scanner;

public class Feb_23_01 {

	public static void main(String args[]) {

		int[] intNums = new int[100];
		Random rnd = new Random();
		Scanner scan = new Scanner(System.in);

		for (int i = 0; i < intNums.length; i++) {

			intNums[i] = rnd.nextInt(10) + 1;
		}
		
		System.out.println("intNums[i]에 저장된 무작위 정수들");
		for (int i = 0; i < intNums.length; i++) {
			System.out.print(intNums[i] + ", ");
			if((i + 1) % 10 == 0) {
				System.out.println();
			}
		}
		System.out.print("숫자입력 (1 ~ 10) : ");
		int keyNum = scan.nextInt();
		
		if(keyNum > 10) {
			System.out.println("10이하의 수를 입력하세요");
			return;
		}
		if(keyNum < 1) {
			System.out.println("1이상의 수를 입력하세요");
			return;
		}
		int count = 0;
		for(int i = 0; i < intNums.length; i++) {
			
			if(intNums[i] == keyNum) {
				count++;
			}
		}
		System.out.println(count + "번 있다.");
	}

}
