package Feb24;

import java.util.Random;

public class Feb_02_Console {
	
	public static void main(String[] args) {
		
		Feb24_02 feb02 = new Feb24_02();
		String[] strName = {"È«±æµ¿", "ÀÌ¸ù·æ", "¼ºÃáÇâ", "Àå³ì¼ö", "ÀÓ²©Á¤"};
		int[] intKor = new int[strName.length];
		int[] intEng = new int[strName.length];
		int[] intMath = new int[strName.length];
		int[] intSum = new int[strName.length];
		float[] fAvg = new float[strName.length];
		Random rnd = new Random();
		
		for(int i = 0; i < strName.length; i++) {
			intKor[i] = rnd.nextInt(100) + 1;
			intEng[i] = rnd.nextInt(100) + 1;
			intMath[i] = rnd.nextInt(100) + 1;
		}
		for(int i = 0; i < strName.length; i++) {
			intSum[i] = feb02.scoreSum(intKor[i],intEng[i],intMath[i]);
		}
		for(int i = 0; i < strName.length; i++) {
			fAvg[i] = feb02.scoreAvg(intSum[i]);
		}
		System.out.println("========================================");
		System.out.println("ÀÌ¸§\t±¹¾î\t¿µ¾î\t¼öÇĞ\tÇÕ°è\tÆò±Õ");
		System.out.println("----------------------------------------");
		for(int i = 0; i < strName.length; i++) {
			feb02.scorePrint(strName[i], intKor[i], intEng[i], intMath[i],
					intSum[i], fAvg[i]);
		}
		System.out.println("----------------------------------------");
	}

}
