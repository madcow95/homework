package Feb22;

public class Feb_22_07 {
	
	public static void main(String[] args) {
		
		int intNum1 = 33;
		int intNum2 = 77;
		
		System.out.printf("num1 : %d num2 : %d\n",intNum1,intNum2);
		
		int num = intNum1;
		intNum1 = intNum2;
		intNum2 = num;
		
		System.out.printf("num1 : %d num2 : %d ",intNum1,intNum2);
	}

}
