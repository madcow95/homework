package Feb25;

public class Feb25_03 {

	private String strName;
	private int intKor = -1;
	private int intEng = -1;
	private int intMath = -1;

	// 이름 호출
	public String getStrName(String strName) {

		return strName;
	}// getStrName() end

	// 이름 저장
	public void setStrName(String strName) {
		try {
			this.strName = strName;
		} catch (Exception e) {

		}
	} // setStrName() end

	public int getIntKor() {
		return intKor;
	}

	public void setIntKor(String strKor) {
		try {
			int kor = Integer.valueOf(strKor);
			if (kor >= 50 && kor <= 100) {
				this.intKor = kor;
			}
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

	public int getIntEng() {
		return intEng;
	}

	public void setIntEng(String strEng) {
		try {
			int eng = Integer.valueOf(strEng);
			if (eng >= 50 && eng <= 100) {
				this.intEng = eng;
			}
		} catch (Exception e) {

		}
	}

	public int getIntMath() {
		return intMath;
	}

	public void setIntMath(String strMath) {
		try {
			int math = Integer.valueOf(strMath);
			if (math >= 50 && math <= 100) {
				this.intMath = math;
			}
		} catch (Exception e) {
			// TODO: handle exception
		}

	}
	
	public void print() {
		System.out.println("==============================");
		System.out.println(strName + "성적");
		System.out.println("==============================");
		System.out.println("이름\t국어\t영어\t수학");
		System.out.printf("%s\t%d\t%d\t%d\n",strName,intKor,intEng,intMath);
		System.out.println("==============================");
	}

}
