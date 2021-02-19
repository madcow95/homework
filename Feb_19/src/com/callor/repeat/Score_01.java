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
		
		System.out.print("국어점수 입력 : ");
		intKor = scan.nextInt();
		System.out.print("영어점수 입력 : ");
		intEng = scan.nextInt();
		System.out.print("수학점수 입력 : ");
		intMath = scan.nextInt();
	}
	
	public void sum() {
		
		
	}
	
	public void avg() {
		
		
	}
	
	public void floatAvg() {
		
		System.out.println("국어점수 : " + intKor + "점");
		System.out.println("영어점수 : " + intEng + "점");
		System.out.println("수학점수 : " + intMath + "점");
	}
}
