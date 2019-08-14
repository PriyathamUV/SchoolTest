

import java.io.IOException;
import java.io.PrintWriter;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Student;
import com.StudentDao;

/**
 * Servlet implementation class SaveStudent
 */
@WebServlet("/SaveStudent")
public class SaveStudent extends HttpServlet {
	

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{    
		response.setContentType("text/html");  
    PrintWriter out=response.getWriter();  
    
    String name=request.getParameter("name");  
    String sid=request.getParameter("number");  
    int Phone=Integer.parseInt(sid); 
    
    Student s=new Student();
    s.setName(name);
    s.setNumber(Phone);
   int status=StudentDao.save(s);
   if(status>0){  
       out.print("<p>Record saved successfully!</p>");  

   }else{  
       out.println("Sorry! unable to save record");  
   }  
     
   out.close();
		
	}

	

}
