package com.amazon.model;

public class Order {

	private int orderId;
	private int custId;
	private Address shippingAddress;
	private ShoppingCart cart;
	private float totalPrice;

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public void setCustId(int custId) {
		this.custId = custId;
	}

	public void setShippingAddress(Address shippingAddress) {
		this.shippingAddress = shippingAddress;
	}

	public void setCart(ShoppingCart cart) {
		this.cart = cart;
	}

	public void setTotalPrice(float totalPrice) {
		this.totalPrice = totalPrice;
	}

	public String showOrder() {
		return "Order [orderId=" + orderId + ", custId=" + custId + ", shippingAddress=" + shippingAddress + ", cart="
				+ cart + ", totalPrice=" + totalPrice + "]";
	}

}
