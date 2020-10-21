package com.amazon.controller;

import java.util.ArrayList;
import java.util.List;

import com.amazon.model.Billing;
import com.amazon.model.Order;
import com.amazon.model.Product;
import com.amazon.model.ShoppingCart;

public class ShoppingCartController {

	private ShoppingCart cart = new ShoppingCart();
	private int count = 400;
	private List<Product> prodList = new ArrayList<Product>();

	public ShoppingCart addtoCart(Product p) {

		cart.setCartId(count + 1);
		prodList.add(p);
		cart.setProdList(prodList);
		cart.setProdList(prodList);

		return null;
	}

	public ShoppingCart removeFromCart(Product p) {
		if (cart.getProdList().contains(p)) {
			cart.getProdList().remove(p);
		}
		
		return cart;
	}

	public ShoppingCart getcart() {

		return cart;
	}

	public Order buy(ShoppingCart sc, Billing bl) {
		
		OrderController orderController = new OrderController();
		Order order = orderController.createOrder(cart);
		order.setCart(sc);
		return order;
	}
}
