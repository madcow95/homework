package Feb22;

public class Feb_22_06 {
	
	public static void main(String args[]) {
		
		int[] intNums = new int[10];
		
		for(int i = 0 ; i < intNums.length ; i++) {
			intNums[i] = i + 1;
		}
		
		for(int i = 0 ; i < intNums.length ; i++) {
			System.out.printf("%s, ",intNums[i]);
		}
		
	}

}
