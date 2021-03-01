package Mar01_Book;

public class Mar01_Book_123_02 {
	
	public static void main(String[] args) {
		
		for(int dan = 2; dan < 10; dan++) {
			for(int i = 0; i < 9; i++) {
				int i2 = i + 1;
				if(dan >= i2) {
					System.out.println(dan + " x " + i2 + " = " + (dan * i2));
				}
			}System.out.println();
		}
		
	}

}
