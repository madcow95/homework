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

		System.out.print("�����Է� (1 ~ 10) : ");
		int keyNum = scan.nextInt();
		System.out.println(keyNum + "��");
		// intNums[i]�� 1 ~ 10�� ���� �� �������� ���ڰ� 100�� ����Ǿ� �ִ� �迭
		// intNums[i]�迭 �� i�� ° ����� �������� ���� �Է��� �� keyNum�� ���� �� ����� �迭�� ������
		// i���� ��½��� �� ��°�� ��Ÿ������ �� �� �ִ�.
		for (int i = 0; i < intNums.length; i++) {

			if (intNums[i] == keyNum) {
				System.out.println(i + "�� °�� ��Ÿ����.");
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
