package test_tomcat_git;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet_test")
public class servlet_test extends HttpServlet
{
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException
	{

		String json = null;
		//
		//json =

		PrintWriter out = response.getWriter();
		response.setContentType("application/json");
		response.setCharacterEncoding("UTF-8");


		out.print(json);
		out.flush();
	    out.close();

	}
}
