{# this can be run as a spring boot app @http://localhost:8080/demo.jsp #}
{# this line imports the date class #}
<%@ page language="java contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" import="java.util.Date"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>Demo JSP</title>
    </head>
<body>
    <% for(int i=0; i<5; i++) {%>
        <h1> <%= i %> </h1>
        <%}%>
    <p>The time is: <%= new Date() %></p>
    <h1>Hello World</h1>
</body>
</html>