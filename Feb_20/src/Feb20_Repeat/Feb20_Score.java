package Feb20_Repeat;

import java.util.Scanner;

public class Feb20_Score {

	private Scanner scan = new Scanner(System.in);
	private String[] strName = new String[] { "�ֱ���", "������", "������" };
	private String[] strSub = new String[] { "����", "����", "����" };
	private int[] intKor = new int[3];
	private int[] intEng = new int[3];
	private int[] intMath = new int[3];
	private int[] intCall = new int[] { 0, 1, 2 };

	public void score() {

		for (int i = 0; i < intKor.length; i++) {

			System.out.print(strName[i] + " " + strSub[0] + "�����Է� : ");
			intKor[i] = scan.nextInt();
		}
		for (int i = 0; i < intKor.length; i++) {

			System.out.print(strName[i] + " " + strSub[1] + "�����Է� : ");
			intEng[i] = scan.nextInt();
		}
		for (int i = 0; i < intKor.length; i++) {

			System.out.print(strName[i] + " " + strSub[2] + "�����Է� : ");
			intMath[i] = scan.nextInt();
		}
	}

	public void call(int call) {

		if (call == 0) {
			System.out.println(strName[0] + "����");
			System.out.println(strSub[0] + " : " + intKor[0] + "��");
			System.out.println(strSub[1] + " : " + intEng[0] + "��");
			System.out.println(strSub[2] + " : " + intMath[0] + "��");
		}
		if (call == 1) {
			System.out.println(strName[1] + "����");
			System.out.println(strSub[0] + " : " + intKor[1] + "��");
			System.out.println(strSub[1] + " : " + intEng[1] + "��");
			System.out.println(strSub[2] + " : " + intMath[1] + "��");
		}
		if (call == 2) {
			System.out.println(strName[2] + "����");
			System.out.println(strSub[0] + " : " + intKor[2] + "��");
			System.out.println(strSub[1] + " : " + intEng[2] + "��");
			System.out.println(strSub[2] + " : " + intMath[2] + "��");
		}
	}

}
