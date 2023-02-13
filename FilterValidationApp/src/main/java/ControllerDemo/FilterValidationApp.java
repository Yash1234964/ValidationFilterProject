package ControllerDemo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FilterValidationApp
 */
@WebServlet("/reg")
public class FilterValidationApp extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String eid = request.getParameter("eid");
		String ename = request.getParameter("ename");
		String eage = request.getParameter("eage");
		String email = request.getParameter("email");
		String mobile = request.getParameter("mobile");
		
		
		PrintWriter out = response.getWriter();
		out.println("<html><head><title>Output</title></head>");
		out.println("<body>");
		out.println("<center>");
		out.println("<h1 style='color:red; text-align:center;'>Employee Registration Details</h1>");
		out.println("<table border='1'>");
		out.println("<tr><th>EID</th><td>" + eid + "</td></tr>");
		out.println("<tr><th>ENAME</th><td>" + ename + "</td></tr>");
		out.println("<tr><th>EAGE</th><td>" + eage + "</td></tr>");
		out.println("<tr><th>EMAIL</th><td>" + email + "</td></tr>");
		out.println("<tr><th>MOBILE</th><td>" + mobile + "</td></tr>");
//		out.println("<tr><th>STATUS</th><td>" + status + "</td></tr>");
		out.println("</table>");
		out.println("</center>");
		out.println("</body>");
		out.println("</html>");
		out.close();
	}

}
