package p1;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/SessionServlet")
public class SessionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public SessionServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		out.print("<h1>" + "Welcome" + "</h1>");
		out.print("<hr>");

		// HOW TO CREATE SESSION
		Integer cnt = 0;
		HttpSession session = request.getSession(false);

		if (session != null) {
			cnt = (Integer) session.getAttribute("count") + 1;
			session.setAttribute("count", cnt + 1);
		} else {

			// session.isNew();
			session = request.getSession();

			session.setAttribute("count", cnt + 1);

		}
		out.print("<h1> Visit Count" + session.getAttribute("count") + "</h1> <hr>");
		out.print("<h1> Session Id" + session.getId() + "</> <>hr");
		out.print("<h1> Session Creation Time" + session.getCreationTime());

		out.print("<h1> Session Creation Time" + new Date(session.getCreationTime()) + "</h1> <hr>");

		out.print("<h1> Session LastAcces Time" + new Date(session.getLastAccessedTime()) + "</h1> <hr>");
		out.print("<h1> Session Get Max Time" + session.getMaxInactiveInterval() + "</h1> <hr>");

		session.setMaxInactiveInterval(60);

	}

}
