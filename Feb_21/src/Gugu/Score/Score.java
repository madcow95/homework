package Gugu.Score;

import java.util.Scanner;

public class Score {

	private String[] strSub = new String[] { "����", "����", "����" };
	private String[] strName = new String[] { "�ֱ���", "������", "������" };
	private int[] intKor = new int[3];
	private int[] intMath = new int[3];
	private int[] intEng = new int[3];
	private Scanner scan = new Scanner(System.in);

	public void input() {

		for (int i = 0; i < strSub.length; i++) {

			System.out.print(strName[0] + " " + strSub[i] + "���� �Է� : ");
			intKor[i] = scan.nextInt();
		}
		for (int i = 0; i < strSub.length; i++) {

			System.out.print(strName[1] + " " + strSub[i] + "���� �Է� : ");
			intMath[i] = scan.nextInt();
		}
		for (int i = 0; i < strSub.length; i++) {

			System.out.print(strName[2] + " " + strSub[i] + "���� �Է� : ");
			intEng[i] = scan.nextInt();
		}

	}

	public void scoreCall(int call) {

		if (call == 0) {

			System.out.println(strName[0] + " ����");
			System.out.println(strSub[0] + " : " + intKor[0] + "��");
			System.out.println(strSub[1] + " : " + intMath[0] + "��");
			System.out.println(strSub[2] + " : " + intEng[0] + "��");
		}
		if (call == 1) {

			System.out.println(strName[1] + " ����");
			System.out.println(strSub[0] + " : " + intKor[1] + "��");
			System.out.println(strSub[1] + " : " + intMath[1] + "��");
			System.out.println(strSub[2] + " : " + intEng[1] + "��");
		}
		if (call == 2) {

			System.out.println(strName[2] + " ����");
			System.out.println(strSub[0] + " : " + intKor[2] + "��");
			System.out.println(strSub[1] + " : " + intMath[2] + "��");
			System.out.println(strSub[2] + " : " + intEng[2] + "��");
		}


	}

}
