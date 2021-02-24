package Feb24;

import java.util.Random;

public class Feb24_01 {
	
	public static void main(String[] args) {
		
		Random rnd = new Random();
		String[] strName = {"홍길동", "이몽룡", "성춘향", "장녹수", "임꺽정"};
		String[] strAddr = {"서울시", "익산시", "남원시", "한양시", "함흥시"};
		int[] intKor = new int[strName.length];
		int[] intEng= new int[strName.length];
		int[] intMath = new int[strName.length];
		int[] intSum = new int[strName.length];
		float[] fAvg = new float[strName.length];
		
		for(int i = 0; i < strName.length; i++) {
			intKor[i] = rnd.nextInt(100) + 1;
			intEng[i] = rnd.nextInt(100) + 1;
			intMath[i] = rnd.nextInt(100) + 1;
		}
		
		for(int i = 0; i < strName.length; i++) {
			intSum[i] = intKor[i];
			intSum[i] += intEng[i];
			intSum[i] += intMath[i];
		}
		
		for(int i = 0; i < strName.length; i++) {
			fAvg[i] = (float)intSum[i] / 3;
		}
		
		System.out.println("=======================================================");
		System.out.println("이름\t주소\t국어\t영어\t수학\t총점\t평균");
		System.out.println("-------------------------------------------------------");
		for(int i = 0; i < strName.length; i++) {
			System.out.printf("%s\t%s\t%d\t%d\t%d\t%d\t%3.2f\n",strName[i],strAddr[i],intKor[i],intEng[i],intMath[i],intSum[i],fAvg[i]);
		}
		System.out.println("-------------------------------------------------------");
	}
}
