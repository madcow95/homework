package Feb22;

import java.util.Scanner;

public class Feb_22_03 {
	
	public static void main(String[] args) {
		
		String[] strName = new String[] {"ȫ�浿", "�̸���", "������"};
		int[] intKor = new int[strName.length];
		int[] intEng = new int[strName.length];
		int[] intMath = new int[strName.length];
		Scanner scan = new Scanner(System.in);
		
		for(int i = 0 ; i < strName.length ; i++) {
			
			System.out.print(strName[i] + " ���������Է� : ");
			String strKor = scan.nextLine();
			intKor[i] = Integer.valueOf(strKor);
			
			System.out.print(strName[i] + " ���������Է� : ");
			String strEng = scan.nextLine();
			intEng[i] = Integer.valueOf(strEng);
			
			System.out.print(strName[i] + " ���������Է� : ");
			String strMath = scan.nextLine();
			intMath[i] = Integer.valueOf(strMath);
		}
		
		System.out.println("================================");
		System.out.println("�̸�\t����\t����\t����");
		System.out.println("--------------------------------");
		
		for(int i = 0 ; i < strName.length ; i++) {
			
			System.out.printf("%s\t%d\t%d\t%d\n",strName[i],intKor[i],intEng[i],intMath[i]);
		}
		System.out.println("--------------------------------");
	}

}
