package com.callor.shop.value;

public class Valine {
	
	public static String dLine(int count) {
		
		return String.format("%0" + count + "d", 0).replace("0", "=");
	}
	
public static String sLine(int count) {
		
		return String.format("%0" + count + "d", 0).replace("0", "-");
	}

}
