<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


<%
    if(session.getAttribute("username")== null)
    {
    	response.sendRedirect("login.jsp");
    }


    
%>
  welcome to welcome page
<a href = "videos.jsp"> click for videos </a>

</body>
</html>