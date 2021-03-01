package Mar01_Book;

public class Mar01_Book_152_02 {
	
	private double oderNum;
	private String userId;
	private String date;
	private String userName;
	private String pNum;
	private String addr;
	public double getOderNum() {
		return oderNum;
	}
	public void setOderNum(double oderNum) {
		this.oderNum = oderNum;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getpNum() {
		return pNum;
	}
	public void setpNum(String pNum) {
		this.pNum = pNum;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	
	public static void main(String[] args) {
		
		Mar01_Book_152_02 mar02 = new Mar01_Book_152_02();
		mar02.setOderNum(2018031200001d);
		mar02.setUserId("abc123");
		mar02.setDate("2018년 3월 12일");
		mar02.setUserName("홍길순");
		mar02.setpNum("PD0345-12");
		mar02.setAddr("서울시 영등포구 여의도동 20번지");
		
		System.out.printf("주문 번호 : %3.0f\n",mar02.getOderNum());
		System.out.printf("주문자 아이디 : %s\n",mar02.getUserId());
		System.out.printf("주문 날짜 : %s\n",mar02.getDate());
		System.out.printf("주문자 이름 : %s\n",mar02.getUserName());
		System.out.printf("주문 상품 번호 : %s\n",mar02.getpNum());
		System.out.printf("배송 주소 : %s\n",mar02.getAddr());
		
	}

}
