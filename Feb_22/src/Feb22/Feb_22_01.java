package Feb22;

import java.util.Scanner;

public class Feb_22_01 {
	
	public static void main(String args[]) {
		
		int[] intKor = new int[3];
		int[] intEng = new int[3];
		int[] intMath = new int[3];
		Scanner scan = new Scanner(System.in);
		
		for(int i = 0 ; i < intKor.length ; i++) {
			
			System.out.print("���������Է� : ");
			intKor[i] = scan.nextInt();
			System.out.print("���������Է� : ");
			intEng[i] = scan.nextInt();
			System.out.print("���������Է� : ");
			intMath[i] = scan.nextInt();
		}
		System.out.println("=================================");
		System.out.println("����\t����\t����");
		System.out.println("---------------------------------");
		
		for(int i = 0 ; i < intKor.length ; i++) {
			System.out.printf("%d\t%d\t%d\n",intKor[i],intEng[i],intMath[i]);
		}
		
	}

}
