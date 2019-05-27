package test_tomcat_git;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataBaseConect
{
	Connection conn = null;
	String url = ""; //データベースのURLまたはIPアドレスローカルの場合はパス
	String user = "";//データベースへアクセスするID
	String password = "testpass";//データベースのパスワード

	int[] reference = new int[5];//受け渡す情報が入る
	int[] room = new int[2];//ルームIDとユーザIDが入る

	int[] reference(int id,int type)//idはカードidなど、typeは攻防か、ルーム検索か
	{
		for(int i = 0;i < reference.length;i++)
		{
			reference[i] = 0;
		}

		if(type == -1)//ルームの空き情報を検索
		{

		}

		else//カード情報を検索
		{
			try
			{
				conn = DriverManager.getConnection(url,user,password);

				//SQL
			}
			catch(SQLException e)
			{
				System.out.println(e);
			}
			finally
			{
				try
				{
					if (conn != null)
					{
						conn.close();
					}
				}
				catch(SQLException e)
				{
					System.out.println(e);
					//例外処理

				}
			}


		}
		return reference;
	}

	String[] update(String username)//受け渡されたusernameをデータベースへインサートする
	{
		reference(0,-1);//空いているルームと攻守を検索

		String[] userinfo = new String[3];
		try
		{
			conn = DriverManager.getConnection(url,user,password);

			//SQL
		}
		catch(SQLException e)
		{
			System.out.println(e);
		}
		finally
		{
			try
			{
				if (conn != null)
				{
					conn.close();
				}
			}
			catch(SQLException e)
			{
				System.out.println(e);
				//例外処理

			}
		}
		//データベースからのintデータをString配列にキャスト
		return userinfo;


	}
}
