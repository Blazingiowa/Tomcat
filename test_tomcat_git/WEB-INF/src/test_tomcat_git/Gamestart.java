package test_tomcat_git;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Gamestart
{
	Gamemain Gm = new Gamemain();
	Text tx = new Text();
<<<<<<< HEAD
	
=======

	void createdirectry()
	{
		 try{
		    	Path path1 = Paths.get("");//相対指定でルームidフォルダ作成
		    	System.out.println(path1);
				Files.createDirectory(path1);
			}
		    catch (IOException e)
		    {
				e.printStackTrace();
			}


	}
>>>>>>> branch 'neo_yt' of https://github.com/Blazingiowa/Tomcat.git
}
