<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Java To Go</title>
</head>
<body>
	<h1>Welcome to Java To Go</h1>
	<% for(int i=0;i<5;i++) {%>
		<p><%= i %></p>
	<% }%>
	<!-- c:out  this can store variables from controllers -->
	<c:out value="${ 2+2 }"/>
	<!-- see home controller for this variable for model added attribute -->
	<c:out value="${dictionaryName}"/>
	
	<!-- jstl enhanced for loop -->
	<!-- for each fruit in fruits or for each variable in items -->
	<c:forEach var="fruit" items="${fruits}">
		<!-- conditional if the fruit does not equal durian print fruits -->
		<c:if test="${fruit != 'Durian'} ">
			<p><c:out value="${fruit}"/></p>
		</c:if>
	</c:forEach>
	<c:out value="User id is: ${userId}"/>
	
	
	
	
	
	
</body>
</html>