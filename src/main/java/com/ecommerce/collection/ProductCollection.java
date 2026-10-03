package com.ecommerce.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.ecommerce.model.Product;


public class ProductCollection {
	
	// Search product by name
	public static Product searchByName(List<Product> products, String searchText){
		for(Product product : products) {
			if(product.getProductName()
					   .toLowerCase()
					   .contains(searchText.toLowerCase())
					) {
				 		return product;
					  }
		}
	 return null;
	}

		// Filter products by category
	public static List<Product> filterByCategory(
			List<Product> products,int categoryId
	){
		List<Product> result = new ArrayList<>();
		for(Product product : products) {
			if(product.getCategoryId() == categoryId) {
				result.add(product);
			}
		}
		return result;
	}
	


	public static void main(String[] args) {
		List<Product> products = new ArrayList<>();
		
		Product p1 = new Product();
		p1.setProductId(1);
		p1.setCategoryId(3);
		p1.setProductName("Dell Inspiron 15");
		p1.setDescription("15-inch laptop");
		p1.setPrice(55999.00);
		p1.setStockQuantity(20);
		p1.setStatus("Active");
		
		
		Product p2 = new Product();
		p2.setProductId(2);
		p2.setCategoryId(1);
		p2.setProductName("Dell Inspiron 15");
		p2.setDescription("15-inch laptop");
		p2.setPrice(55999.00);
		p2.setStockQuantity(100);
		p2.setStatus("Active");
		
		Product p3 = new Product();
		p3.setProductId(3);
		p3.setCategoryId(2);
		p3.setProductName("Samsung Gallaxy");
		p3.setDescription("15-inch laptop");
		p3.setPrice(85999.00);
		p3.setStockQuantity(35);
		p3.setStatus("Active");
	
		Product p4 = new Product();
		p4.setProductId(4);
		p4.setCategoryId(4);
		p4.setProductName("Dell Inspiron 15");
		p4.setDescription("15-inch laptop");
		p4.setPrice(55999.00);
		p4.setStockQuantity(20);
		p4.setStatus("Active");
		
		products.add(p1);
		products.add(p2);
		products.add(p3);
		products.add(p4);
		
		System.out.println("------------Product List-----------");
		for(Product product : products) {
			System.out.println(
					product.getProductId()
					+ " | "
					+product.getProductName()
					+" Rs."
					+product.getPrice()
			);
		}
		
		Product result = searchByName(products, "dell");
		
		if(result != null) {
			System.out.println("\n Product Found : " +result.getProductName());
	}
		else {
			System.out.println("\n Product Not Found");
		}
		
		// Filter by category call
		List<Product> laptopProducts = filterByCategory(products, 3);
		System.out.println("\n ------Laptops-----");
		for(Product product : laptopProducts) {
			System.out.println(product.getProductName() +" | Rs" + product.getPrice());
	}
		// Sort by Name
		Collections.sort(products);
		System.out.println("\n -----------Sorted By Name------------");
		for(Product product : products) {
			System.out.println(product.getProductName());
		}
		// Sort by Price
		products.sort(Comparator.comparingDouble(Product :: getPrice));
		
		// Sort by price low to high
		System.out.println("\n--------------Low to High-------------");
		for(Product product : products) {
			System.out.println(product.getProductName() +" | Rs. " + product.getPrice());
		}
		
		// Sort by price high to low
		products.sort(Comparator.comparingDouble(Product::getPrice).reversed());
		
		System.out.println("\n------------------High to Low-----------------");
		for(Product product : products) {
		  System.out.println(product.getProductName() +" | Rs. " +product.getPrice());	
		}
		
		// HashMap : Product Lookup
		Map<Integer, Product> productMap = new HashMap<>();
		
		// Add Product (To cart)
		for(Product product : products) {
			productMap.put(product.getProductId(), product);
		}
		Product product = productMap.get(3);
		System.out.println("\n Product ID : 3 " + product.getProductName());
		
		
		
		
		
		
	}
} 