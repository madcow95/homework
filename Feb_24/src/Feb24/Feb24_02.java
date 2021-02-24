package Feb24;

public class Feb24_02 {

	public int scoreSum(int kor, int eng, int math) {
		int intSum = kor;
		intSum += eng;
		intSum += math;
		return intSum;
	}

	public float scoreAvg(int avg) {
		float favg = (float) avg / 3;
		return favg;
	}

	public void scorePrint(String strName, int kor, int eng, int math,
			int sum, float avg) {
		System.out.printf("%s\t%d\t%d\t%d\t%d\t%3.2f\n", strName, kor, eng, 
				math, sum, avg);
	}

}
