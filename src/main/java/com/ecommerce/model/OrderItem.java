package com.ecommerce.model;

public class OrderItem {
	
	private int order_item_id;
	private int order_id;
	private Product product;
	private int quantity;
	private double price;
	public Object add;
	
	public OrderItem() {
		super();
		
	}

	public OrderItem(int order_item_id, int order_id, Product product, int quantity, double price) {
		super();
		this.order_item_id = order_item_id;
		this.order_id = order_id;
		this.product = product;
		this.quantity = quantity;
		this.price = price;
	}

	public int getOrder_item_id() {
		return order_item_id;
	}

	public void setOrder_item_id(int order_item_id) {
		this.order_item_id = order_item_id;
	}

	public int getOrder_id() {
		return order_id;
	}

	public void setOrder_id(int order_id) {
		this.order_id = order_id;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	public double getSubTotal() {
		return quantity * price;
	}

	@Override
	public String toString() {
		return "OrderItem [order_item_id=" + order_item_id + ", order_id=" + order_id + ", product=" + product
				+ ", quantity=" + quantity + ", price=" + price + "]";
	}
	
}
