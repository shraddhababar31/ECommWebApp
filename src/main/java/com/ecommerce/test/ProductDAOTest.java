package com.ecommerce.test;

import com.ecommerce.model.*;

import java.util.List;
import java.util.Scanner;

import com.ecommerce.dao.*;

public class ProductDAOTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Product product = new Product();
		
		
		
		// Insertion
		ProductDAO productDAO = new ProductDAO();
		
		System.out.println("Please select the option 1. Create Product\n2. Fetch Product by ID\n3. Get All Products\n4. Update Existing Product\n5. Delete Product");
		int choice = sc.nextInt();
		
		switch (choice) {
		case 1: 
			product.setCategoryId(4);
			product.setProductName("Lenovo Idea");
			product.setDescription("12 inch business laptop");
			product.setPrice(58899);
			product.setStockQuantity(20);
			product.setImageUrl("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcS8NtjmB30w01Ee0RsDSb4zq2Mlc8_W-cAPnpuHWlhTbw&s=10");
			product.setStatus("ACTIVE");
			
			boolean result = productDAO .addProduct(product);
			
			if(result) {
				System.out.println("Product Inserted Successfully!");
			} else {
				System.out.println("Product Insertion Failed!");
			}
			break;
			
		case 2 :
			Product product2 = productDAO.getProductById(5);
			if(product2 != null) {
				System.out.println("Product Found");
				
				System.out.println("ID: " +product2.getProductId());
				System.out.println("Category ID: " +product2.getCategoryId());
				System.out.println("Product Name: " +product2.getProductName());
				System.out.println("Description: " +product2.getDescription());
				System.out.println("Product Price Rs: " +product2.getPrice());
				System.out.println("Product Stock Quantity: " +product2.getStockQuantity());
				System.out.println("Product Status: " +product2.getStatus());
				
			} else {
				System.out.println("Product Not Found!");
			}
			break;
			
		case 3 :
			System.out.println("\n--------------All Products-------------");
			List<Product> products = productDAO.getAllProducts();
			for(Product product3 : products) {
				System.out.println(product3.getCategoryId()
						+ " | "
						+ product3.getProductName()
						+ " | Rs."
						+ product3.getPrice()
						+ " | Stock: "
						+ product3.getStockQuantity());
			}
			
			break;
			
		case 4: 
			System.out.println("Updated Product");
			Product product4 = productDAO.getProductById(4);
			if(product4 != null) {
				System.out.println("Product Found");
				
				product4.setCategoryId(3);
				product4.setProductName("Ipad smart learning");
				product4.setDescription("15 inch business laptop for lowest price");
				product4.setPrice(78899);
				product4.setStockQuantity(35);
				product4.setImageUrl("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcS8NtjmB30w01Ee0RsDSb4zq2Mlc8_W-cAPnpuHWlhTbw&s=10");
				product4.setStatus("ACTIVE");
				
				boolean updated = productDAO.updateProduct(product4);
				if(updated) {
					System.out.println("Product updated successfully!");
				}
				
			} else {
				System.out.println("Product Not Found!");
			}
			break;
			
		case 5 : 
			System.out.println("Delete Product");
			boolean  deleted = productDAO.deleteProduct(4);
			
			if(deleted) {
				System.out.println("Product deleted successfully!");
			} else {
				System.out.println("Product Not  Found!");
			}
			break;
			
			
		default:
			System.out.println("Invalid Choice!");
		}
		
		
	}
}
