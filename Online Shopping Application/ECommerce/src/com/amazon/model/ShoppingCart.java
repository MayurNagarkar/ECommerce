package com.amazon.model;

import java.util.List;

public class ShoppingCart {

	private int cartId;
	private List<Product> prodList;
	private float cartPrice;

	public void setCartId(int cartId) {
		this.cartId = cartId;
	}

	public void setProdList(List<Product> prodList) {
		this.prodList = prodList;
	}

	public void setCartPrice(float cartPrice) {
		this.cartPrice = cartPrice;
	}

	public String showShoppingCart() {
		return "ShoppingCart [cartId=" + cartId + ", prodList=" + prodList + ", cartPrice=" + cartPrice + "]";
	}

}
