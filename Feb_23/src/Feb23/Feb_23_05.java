package Feb23;

import java.util.Random;

public class Feb_23_05 {

	public static void main(String[] args) {

		int[] intNums = new int[100];
		Random rnd = new Random();

		for (int i = 0; i < intNums.length; i++) {

			intNums[i] = rnd.nextInt(100) + 1;
		}
		int intSum1 = 0;
		boolean bYes1;
		for (int i = 0; i < intNums.length; i++) {

			bYes1 = intNums[i] % 3 == 0;
			if (bYes1) {
				intSum1 += intNums[i];
			}
		}
		System.out.println();
		int intSum2 = 0;
		boolean bYes2;
		for (int i = 0; i < intNums.length; i++) {

			bYes2 = intNums[i] % 5 == 0;
			if (bYes2) {
				intSum2 += intNums[i];
			}
		}
		int rndSum = intSum1 + intSum2;
		System.out.println();
		System.out.println("랜덤 수 중 3의 배수와 5의 배수의 합 : " + rndSum);

	}

}
