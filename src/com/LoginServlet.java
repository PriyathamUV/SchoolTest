package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{

		PrintWriter out=response.getWriter();
		String email=request.getParameter("email");
		String password=request.getParameter("password");
		Login l=new Login();
		l.setPassword(password);
		l.setEmail(email);
		int status=LoginDao.check(l);
		if(status==1)
		{HttpSession session = request.getSession();
		   session.setAttribute("email",email);
			request.getRequestDispatcher("/AdminTab.jsp").forward(request, response);
		}
		
		else if(status==2)
		{System.out.println("entered if else");
			HttpSession session = request.getSession();
		   session.setAttribute("email",email);
			request.getRequestDispatcher("/AdminTab1.jsp").forward(request, response);

		}
		else
		{System.out.println("entered else");
			request.getRequestDispatcher("/Index1.html");
		}
}
		
	}

	
	

