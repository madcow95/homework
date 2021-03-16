package com.callor.iolist.vo;

public class FileVO {
	
	private String date;
	private String dept;
	private String pName;
	private String ceoName;
	private String devide;
	private int iPrice;
	private int oPrice;
	private int qty;
	private int totalIPrice;
	private int totalOPrice;

	public FileVO(String date, String dept, String pName, String ceoName, String devide, int iPrice, int oPrice,
			int qty, int totalIPrice, int totalOPrice) {
		super();
		this.date = date;
		this.dept = dept;
		this.pName = pName;
		this.ceoName = ceoName;
		this.devide = devide;
		this.iPrice = iPrice;
		this.oPrice = oPrice;
		this.qty = qty;
		this.totalIPrice = totalIPrice;
		this.totalOPrice = totalOPrice;
	}

	public FileVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public int getTotalIPrice() {
		return totalIPrice;
	}

	public void setTotalIPrice(int totalIPrice) {
		this.totalIPrice = totalIPrice;
	}

	public int getTotalOPrice() {
		return totalOPrice;
	}

	public void setTotalOPrice(int totalOPrice) {
		this.totalOPrice = totalOPrice;
	}

	public String getCeoName() {
		return ceoName;
	}
	public void setCeoName(String ceoName) {
		this.ceoName = ceoName;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public int getiPrice() {
		return iPrice;
	}
	public void setiPrice(int iPrice) {
		this.iPrice = iPrice;
	}
	public int getoPrice() {
		return oPrice;
	}
	public void setoPrice(int oPrice) {
		this.oPrice = oPrice;
	}
	public String getDevide() {
		return devide;
	}
	public void setDevide(String devide) {
		this.devide = devide;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}

	@Override
	public String toString() {
		return "FileVO [date=" + date + ", dept=" + dept + ", pName=" + pName + ", ceoName=" + ceoName + ", devide="
				+ devide + ", iPrice=" + iPrice + ", oPrice=" + oPrice + ", qty=" + qty + ", totalIPrice=" + totalIPrice
				+ ", totalOPrice=" + totalOPrice + "]";
	}
	
}
