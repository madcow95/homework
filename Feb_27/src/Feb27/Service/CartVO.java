package Feb27.Service;

	public class CartVO {
		// P : Product 		Std(규격) : Standard	 Qty(수량) : Quantity
		private String cartUserName;
		private String cartPName;
		private String cartStd;
		private String cartDate;
		private String cartTime;
		private int cartQty;
		private int cartPrice;
		private int cartTotal;
		
		public String getCartUserName() {
			return cartUserName;
		}

		public void setCartUserName(String cartUserName) {
			this.cartUserName = cartUserName;
		}

		public String getCartPName() {
			return cartPName;
		}

		public void setCartPName(String cartPName) {
			this.cartPName = cartPName;
		}

		public String getCartStd() {
			return cartStd;
		}

		public void setCartStd(String cartStd) {
			this.cartStd = cartStd;
		}

		public String getCartDate() {
			return cartDate;
		}

		public void setCartDate(String cartDate) {
			this.cartDate = cartDate;
		}

		public String getCartTime() {
			return cartTime;
		}

		public void setCartTime(String cartTime) {
			this.cartTime = cartTime;
		}

		public int getCartQty() {
			return cartQty;
		}

		public void setCartQty(int cartQty) {
			this.cartQty = cartQty;
		}

		public int getCartPrice() {
			return cartPrice;
		}

		public void setCartPrice(int cartPrice) {
			this.cartPrice = cartPrice;
		}

		public int getCartTotal() {
			return cartTotal;
		}

		public void setCartTotal(int cartTotal) {
			this.cartTotal = cartTotal;
		}

		@Override
		public String toString() {
			return "CartVO [cartUserName=" + cartUserName + ", cartPName=" + cartPName + ", cartStd=" + cartStd
					+ ", cartDate=" + cartDate + ", cartTime=" + cartTime + ", cartQty=" + cartQty + ", cartPrice="
					+ cartPrice + ", cartTotal=" + cartTotal + "]";
		}

}
