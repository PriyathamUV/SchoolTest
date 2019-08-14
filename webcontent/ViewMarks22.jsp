<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@page import="com.*"%>
    <%@ page import="java.io.*,java.util.*,java.sql.*"%>
<%@ page import="javax.servlet.http.*,javax.servlet.*"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<% 
String s=(String)session.getAttribute("email");
Connection con=StudentDao.getConnection();
PreparedStatement st=con.prepareStatement("select * from dbname.MarksDemo1 where name=?;");
st.setString(1,s);
ResultSet rs=st.executeQuery();  
while(rs.next()){ 
 %>
  <table border="1" width="90%">  
<tr><th>Name</th><th>Hindi</th><th>English</th><th>Math</th><th>Science</th></tr>

<tr><td><%=rs.getString(1)%></td>  
<td><%=rs.getInt(2)%></td>
<td><%=rs.getInt(3)%></td>
<td><%=rs.getInt(4)%></td>
<td><%=rs.getInt(5)%></td>
</tr>
</table> 
<%} %>
 

</body>
</html>