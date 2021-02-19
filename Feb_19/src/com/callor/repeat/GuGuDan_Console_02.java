package com.callor.repeat;

import java.util.Scanner;

public class GuGuDan_Console_02 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		GuGuDan_Call guCall = new GuGuDan_Call();
		
		System.out.print("¸î´Ü >> ");
		int num = scan.nextInt();
		guCall.gugudan(num);;
		
	}

}
