package com.amazon.test;

import com.amazon.controller.ShoppingCartController;
import com.amazon.model.Address;
import com.amazon.model.Billing;
import com.amazon.model.Customer;
import com.amazon.model.Order;
import com.amazon.model.Product;

public class Tester {

	public static void main(String[] args) {

		Customer customer1 = new Customer();

		customer1.setCustId(101);
		customer1.setCustName("John");

		Address custAddress = new Address();
		custAddress.setStreet("NewMoon");
		custAddress.setCity("LA");
		custAddress.setState("USA");

		customer1.setCustAddress(custAddress);

		ShoppingCartController scc = new ShoppingCartController();

		Product product1 = new Product();
		product1.setProdId(200);
		product1.setProdName("ABC");
		product1.setProdQuantity(12);
		product1.setProdUnitPrice((float) 122.9);

		Product product2 = new Product();
		product2.setProdId(300);
		product2.setProdName("XYZ");
		product2.setProdQuantity(2);
		product2.setProdUnitPrice((float) 302);

		scc.addtoCart(product1);
		scc.addtoCart(product2);

		customer1.setCart(scc.getcart());

		// System.out.println(customer1.showCustomer());
		Billing billing = new Billing();
		billing.setModeOfPayment("COD");

		Order order1 = scc.buy(customer1.getCart(), billing);
		order1.setShippingAddress(custAddress);

		System.out.println(order1.showOrder());

		scc.getcart();
	}

}
