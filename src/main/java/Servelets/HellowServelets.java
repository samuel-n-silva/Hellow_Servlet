package Servelets;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class HellowServelets extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = -735694372576743613L;

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("<title>Servlets</title>");
		out.println("<body>");
		out.println("<p>Olá Mundo</p>");
		out.println("</body>");
		out.println("</head>");
		out.println("</html>");
	}
	
	

}
