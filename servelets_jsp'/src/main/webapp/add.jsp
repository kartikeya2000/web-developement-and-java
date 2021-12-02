<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Working with Servlets</title>
</head>

<%-- declaration ( <%! %> )
directive (<%@ %>)
scriptlet( <% %>)
expression(   )

--%>

<body bgcolor = "cyan">
<% 
       int i  = Integer.parseInt(request.getParameter("onenum"));
       int j = Integer.parseInt(request.getParameter("secondnum")); 
	   int k = i+j;
	   
	   out.println("output: "+k);
	   
%>
	   
</body>
</html>