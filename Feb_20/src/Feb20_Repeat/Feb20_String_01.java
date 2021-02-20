package Feb20_Repeat;

public class Feb20_String_01 {
	
	public static void main(String args[]) {
		
		int[] strNum = new int[3];
		
		strNum[0] = 20;
		strNum[1] = 55;
		strNum[2] = 44;
		
		int intNum = 0;
		for(int i = 0 ; i < strNum.length ; i++) {
			
			intNum = strNum[i];
			System.out.println(intNum);
		}
		
	}

}
