<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="com.*"%>
    <%@ page import="java.io.*,java.util.*,java.sql.*"%>
<%@ page import="javax.servlet.http.*,javax.servlet.*"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css" href="Style.css">

<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<body>
   <div class="header" style="width:100%">
  <button style="width:25%">Home</button>
  <button style="width:25%">Add</button>
  <button style="width:25%">Delete</button>
  <button style="width:25%">Atteendance</button><br><br>
</div><br><br>
<form action="Test" method="get">
  <div> 
<select>
    <option value="1">January</option>
    <option value="2">February</option>
    <option value="3">March</option>
    <option value="4">April</option>
    <option value="5">June</option>
    </select><br><br><br>
	</div>
	
	 <div class="Test"> 
<select>
    <option value="1">1</option>
    <option value="2">2</option>
    <option value="3">3</option>
    <option value="4">4</option>
    <option value="5">5</option>
	<option value="5">5</option>
	<option value="6">6</option>
	<option value="7">7</option>
	<option value="8">8</option>
	<option value="9">9</option>
	<option value="10">10</option>
    </select><br><br>
	</div>
	<div class="Test1">
	<table border="1">
	<tr>
	<td>student id</td>
	<td>
	Attendance
	</td>
	</tr>
<% 
Connection con=StudentDao.getConnection();
Statement st=con.createStatement();
ResultSet rs=st.executeQuery("select * from dbname.Student;");
while(rs.next()){
 %>
<tr><td><input type="text" value="<%=rs.getInt(1)%>"/></td>  
<td><select><option value="1">Present</option><option value="2">Absent</option></select></td>
</tr>
 <%}%>
 </table>
 </div>
 <div class="test2">
	<input type="submit" value="Submit"/>
	</div>
	</form>
</body>
</html>