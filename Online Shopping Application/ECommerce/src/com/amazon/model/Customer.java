package com.amazon.model;

public class Customer {

	private int custId;

	private String custName;

	private Address custAddress;

	private ShoppingCart cart;

	public void setCustId(int custId) {
		this.custId = custId;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public void setCustAddress(Address custAddress) {
		this.custAddress = custAddress;
	}

	public void setCart(ShoppingCart cart) {
		this.cart = cart;
	}

	public String showCustomer() {
		return "Customer [custId=" + custId + ", custName=" + custName + ", custAddress=" + custAddress + ", cart="
				+ cart + "]";
	}

}
