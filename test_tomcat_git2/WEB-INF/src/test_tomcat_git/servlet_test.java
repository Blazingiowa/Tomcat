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
	HttpServletRequest req;
	HttpServletResponse res;

	Gson gson = new Gson();

	UserBean ub = new UserBean();
	Gamestart game_start = new Gamestart();
	Gamemain game_main = new Gamemain();
	GameProject game_project = new GameProject();

	HttpSession session;

	String[] user_info;
	int[] user_session;
	String name_val;
	int[] use_hand;

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException
	{
		doPost(request, response);
	}//基本的に使わないけど保険で入れた

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException
	{
		request.setCharacterEncoding("UTF-8");


		session = request.getSession(false);


		user_info = new String[3];//順番 0 ユーザーID, 1 ルームID, 2 プレイヤー番号
		user_session = new int[3];


		//ゲーム途中で落とさなければ基本この中
		if(request.getParameter("end_flag") == null)
		{
			if (session.getAttribute("user_name") == null)
			{
				session = request.getSession(true);

				new_connect(request);
				//JSONを生成
				response.setContentType("application/json");
				response.setCharacterEncoding("utf-8");
				response.getWriter().println(gson.toJson(
					      Collections.singletonMap("param", gson.toJson(ub))
					    ));
			}
			else
			{
				connect(request);
			    //game_main.きっと何かメソッド作ってくれる(user_session, use_hand);
				//
			}

		}
		else//Clientが落としたい時用
		{

		}


	}
	void new_connect(HttpServletRequest request)
	{
		name_val = request.getParameter("name"); //リクエスト内に[name]パラメーターで名前を入れてもらう

		user_info = game_start.createdirectry(name_val);

		session.setAttribute("user_name", name_val);
		session.setAttribute("userID", user_info[0]);
		session.setAttribute("roomID", user_info[1]);
		session.setAttribute("user_number", user_info[2]);


		ub.setSession(session);
		ub.setUserID(user_info[0]);
		ub.setRoomID(user_info[1]);
		ub.setUserNumber(user_info[2]);

	}

	void connect(HttpServletRequest request)
	{
		user_session[0] =(int) session.getAttribute("userID");
		user_session[1] =(int) session.getAttribute("roomID");
		user_session[2] =(int) session.getAttribute("user_number");


		use_hand = conversion((String[])request.getParameterValues("Use_hand"));


		game_project.main(user_session, use_hand);
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
