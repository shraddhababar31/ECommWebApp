<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ page import="java.util.List" %>
<%@ page import="com.ecommerce.model.Product" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Product Management</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/css/bootstrap.min.css" rel="stylesheet">

</head>
<body class="bg-light">

		<div class="container mt-5">
			<div class="d-flex justify-content-between align-items mb-4">
				<h1>Product Management</h1>
				
				<a href="product-add.jsp" class="btn btn-primary">
				Add Product
				</a>
			</div>
			
			<%
			List<Product> products = (List<Product>)request.getAttribute("products");
			System.out.println("JSP PRODUCT COUNT = " + products.size());
			%>
			
			<div class="card shadow">
				<div class="card-body">
				 <table class="table table-striped table-hower">
				 <thead class="table-dark">
							<tr>
		  						<th>Sr.No</th>
		  						<th>Name</th>
		  						<th>Price</th>
		  						<th>Description</th>
		  						<th>Stock</th>
		  						<th>Status</th>
						   </tr>
				</thead>
				<tbody>
		<%
			for(Product product : products){
		%>
		
		<tr>
			<td>
				<%= product.getProductId() %>
			</td>
			<td>
				<%= product.getProductName() %>
			</td>
			<td>
				<%= product.getPrice() %>
			</td>
			<td>
				<%= product.getDescription() %>
			</td>
			<td>
				<%= product.getStockQuantity() %>
			</td>
			<td>
				<%= product.getStatus() %>
			</td>
		</tr>
		<%
		}
		%>
				 </tbody>
				 </table>
				
				</div>
			</div>
		</div>

		
		
	
</body>
</html>