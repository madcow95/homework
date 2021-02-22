package Feb22;

import java.util.Random;

public class Feb_22_04 {
	
	public static void main(String[] args) {
		
		String[] strName = new String[] {"È«±æµ¿", "ÀÌ¸ù·æ", "¼ºÃáÇâ"};
		int[] intKor = new int[strName.length];
		int[] intEng = new int[strName.length];
		int[] intMath = new int[strName.length];
		Random rnd = new Random();
		
		for(int i = 0 ; i < strName.length ; i++) {
			
			intKor[i] = rnd.nextInt(100) + 1;
			intEng[i] = rnd.nextInt(100) + 1;
			intMath[i] = rnd.nextInt(100) + 1;
		}
		
		System.out.println("=============================");
		System.out.println("ÀÌ¸§\t±¹¾î\t¿µ¾î\t¼öÇĞ");
		System.out.println("-----------------------------");
		
		for(int i = 0 ; i < strName.length ; i++) {
			
			System.out.printf("%s\t%d\t%d\t%d\n",strName[i],intKor[i],intEng[i],intMath[i]);
		}
		System.out.println("-----------------------------");
	}

}
