package com.madcow.method;

import java.util.Scanner;

public class Feb_18_Meth_02 {

	private Scanner scan = new Scanner(System.in);
	private int intNum1 = 0;
	private int intNum2 = 0;

	public void input() {
		
		System.out.print("ù��° ���� �Է� >> ");
		intNum1 = scan.nextInt();
		System.out.print("�ι�° ���� �Է� >> ");
		intNum2 = scan.nextInt();
		
		System.out.println(intNum1 + " + " + intNum2 + " = " + (intNum1 + intNum2));
		System.out.println(intNum1 + " - " + intNum2 + " = " + (intNum1 - intNum2));
		System.out.println(intNum1 + " * " + intNum2 + " = " + (intNum1 * intNum2));
		System.out.println(intNum1 + " / " + intNum2 + " = " + (intNum1 / intNum2));
		
	}
}
