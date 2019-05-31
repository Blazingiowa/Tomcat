package test_tomcat_git;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class Text
{
	DataBaseConnect DBC = new DataBaseConnect();

	BufferedReader br;
	FileWriter filewriter;


	File file;

	void filewrite()
	{
		try
		{

		}

		catch(Exception e)
		{

		}
	}

	int[] filereader(String room,String number,int line)
	{
		String[] linenumber = new String[10];//配列数は仮設定、各行の情報が入力
		int[] playerinfo = new int[10];//配列数は仮設定

		int roomid = Integer.parseInt(room);//ルーム番号をintにキャスト
		int playernumber = Integer.parseInt(number);//プレイヤー番号をintにキャスト

		file = new File("");//roomidとplayernumberを使用してファイルを特定

		//以下テキストファイル読み込み
		try
		{
			br = new BufferedReader(new FileReader(file));
			String str = br.readLine();

			//while(str != null)
			for(int i = 0;str != null;i++)
			{
				linenumber[i] = str;
			}
		}

		catch(Exception e)
		{
			//何かしらレスポンスを記述
		}

		finally
		{
			brclose();
		}

		//以下int配列へキャスト
		String[] temporary = linenumber[line].split(",");

		for(int i = 0;i<temporary.length;i++)
		{
			playerinfo[i] = Integer.parseInt(temporary[i]);
		}

		return playerinfo;
	}

	void brclose()
	{
		if(br!=null)
		{
			try
			{
				br.close();
			}

			catch (IOException e)
			{
				// TODO 自動生成された catch ブロック
				e.printStackTrace();
			}
		}
	}
}
