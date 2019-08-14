package com;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class MarksDemoServlet
 */
@WebServlet(name = "MarksDemo", urlPatterns = { "/MarksDemo" })
public class MarksDemoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public MarksDemoServlet() {
        super();
        
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		
		String name=request.getParameter("name");
		int hindi=Integer.parseInt(request.getParameter("Hindi"));
		int English=Integer.parseInt(request.getParameter("English"));
		int Math=Integer.parseInt(request.getParameter("Math"));
		int Science=Integer.parseInt(request.getParameter("Science"));
		MarksDemo m=new MarksDemo();
		m.setName(name);
		m.setHindi(hindi);
		m.setEnglish(English);
		m.setMath(Math);
		m.setScience(Science);
		MarksDemoDao m1=new MarksDemoDao();
	String status=m1.save(m);
	System.out.println(status);
	if(status.equals("success"))
	{
		HttpSession session = request.getSession();
	   session.setAttribute("status",status);
	   System.out.println("reached if");
		request.getRequestDispatcher("/AddMarks.jsp").forward(request, response);
	}
	else if(status.equals("failed"))
	{
		HttpSession session = request.getSession();
		   session.setAttribute("status",status);
			request.getRequestDispatcher("/AddMarks.jsp").forward(request, response);	
		
		
	}
		
	}

}
