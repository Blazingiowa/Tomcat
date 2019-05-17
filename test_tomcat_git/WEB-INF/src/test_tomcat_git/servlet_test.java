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

		response.setContentType("text/html; charset=UTF-8");
	    PrintWriter out = response.getWriter();
	    StringBuffer sb = new StringBuffer();
	    //飛び先クラスのインスタンス化

	    //sb.append = クラス移動(request);
	    //out.println(new String(sb);
	    out.close();

	}
}
