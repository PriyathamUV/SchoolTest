package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class StudentDao 
{
	public static Connection getConnection(){  
    Connection con=null;  
    try{  
        Class.forName("com.mysql.jdbc.Driver");  
        con=DriverManager.getConnection("jdbc:mysql://localhost:3306/dbname","root","root");  
    }
    catch(Exception e){System.out.println(e);}  
    return con;  
}  

	
	
	public static int save(Student s){  
        int status=0;  
        try{  
            Connection con=StudentDao.getConnection(); 
            System.out.println(con);
            PreparedStatement ps=con.prepareStatement("insert into dbname.contact_detail values (?,?)");  
            ps.setString(1,s.getName());  
            ps.setInt(2,s.getNumber());
            
           
            status=ps.executeUpdate();  
              
            con.close();  
        }catch(Exception ex){ex.printStackTrace();}  
          
        return status;  
    }  }



