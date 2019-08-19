package com;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AttendanceDao1 
{
	public static String save(Attendance d){
		String status="";
        int n=0;  
        try{  
            Connection con=StudentDao.getConnection(); 
            System.out.println(con);
            PreparedStatement ps=con.prepareStatement("insert into dbname.TestAttendance(Day,month,Student_id,Attendance_id) values (?,?,?,?)");  
            ps.setInt(1,d.getDay());  
            ps.setInt(2,d.getMonth());
            ps.setInt(3, d.getStudent_id());
            ps.setInt(4, d.getAtt_type());
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
