package Feb23;

public class Feb_23_07 {
	
	public void prime(int num) {
		
		System.out.print("�����Է� : ");
		
		int i = 0;
		for(i = 2; i < num; i++) {
			
			if(num % i == 0) {
				break;
			}
		}
		if(num > i) {
			System.out.println(num + "��(��) �Ҽ�x");
		}
		else {
			System.out.println(num + "��(��) �Ҽ�o");
		}
		
	}

}
