package Feb23;

public class Feb_23_08 {
	
	public int prime(int num) {
		
		int i = 0;
		for(i = 2; i < num; i++) {
			
			if(num % i == 0) {
				return -1;
			}
		}
		return num;
	}

}
