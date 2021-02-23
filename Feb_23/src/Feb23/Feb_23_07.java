package Feb23;

public class Feb_23_07 {
	
	public void prime(int num) {
		
		System.out.print("숫자입력 : ");
		
		int i = 0;
		for(i = 2; i < num; i++) {
			
			if(num % i == 0) {
				break;
			}
		}
		if(num > i) {
			System.out.println(num + "은(는) 소수x");
		}
		else {
			System.out.println(num + "은(는) 소수o");
		}
		
	}

}
