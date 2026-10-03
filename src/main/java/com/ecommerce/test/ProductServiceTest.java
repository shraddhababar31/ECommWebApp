package com.ecommerce.test;

import com.ecommerce.exception.*;

import java.util.List;

import com.ecommerce.dao.*;
import com.ecommerce.service.*;
import com.ecommerce.model.*;

public class ProductServiceTest {
	public static void main(String[] args) {
	
		// testing for addProduct
		ProductService productService = new ProductService();
		
		Product product = new Product();
		
		product.setCategoryId(3);
		product.setProductName("Acer Aspire 5");
		product.setDescription("Powerful laptop");
		product.setPrice(56000);
		product.setStockQuantity(14);
		product.setImageUrl("https://image/natureurl");
		product.setStatus("ACTIVE");
		
		try {
			boolean result = productService.addProduct(product);
			
			if(result) {
				System.out.println("Product Added Successfully!");
			}
			
		} catch(Exception e) {
			System.out.println("Error : " +e.getMessage());
		}
		
		//Similarly do for update and delete and get all
		Product product2 = new Product();
		
		product2.setProductId(1);
		product2.setCategoryId(2);
		product2.setProductName("Acer Aspire pro 5");
		product2.setDescription("Powerful laptop");
		product2.setPrice(56000);
		product2.setStockQuantity(65);
		product2.setImageUrl("https://image/natureurl");
		product2.setStatus("ACTIVE");
		
		try {
			boolean result = productService.updateProduct(product2);
			
			if(result) {
				System.out.println("Product Updated Successfully!");
			}
			
		} catch(Exception e) {
			System.out.println("Error : " +e.getMessage());
		}
		
		// testing for get product by Id
		
		    ProductDAO productDAO = new ProductDAO();

		    Product product3 = productDAO.getProductById(1);

		    if (product3 != null) {
		        System.out.println(product3);
		    } else {
		        System.out.println("Product not found");
		    }
		
		  // testing for get product by Id
		
		    try {

		        List<Product> products = productService.getAllProducts();

		        if (products.isEmpty()) {
		            System.out.println("No Products Found!");
		        } else {

		            System.out.println("All Products:");
		            System.out.println("----------------------------");

		            for (Product product4 : products) {

		                System.out.println("Product ID: " + product4.getProductId());
		                System.out.println("Category ID: " + product4.getCategoryId());
		                System.out.println("Product Name: " + product4.getProductName());
		                System.out.println("Description: " + product4.getDescription());
		                System.out.println("Price: " + product4.getPrice());
		                System.out.println("Stock Quantity: " + product4.getStockQuantity());
		                System.out.println("Image URL: " + product4.getImageUrl());
		                System.out.println("Status: " + product4.getStatus());

		                System.out.println("----------------------------");
		            }
		        }

		    } catch (Exception e) {

		        System.out.println("Error: " + e.getMessage());

		    }
		    
		
	}	
}
