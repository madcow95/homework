package Feb23;

import java.util.Random;
import java.util.Scanner;

public class Feb_23_02 {

	public static void main(String[] args) {

		int[] intNums = new int[100];
		Random rnd = new Random();
		Scanner scan = new Scanner(System.in);

		for (int i = 0; i < intNums.length; i++) {

			intNums[i] = rnd.nextInt(10) + 1;
		}

		System.out.print("숫자입력 (1 ~ 10) : ");
		int keyNum = scan.nextInt();
		System.out.println(keyNum + "은");
		// intNums[i]는 1 ~ 10의 숫자 중 무작위의 숫자가 100개 저장되어 있는 배열
		// intNums[i]배열 중 i번 째 저장된 무작위의 수와 입력한 값 keyNum과 같을 때 저장된 배열의 순서인
		// i값을 출력시켜 몇 번째에 나타나는지 알 수 있다.
		for (int i = 0; i < intNums.length; i++) {

			if (intNums[i] == keyNum) {
				System.out.println(i + "번 째에 나타난다.");
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
