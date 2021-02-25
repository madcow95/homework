package Feb25;

import java.util.Scanner;

public class Feb25_03_Console {

	public static void main(String[] args) {

		Feb25_03 febVO = new Feb25_03();
		Scanner scan = new Scanner(System.in);
		while (true) {
			System.out.print("학생이름 입력 : ");
			String strName = scan.nextLine();
			febVO.setStrName(strName);
			febVO.getStrName(strName);

			while (true) {
				System.out.print("국어점수입력 : ");
				String strKor = scan.nextLine();
				febVO.setIntKor(strKor);
				febVO.getIntKor();
				if (febVO.getIntKor() < 0) {
					System.out.println("국어점수 유효성 검사 실패");
					continue;
				}
				break;
			}
			while (true) {
				System.out.print("영어점수입력 : ");
				String strEng = scan.nextLine();
				febVO.setIntEng(strEng);
				febVO.getIntEng();
				if (febVO.getIntEng() < 0) {
					System.out.println("영어점수 유효성 검사 실패");
					continue;
				}
				break;
			}
			while (true) {
				System.out.print("수학점수입력 : ");
				String strMath = scan.nextLine();
				febVO.setIntMath(strMath);
				febVO.getIntMath();
				if (febVO.getIntMath() < 0) {
					System.out.println("수학점수 유효성 검사실패");
					continue;
				}
				break;
			}
			break;
		}// while end
		febVO.print();
	}

}
