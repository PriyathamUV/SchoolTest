package com;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class ViewStudentDao
{
	public static ArrayList<Student> check1()
	{
	ArrayList<Student> list=null;
	
	Connection con=StudentDao.getConnection();
		try {
			Statement stmt=con.createStatement();
		  //  System.out.println(e.getEmail());
			ResultSet rs=stmt.executeQuery("select  * from dbname.contact_detail;");
			list=new ArrayList<Student>();
			while(rs.next())
			{Student e=new Student();
				e.setName(rs.getString(1));
				e.setNumber(rs.getInt(2));
				list.add(e);
			}
			
			
			} catch (SQLException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		return list;
		
		
	}

	

	

}
