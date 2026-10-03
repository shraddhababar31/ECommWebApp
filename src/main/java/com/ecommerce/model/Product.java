package com.ecommerce.model;

public class Product implements Comparable<Product>{

	private int productId;
	private int categoryId;
	private String productName;
	private String description;
	private double price;
	private int stockQuantity;
	private String imageUrl;
	private String status;
	
	public Product() {
		super();
	}

	public Product(int productId, int categoryId, String productName, String description, double price,
			int stockQuantity, String imageUrl, String status) {
		super();
		this.productId = productId;
		this.categoryId = categoryId;
		this.productName = productName;
		this.description = description;
		this.price = price;
		this.stockQuantity = stockQuantity;
		this.imageUrl = imageUrl;
		this.status = status;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public int getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getStockQuantity() {
		return stockQuantity;
	}

	public void setStockQuantity(int stockQuantity) {
		this.stockQuantity = stockQuantity;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", categoryId=" + categoryId + ", productName=" + productName
				+ ", description=" + description + ", price=" + price + ", stockQuantity=" + stockQuantity
				+ ", imageUrl=" + imageUrl + ", status=" + status + "]";
	}
		public int compareTo(Product other) {
			return this.productName.compareToIgnoreCase(other.productName);
		}
}
