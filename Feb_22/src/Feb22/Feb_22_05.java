package Feb22;

import java.util.Random;

public class Feb_22_05 {
	
	public static void main(String ags[]) {
		
		String[] strName = new String[] {"ȫ�浿", "�̸���", "������"};
		int[] intKor = new int[strName.length];
		int[] intEng = new int[strName.length];
		int[] intMath = new int[strName.length];
		int[] intSum = new int[strName.length];
		float[] fAvg = new float[strName.length];
		Random rnd = new Random();
		
		for(int i = 0 ; i < strName.length ; i++) {
			intKor[i] = rnd.nextInt(100) + 1;
			intEng[i] = rnd.nextInt(100) + 1;
			intMath[i] = rnd.nextInt(100) + 1;
		}
		
		for(int i = 0 ; i < strName.length ; i++) {
			intSum[i] = intKor[i];
			intSum[i] += intEng[i];
			intSum[i] += intMath[i];
		}
		
		for(int i = 0 ; i < strName.length ; i++) {
			fAvg[i] = intSum[i] / 3f;
		}
		
		System.out.println("==========================================");
		System.out.println("�̸�\t����\t����\t����\t����\t���");
		System.out.println("------------------------------------------");
		
		for(int i = 0 ; i < strName.length ; i++) {
			System.out.printf("%s\t%d\t%d\t%d\t%d\t%3.2f\n",strName[i],intKor[i],intEng[i],intMath[i],intSum[i],fAvg[i]);
		}
		
	}

}
