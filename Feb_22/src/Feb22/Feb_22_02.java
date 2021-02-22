package Feb22;

import java.util.Scanner;

public class Feb_22_02 {
	
	public static void main(String args[]) {
		
		Scanner scan = new Scanner(System.in);
		String[] strName = new String[3];
		int[] intKor = new int[3];
		int[] intEng = new int[3];
		int[] intMath = new int[3];
		
		for(int i = 0 ; i < strName.length ; i++) {
			
			System.out.print("이름 입력 : ");
			strName[i] = scan.nextLine();
		}
		
		for(int i = 0 ; i < strName.length ; i++) {
			
			System.out.print(strName[i] + " 국어점수입력 : ");
			String strKor = scan.nextLine();
			intKor[i] = Integer.valueOf(strKor);
			System.out.print(strName[i] + " 영어점수입력 : ");
			String strEng = scan.nextLine();
			intEng[i] = Integer.valueOf(strEng);
			System.out.print(strName[i] + " 수학점수입력 : ");
			String strMath = scan.nextLine();
			intMath[i] = Integer.valueOf(strMath);
		}
		
		System.out.println("==================================");
		System.out.println("이름\t국어\t영어\t수학");
		System.out.println("----------------------------------");
		
		for(int i = 0 ; i < strName.length ; i++) {
			
			System.out.printf("%s\t%d\t%d\t%d\n",strName[i],intKor[i],intEng[i],intMath[i]);
		}
		System.out.println("----------------------------------");
	}

}
