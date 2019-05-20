package test_tomcat_git;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/servlet_test")
public class servlet_test extends HttpServlet
{
	String Session;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException
	{
		Gamestart game_start = new Gamestart();
		Gamemain game_main = new Gamemain();
		
		PrintWriter out = response.getWriter();
		
		HttpSession session = request.getSession(false);
		
		if (session == null){
				//game_start.();
				session = request.getSession(true);
		    }else{
		    	//game_main.
		    }
		
		response.setContentType("text/html");
		response.setCharacterEncoding("UTF-8");


		//out.print();
		out.flush();
	    out.close();

	}
}
