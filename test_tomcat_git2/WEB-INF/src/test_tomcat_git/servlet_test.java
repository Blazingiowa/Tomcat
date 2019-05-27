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

		int[] use_hand = conversion((String[])request.getParameterValues("Use_hand"));

		HttpSession session = request.getSession(false);


		String[] user_info = new String[3];//順番 0 ユーザーID 1 ルームID 2 攻守
		int[] user_session = new int[3];

		Gson gson = new Gson();


		if (session.getAttribute("user_name") == null)
		{	session = request.getSession(true);

			user_info = game_start.createdirectry(name_val);

			session.setAttribute("user_name", name_val);
			session.setAttribute("userID", user_info[0]);
			session.setAttribute("roomID", user_info[1]);
			session.setAttribute("at_df", user_info[2]);

			ub.setsession(session);
			ub.setuserID(user_info[0]);
			ub.setRoomID(user_info[1]);
			ub.setAt_Df(user_info[2]);

			//JSONを生成
			response.setContentType("application/json");
			response.setCharacterEncoding("utf-8");
			response.getWriter().println(gson.toJson(
				      Collections.singletonMap("param", gson.toJson(ub))
				    ));
		}
		else
		{
			user_session[0] =(int) session.getAttribute("userID");
			user_session[1] =(int) session.getAttribute("roomID");
			user_session[2] =(int) session.getAttribute("at_df");
		    //game_main.きっと何かメソッド作ってくれる(user_session);
			//
		}
	}
	int[] conversion(String[] str)
	{
		int[] h_int = new int[str.length];
		for (int i = 0; i < h_int.length; i++)
		{
			h_int[i] = Integer.parseInt(str[i]);
		}

		return h_int;

	}


}