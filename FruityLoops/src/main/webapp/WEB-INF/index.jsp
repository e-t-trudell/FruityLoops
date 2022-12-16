<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.Date"%>
 
<!-- c:out ; c:forEach etc. --> 
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isErrorPage="true" %> 
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Brownies</title>
    <link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
    
    <link rel="stylesheet" href="/css/style.css"> <!-- change to match your file/naming structure -->
    <script src="/webjars/jquery/jquery.min.js"></script>
    <script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
</head>
<body>
	<div class="container">
		<h1>Fruits page</h1>
   		<table class="table table-bordered table-hover border-4 border-success">
   			<tbody>
   				<tr class="table-danger">
   					<th scope="col">Name</th>
   					<th scope="col">Price</th>
   				</tr>
   				<c:forEach var="singleFruit"  items="${fruitList}">
   					<tr class="text-warning">
   						<td><c:out value="${singleFruit.name}"></c:out></td>
   						<td><c:out value="${singleFruit.price}"></c:out></td>
   					</tr>
   				</c:forEach>
   			</tbody>
   		</table>
   	</div>
</body>
</html>
