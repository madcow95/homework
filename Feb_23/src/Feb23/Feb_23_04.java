package Feb23;

import java.util.Random;
import java.util.Scanner;

public class Feb_23_04 {
	
	public static void main(String args[]) {
		
		int[] intNums = new int[100];
		Random rnd = new Random();
		Scanner scan = new Scanner(System.in);

		for (int i = 0; i < intNums.length; i++) {

			intNums[i] = rnd.nextInt(10) + 1;
		}

		System.out.print("�����Է� (1 ~ 10) : ");
		int keyNum = scan.nextInt();
		
		System.out.println(keyNum + "��(��)");
		int lastNum = 0;
		int i = 0;
		for (i = 0; i < intNums.length; i++) {

			if (intNums[i] == keyNum) {
				lastNum = i;
			}
		}
		System.out.println(keyNum + "��(��)" + lastNum + "�� °�� ���������� ��Ÿ��");
		
		for (i = 0; i < intNums.length; i++) {
			System.out.print(intNums[i] + ", ");
			if ((i + 1) % 5 == 0) {
				
				System.out.println();
			}
		}
		
	}

}
