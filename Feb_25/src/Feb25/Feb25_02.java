package Feb25;

public class Feb25_02 {

	public String PCode; // 상품코드
	public String PName; // 상품명
	public String itemN; // 품목명
	public String depart; // 거래처
	public int iPrice; // 매입단가
	public int oPrice; // 매출단가

	public void print(int i) {
		System.out.println("==========================");
		System.out.println((i + 1) + "번째 프로그램 내용 확인");
		System.out.println("==========================");
		System.out.printf("상품코드 : %s\n",this.PCode);
		System.out.printf("상품명 : %s\n",this.PName);
		System.out.printf("거래처 : %s\n",this.depart);
		System.out.printf("품목 : %s\n",this.itemN);
		System.out.printf("매입단가 : %s\n",this.iPrice);
		System.out.printf("매출단가 : %s\n",this.oPrice);

	}
}
