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
	String session;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException
	{
<<<<<<< HEAD
		Text tx = new Text();

		//cast.decord(request);

=======
		request.setCharacterEncoding("UTF-8");
		
		
		
>>>>>>> branch 'tomcat' of https://github.com/Blazingiowa/Tomcat.git

		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		response.setCharacterEncoding("UTF-8");


		
		out.flush();
	    out.close();

	}
}
