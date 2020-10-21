package com.amazon.controller;

import java.util.List;

import com.amazon.model.Product;

public class ProductController {

	private int count=101;
	
	private List<Product> products;
	
	public Product createProduct() {
		Product p = new Product();
		p.setProdId(count+1);
		p.setProdName("ABC"+count+1);
		p.setProdQuantity(1);
		p.setProdUnitPrice((float)10.5);
		products.add(p);
		return p;
	}

	public Product updateProduct(Product p) {
		if (products.contains(p)) {
			products.add(products.indexOf(p), p);
		}
			
		return p;
	}

	public List<Product> listProducts(){
		
		return products;
	}

	public Product get(int id){
		
		for (Product product : products) {
			if (product.getProdId() == id) {
				return product;
			}
		}
		return null;
	} 
}
