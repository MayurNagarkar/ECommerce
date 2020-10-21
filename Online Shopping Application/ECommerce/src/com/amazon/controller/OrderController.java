package com.amazon.controller;

import com.amazon.model.Order;
import com.amazon.model.ShoppingCart;

public class OrderController {

	private Order order = new Order();
	private int count = 500;

	public Order createOrder(ShoppingCart sc) {

		order.setCart(sc);
		return order;

	}

	public Order updateOrder(ShoppingCart sc) {

		Order ordernew = order;
		ordernew.setOrderId(count + 1);
		ordernew.setCart(sc);
		System.out.println("Your Order has been placed");
		return ordernew;

	}

}
