<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% 
String s=(String)session.getAttribute("email");
session.setAttribute("name",s);
request.getRequestDispatcher("/ViewMarks.jsp").forward(request, response);
%>
<form action="ViewMarks.jsp" method="get"><button>ViewMarks</button></form>
<form action="intro.html" method="get"><button>ViewMarks</button></form>
<h1>HI</h1>
</body>
</html>