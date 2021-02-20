package Feb20_Repeat;

public class Feb20_String_02 {
	
	public static void main(String args[]) {
		
		String[] strSub = new String[]{"국어","수학","영어"};
		
		int[] intNum = new int[] {90,80,70};
		
		for(int i = 0 ; i < strSub.length ; i++) {
			
			System.out.println(strSub[i] + ":\t" + intNum[i] + "점");
		}
		
		
	}

}
