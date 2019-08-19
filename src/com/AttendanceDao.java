package com;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class AttendanceDao
 */
@WebServlet("/AttendanceDao")
public class AttendanceDao extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public AttendanceDao() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		int month=Integer.parseInt(request.getParameter("Month"));
		int day=Integer.parseInt(request.getParameter("Day"));
		int std_id[]=Integer.parseInt(request.getParameterValues("std_id"));
		int att_type[10]=Integer.parseInt(request.getParameter("att_type"));
		Attendance m=new Attendance();
		m.setMonth(month);
		m.setDay(day);
		m.setStudent_id(std_id);
		m.setAtt_type(att_type);
		AttendanceDao1 m1=new AttendanceDao1();
	String status=m1.save(m);
	System.out.println(status);
	if(status.equals("success"))
	{
		HttpSession session = request.getSession();
	   session.setAttribute("status",status);
	   System.out.println("reached if");
		request.getRequestDispatcher("/Attendance.jsp").forward(request, response);
	}
	else if(status.equals("failed"))
	{
		HttpSession session = request.getSession();
		   session.setAttribute("status",status);
			request.getRequestDispatcher("/Attendance.jsp").forward(request, response);	
		
		
	}
	}

}
