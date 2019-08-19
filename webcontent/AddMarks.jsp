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
String s=(String)session.getAttribute("status");
out.print(s);
%>
<form action="MarksDemo" method="get">
Student_name<input type="text" name="name"><br>
Hindi<input type="text" name="Hindi"><br>
English<input type="text" name="English"><br>
Math<input type="text" name="Math"><br>
Science<input type="text" name="Science"><br>
<input type="submit" name="Submit"><br>
</form>



</body>
</html>