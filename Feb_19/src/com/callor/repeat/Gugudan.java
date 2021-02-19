package com.callor.repeat;

public class Gugudan {

	public void gugu() {

		for (int dan = 2; dan < 10; dan++) {
			
			for (int i = 0; i < 9; i++) {
				int i2 = i + 1;

				System.out.println(dan + " x " + i2 + " = " + (dan * i2));
			}
		}
	}

}
