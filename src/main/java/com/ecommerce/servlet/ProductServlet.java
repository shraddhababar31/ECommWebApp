package com.ecommerce.servlet;

import java.io.*;
import java.util.*;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.*;
import jakarta.servlet.http.*;

import com.ecommerce.model.*;
import com.ecommerce.exception.*;
import com.ecommerce.service.*;

@WebServlet("/products")
public class ProductServlet extends HttpServlet{

	private static final long serialVersionUID = 1L;
	
	private ProductService productService;
	
	@Override
	public void init() throws ServletException{
		productService = new ProductService();
	}
	
//	@Override
//	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		try {
//			List<Product> products = productService.getAllProducts();
//			
//			request.setAttribute("products", products);
//					// ready for sending(pack karke rakhna)
//			request.getRequestDispatcher("/product-list.jsp").forward(request, response);
//			
//		} catch (Exception e) {
//			throw new ServletException(e);
//		}
//	}
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			List<Product> products = productService.getAllProducts();
			
			System.out.println("========================================");
			System.out.println("PRODUCT LIST = " +products);
			System.out.println("PRODUCT COUNT = " +products.size());
			System.out.println("========================================");
			
			request.setAttribute("products", products);
			
	        request.getRequestDispatcher("/product-list.jsp")
	        						.forward(request, response);
			
		} catch (Exception e) {
			e.printStackTrace();
			throw new ServletException(e);
		}
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action = request.getParameter("action");
		
		if("add".equals(action)) {
			addProduct(request,response);
		}
	}
	private void addProduct(HttpServletRequest request, HttpServletResponse response) throws IOException{
		try {
			int categoryId = Integer.parseInt(request.getParameter("categoryId"));
			String productName = request.getParameter("productName");
			String description = request.getParameter("description");
			double price = Double.parseDouble(request.getParameter("price"));
			int stckQuantity = Integer.parseInt(request.getParameter("stockQuantity"));
			String imageUrl = request.getParameter("imageUrl");
			String status = request.getParameter("status");
			
			Product product = new Product();
			product.setCategoryId(categoryId);
			product.setProductName(productName);
			product.setDescription(description);
			product.setPrice(price);
			product.setStockQuantity(stckQuantity);
			product.setStatus(status);
			
			productService.addProduct(product);
			
			response.sendRedirect(request.getContextPath() + "/products");
			
		} catch (ProductException e) {
			response.sendError(HttpServletResponse.SC_BAD_REQUEST, e.getMessage());
		}
		catch (NumberFormatException e) {
			response.sendError(HttpServletResponse.SC_BAD_REQUEST, "Invalid numeric exception");
		}
	}
}
