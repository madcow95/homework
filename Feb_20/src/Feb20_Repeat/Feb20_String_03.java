package Feb20_Repeat;

import java.util.Scanner;

public class Feb20_String_03 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String[] strSub = new String[3];
		int[] intScore = new int[3];
		
		for(int i = 0 ; i < strSub.length ; i++) {
			System.out.print("���� �Է� : ");
			strSub[i] = scan.nextLine();
		}
		
		for(int i = 0 ; i < strSub.length ; i++) {
			System.out.print("���� �Է� : ");
			intScore[i] = scan.nextInt();
		}
		
			System.out.println(strSub[0] + "���� : " + intScore[0] + "��");
			System.out.println(strSub[1] + "���� : " + intScore[1] + "��");
			System.out.println(strSub[2] + "���� : " + intScore[2] + "��");
	}

}
