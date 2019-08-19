<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
      <%@page import="com.*"%>
    
<%@ page import="java.io.*,java.util.*,java.sql.*"%>
<%@ page import="javax.servlet.http.*,javax.servlet.*"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 


    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%  
ArrayList<Student> list=ViewStudentDao.check1();  
request.setAttribute("list",list);  
%>  
  
<table border="1" width="90%">  
<tr><th>Name</th><th>Number</th>  
 <c:forEach items="${list}" var="u">  
<tr><td>${u.getName()}</td>  
<tr><td>${u.getNumber()}</td>

</c:forEach>  
</table>  
<br/><a href="adduserform.jsp">Add New User</a> 


</body>
</html>