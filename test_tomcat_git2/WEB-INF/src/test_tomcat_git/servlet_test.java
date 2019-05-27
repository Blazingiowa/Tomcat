package test_tomcat_git;

import java.io.IOException;
import java.util.Collections;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.google.gson.Gson;

@WebServlet("/servlet_test")
public class servlet_test extends HttpServlet
{


	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}//基本的に使わないけど保険で入れた
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException
	{
		request.setCharacterEncoding("UTF-8");

		UserBean ub = new UserBean();
		Gamestart game_start = new Gamestart();
		Gamemain game_main = new Gamemain();

		String name_val = request.getParameter("name"); //リクエスト内に[name]パラメーターで名前を入れてもらう

		HttpSession session = request.getSession();


		String[] userinfo = new String[3];//順番 0 ユーザーID 1 ルームID 2 攻守

		Gson gson = new Gson();
		if (session.getAttribute("user_name") == null){

			userinfo = game_start.createdirectry(name_val);

			session.setAttribute("user_name", name_val);
			session.setAttribute("user_id", userinfo[0]);

			ub.setuserID(userinfo[0]);
			ub.setRoomID(userinfo[1]);
			ub.setAt_Df(userinfo[2]);

			//JSONを生成
			response.setContentType("application/json");
			response.setCharacterEncoding("utf-8");
			response.getWriter().println(gson.toJson(
				      Collections.singletonMap("param", gson.toJson(ub))
				    ));

		}
		else{
		    	//game_main.
		}
	}
}
