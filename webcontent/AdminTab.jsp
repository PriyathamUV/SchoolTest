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
out.print(s);
%>
<form action="ViewStudent.jsp" method="post"><button>ViewStudent</button></form>
<form action="AddMarks.jsp" method="post"><button>AddMarks</button></form>
<form action="Attendance.jsp" method="post"><button>Attendance</button></form>
</body>
</html>