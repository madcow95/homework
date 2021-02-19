package com.callor.repeat;

public class Repeat_Call {
	
	public static void main(String[] args) {
		
		Repeat_add re = new Repeat_add();
		
		int num1 = 88;
		int num2 = 99;
		
		int add = re.add(num1, num2);
		int subst = re.substraction(num1, num2);
		
		System.out.println(add);
		System.out.println(subst);
	}

}
