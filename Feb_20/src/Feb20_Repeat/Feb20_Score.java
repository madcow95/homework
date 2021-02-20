package Feb20_Repeat;

import java.util.Scanner;

public class Feb20_Score {

	private Scanner scan = new Scanner(System.in);
	private String[] strName = new String[] { "최광우", "곽승훈", "강대훈" };
	private String[] strSub = new String[] { "국어", "영어", "수학" };
	private int[] intKor = new int[3];
	private int[] intEng = new int[3];
	private int[] intMath = new int[3];
	private int[] intCall = new int[] { 0, 1, 2 };

	public void score() {

		for (int i = 0; i < intKor.length; i++) {

			System.out.print(strName[i] + " " + strSub[0] + "점수입력 : ");
			intKor[i] = scan.nextInt();
		}
		for (int i = 0; i < intKor.length; i++) {

			System.out.print(strName[i] + " " + strSub[1] + "점수입력 : ");
			intEng[i] = scan.nextInt();
		}
		for (int i = 0; i < intKor.length; i++) {

			System.out.print(strName[i] + " " + strSub[2] + "점수입력 : ");
			intMath[i] = scan.nextInt();
		}
	}

	public void call(int call) {

		if (call == 0) {
			System.out.println(strName[0] + "성적");
			System.out.println(strSub[0] + " : " + intKor[0] + "점");
			System.out.println(strSub[1] + " : " + intEng[0] + "점");
			System.out.println(strSub[2] + " : " + intMath[0] + "점");
		}
		if (call == 1) {
			System.out.println(strName[1] + "성적");
			System.out.println(strSub[0] + " : " + intKor[1] + "점");
			System.out.println(strSub[1] + " : " + intEng[1] + "점");
			System.out.println(strSub[2] + " : " + intMath[1] + "점");
		}
		if (call == 2) {
			System.out.println(strName[2] + "성적");
			System.out.println(strSub[0] + " : " + intKor[2] + "점");
			System.out.println(strSub[1] + " : " + intEng[2] + "점");
			System.out.println(strSub[2] + " : " + intMath[2] + "점");
		}
	}

}
