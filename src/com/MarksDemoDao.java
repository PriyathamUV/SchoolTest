package com;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class MarksDemoDao 
{
	public static String save(MarksDemo d){
		String status="";
        int n=0;  
        try{  
            Connection con=StudentDao.getConnection(); 
            System.out.println(con);
            PreparedStatement ps=con.prepareStatement("insert into dbname.MarksDemo1 values (?,?,?,?,?)");  
            ps.setString(1,d.getName());  
            ps.setInt(2,d.getHindi());
            ps.setInt(3, d.getEnglish());
            ps.setInt(4, d.getMath());
            ps.setInt(5, d.getScience());
            ps.setInt(5, d.getSocial());
            
           
			n=ps.executeUpdate();
			if(n!=0)
			{
				status="success";
			}
			else
			{
				status="failed";
			}
			
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}


return status;
           
            
}
	
}

