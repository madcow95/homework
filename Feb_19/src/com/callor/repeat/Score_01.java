package com.callor.repeat;

import java.util.Scanner;

public class Score_01 {
	
	private Scanner scan = new Scanner(System.in);
	private int intKor = 0;
	private int intEng = 0;
	private int intMath = 0;
	private int intSum = 0;
	private int intfAvg = 0;
	
	public static void main(String args[]) {
		
		Score_01 score = new Score_01();
		score.input();
		score.floatAvg();
	}
	public void input() {
		
		System.out.print("�������� �Է� : ");
		intKor = scan.nextInt();
		System.out.print("�������� �Է� : ");
		intEng = scan.nextInt();
		System.out.print("�������� �Է� : ");
		intMath = scan.nextInt();
	}
	
	public void sum() {
		
		
	}
	
	public void avg() {
		
		
	}
	
	public void floatAvg() {
		
		System.out.println("�������� : " + intKor + "��");
		System.out.println("�������� : " + intEng + "��");
		System.out.println("�������� : " + intMath + "��");
	}
}
