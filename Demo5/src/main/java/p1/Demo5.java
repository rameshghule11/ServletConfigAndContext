package p1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


//@WebServlet("/Demo5")
public class Demo5 extends HttpServlet {
	
    public Demo5() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		int id=Integer.parseInt(request.getParameter("id"));
		String name=request.getParameter("uname");
		double marks=Double.parseDouble(request.getParameter("marks"));
		
		out.print("<html>");
		out.print("<head>");
		out.print("</head>");
		out.print("<body>");
		out.print("<h1>");
		out.print(id +"<br>");
		out.print(name +"<br>");
		out.print(marks +"<br>");
		out.print("</h1>");
		out.print("</body>");
		out.print("</html>");
	}

}
