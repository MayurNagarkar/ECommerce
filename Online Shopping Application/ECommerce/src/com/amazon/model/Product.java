package com.amazon.model;

public class Product {

	private int prodId;
	private String prodName;
	private int prodQuantity;
	private float prodUnitPrice;

	public int getProdId() {
		return prodId;
	}

	public void setProdId(int prodId) {
		this.prodId = prodId;
	}

	public String getProdName() {
		return prodName;
	}

	public void setProdName(String prodName) {
		this.prodName = prodName;
	}

	public int getProdQuantity() {
		return prodQuantity;
	}

	public void setProdQuantity(int prodQuantity) {
		this.prodQuantity = prodQuantity;
	}

	public float getProdUnitPrice() {
		return prodUnitPrice;
	}

	public void setProdUnitPrice(float prodUnitPrice) {
		this.prodUnitPrice = prodUnitPrice;
	}

	public String showProduct() {
		return "Product [prodId=" + prodId + ", prodName=" + prodName + ", prodQuantity=" + prodQuantity
				+ ", prodUnitPrice=" + prodUnitPrice + "]";
	}

}
