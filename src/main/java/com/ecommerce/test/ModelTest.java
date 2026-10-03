package com.ecommerce.test;
import com.ecommerce.model.Product;
import com.ecommerce.model.CartItem;
import com.ecommerce.collection.CartManager;

public class ModelTest {

	public static void main(String[] args) {
		Product product = new Product();
	
		product.setProductId(1);
		product.setCategoryId(3);
		product.setProductName("Dell Inspiron 15");
		product.setDescription("15-inch laptop");
		product.setPrice(55999.00);
		product.setStockQuantity(20);
		product.setStatus("Active");
		
		System.out.println("Product ID : " + product.getProductId());
		System.out.println("Product Name : " + product.getProductName());
		System.out.println("Product Price : " + product.getPrice());
		System.out.println("Product Stock : " + product.getStockQuantity());
		System.out.println("\n Complete Product : ");
		System.out.println(product);
		
		
		
		// Creating Product
		Product mouse = new Product();
		mouse.setProductId(2);
		mouse.setCategoryId(4);
		mouse.setProductName("Mouse");
		mouse.setDescription("Black Highlighted");
		mouse.setPrice(890.00);
		mouse.setStockQuantity(25);
		mouse.setStatus("Active");
		
		System.out.println("Product ID : " + mouse.getProductId());
		System.out.println("Product Name : " + mouse.getProductName());
		System.out.println("Product Price : " + mouse.getPrice());
		System.out.println("Product Stock : " + mouse.getStockQuantity());
		System.out.println("\n Complete Product : ");
		System.out.println(mouse);
		
		// Creating cart item
		CartItem item = new CartItem();
		item.setCartItemId(2);
		item.setCartId(102);
		item.setProduct(mouse);
		item.setQuantity(3);
		
		// Creating CartManager
		CartManager cart = new CartManager();
		
		// Add item to cart 
		cart.additem(item);
		
		// Display cart size
		System.out.println("Cart Size : " +cart.getCartSize());
		
		// Display total
		System.out.println("Cart total : " +cart.calculateTotal());
		
		// Update Quantity
		cart.updateQuantity(2, 4);
		
		System.out.println("\nAfter updating quantity:");
		System.out.println("Cart Size: " + cart.getCartSize());
        System.out.println("Cart Total: " + cart.calculateTotal());
	
//        // Remove item
//        cart.removeItem(2);
//		
//        System.out.println("\nAfter removing product:");
//        System.out.println("Cart Size: " + cart.getCartSize());
//        System.out.println("Cart Total: " + cart.calculateTotal());
	}

}
