package com.callor.repeat;

import java.util.Scanner;

public class Feb_19_algebra {
	
	private int intNum1 = 0;
	private int intNum2 = 0;
	private Scanner scan = new Scanner(System.in);
	
	public void input(){
		
		System.out.print("ù��° ���� �Է� >> ");
		intNum1 = scan.nextInt();
		System.out.print("�ι�° ���� �Է� >> ");
		intNum2 = scan.nextInt();
	}
	
	public void algebra() {
		
		System.out.println(intNum1 + " + " + intNum2 + " = " + (intNum1 + intNum2));
		System.out.println(intNum1 + " x " + intNum2 + " = " + (intNum1 * intNum2));
		System.out.println(intNum1 + " - " + intNum2 + " = " + (intNum1 - intNum2));
		System.out.println(intNum1 + " / " + intNum2 + " = " + (intNum1 / intNum2));
	}

}
