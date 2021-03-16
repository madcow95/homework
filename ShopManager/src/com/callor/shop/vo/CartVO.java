package com.callor.shop.vo;

public class CartVO {
	
	private String userName;
	private String pName;
	private String date;
	private String time;
	private int qty;
	private int price;
	private int total;
	
	public CartVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CartVO(String userName, String pName, String date, String time, int qty, int price, int total) {
		super();
		this.userName = userName;
		this.pName = pName;
		this.date = date;
		this.time = time;
		this.qty = qty;
		this.price = price;
		this.total = total;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	@Override
	public String toString() {
		return "CartVO [userName=" + userName + ", pName=" + pName + ", date=" + date + ", time=" + time + ", qty="
				+ qty + ", price=" + price + ", total=" + total + "]";
	}
	
	
}
