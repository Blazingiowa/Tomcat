package test_tomcat_git;

public class Gamestart
{
	Gamemain Gm = new Gamemain();
	Text tx = new Text();
	DataBaseConect DBC = new DataBaseConect();
	String[] userinfo = new String[3];//ユーザID,ルームID,攻守の順番で格納

	String[] createdirectry(String user_name) //
	{
		userinfo = DBC.update(user_name);


		//ローカル上のフォルダを検索

		/*------------------------以下再考中-----------------------------------*/
		/*
		 try{
		    	Path path1 = Paths.get("");//相対指定でルームidフォルダ作成
		    	System.out.println(path1);
				Files.createDirectory(path1);
			}
		    catch (IOException e)
		    {
				e.printStackTrace();
			}
		*/
		return userinfo;


	}
}
