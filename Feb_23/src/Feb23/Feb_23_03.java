package Feb23;

import java.util.Random;
import java.util.Scanner;

public class Feb_23_03 {

	public static void main(String[] args) {

		int[] intNums = new int[100];
		Random rnd = new Random();
		Scanner scan = new Scanner(System.in);

		for (int i = 0; i < intNums.length; i++) {

			intNums[i] = rnd.nextInt(10) + 1;
		}

		System.out.print("숫자입력 (1 ~ 10) : ");
		int keyNum = scan.nextInt();
		
		System.out.println(keyNum + "은(는)");
		for (int i = 0; i < intNums.length; i++) {

			if (intNums[i] == keyNum) {
				System.out.println(i + "번 째에 처음으로 나타난다.");
				break;
			}
		}
		
		for (int i = 0; i < intNums.length; i++) {
			System.out.print(intNums[i] + ", ");
			if ((i + 1) % 5 == 0) {
				
				System.out.println();
			}
		}
	}
}
