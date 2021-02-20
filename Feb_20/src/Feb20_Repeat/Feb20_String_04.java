package Feb20_Repeat;

import java.util.Scanner;

public class Feb20_String_04 {

//	public static void main(String[] args) {

	public void array(){
	
		Scanner scan = new Scanner(System.in);

		String[] strSub = new String[3];
		String[] strName = new String[] { "최광우" };
		int[] intScore = new int[3];

		for (int i = 0; i < strSub.length; i++) {

			System.out.print("과목명 입력 : ");
			strSub[i] = scan.nextLine();
		}

		for (int i = 0; i < strSub.length; i++) {

			System.out.print(strSub[i] + "점수 입력 : ");
			intScore[i] = scan.nextInt();
		}
		
		System.out.println("=========================");
		System.out.println("점수확인 프로그램");
		System.out.println("=========================");
		System.out.print("최광우(1입력) : ");
		int choi = scan.nextInt();

		if (choi == 1) {
			System.out.println(strName[0] + "점수");
			System.out.println(strSub[0] + "점수 : " + intScore[0]);
			System.out.println(strSub[1] + "점수 : " + intScore[1]);
			System.out.println(strSub[2] + "점수 : " + intScore[2]);
		}
	}

}
