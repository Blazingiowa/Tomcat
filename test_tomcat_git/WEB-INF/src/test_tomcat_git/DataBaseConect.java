package test_tomcat_git;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataBaseConect
{
	Connection conn = null;
	String url = "jdbc:mysql://localhost/u22?characterEncoding=UTF-8&serverTimezone=JST"; //データベースのURLまたはIPアドレスローカルの場合はパス
	String user = "root";//データベースへアクセスするID
	String password = "yasutaka13";//データベースのパスワード

	void databaseconect()
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
}
