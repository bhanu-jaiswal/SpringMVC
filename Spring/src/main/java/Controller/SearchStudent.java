package Controller;

import java.io.IOException;
import java.io.PrintWriter;

 import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.entities.Student;
import Service.StudentService;

/**
 * Servlet implementation class SearchStudent
 */
public class SearchStudent extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SearchStudent() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		
		PrintWriter p=response.getWriter();
		
		String t1=request.getParameter("a1");
		int id=Integer.parseInt(t1);
	
		StudentService service=new StudentService();
		Student student=service.findbyId(id);
		
		 
		request.setAttribute("student", student);
		RequestDispatcher rd=request.getRequestDispatcher("Details.jsp");
	  rd.forward(request,response);
	  
	  
	  
	
	}
}