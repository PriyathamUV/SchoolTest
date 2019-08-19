package com;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.StudentDao;

public class LoginDao
{

	public static int check(Login l){
		int status=0;
		String email1=l.getEmail();
		String password=l.getPassword();
		try{
			Connection con=StudentDao.getConnection();
			PreparedStatement ps=con.prepareStatement("select * from dbname.Role");
			ResultSet rs = ps.executeQuery();
			while(rs.next()) 
			{
				String user=rs.getString("email");
				String paswd=rs.getString("password");
				String des=rs.getString("ROLE");
				if(user.equals(email1) && paswd.equals(password))
				{	
					if(des.equals("Student"))
					{
						status=2;
					}
					else if(des.equals("Admin"))
					{
						status=1;
					}
					
				}
			}
		}catch(Exception ex){
					ex.printStackTrace();}
				
		
		return status;
	}
	

}
