package Feb20_Repeat;

import java.util.Scanner;

public class Feb20_String_04 {

//	public static void main(String[] args) {

	public void array(){
	
		Scanner scan = new Scanner(System.in);

		String[] strSub = new String[3];
		String[] strName = new String[] { "�ֱ���" };
		int[] intScore = new int[3];

		for (int i = 0; i < strSub.length; i++) {

			System.out.print("����� �Է� : ");
			strSub[i] = scan.nextLine();
		}

		for (int i = 0; i < strSub.length; i++) {

			System.out.print(strSub[i] + "���� �Է� : ");
			intScore[i] = scan.nextInt();
		}
		
		System.out.println("=========================");
		System.out.println("����Ȯ�� ���α׷�");
		System.out.println("=========================");
		System.out.print("�ֱ���(1�Է�) : ");
		int choi = scan.nextInt();

		if (choi == 1) {
			System.out.println(strName[0] + "����");
			System.out.println(strSub[0] + "���� : " + intScore[0]);
			System.out.println(strSub[1] + "���� : " + intScore[1]);
			System.out.println(strSub[2] + "���� : " + intScore[2]);
		}
	}

}
