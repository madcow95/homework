package Mar02.console;

public class Mar02void {
	
	private String name;
	private String productName;
	private int qty;
	private int price;
	private int total;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
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
		return "Mar02void [name=" + name + ", productName=" + productName + ", qty=" + qty + ", price=" + price
				+ ", total=" + total + "]";
	}
	
	

}
