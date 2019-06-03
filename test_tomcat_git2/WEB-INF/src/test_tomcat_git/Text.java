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

	int[] playerinfo = new int[10];//配列数は仮設定

	int roomid,playernumber;//ルーム番号をintにキャスト

	File file;

	int[] text(String room,String number,int line,int WriteorRead)//試験的に作るため呼び出し禁止
	{
		roomid = Integer.parseInt(room);//ルーム番号をintにキャスト
		playernumber = Integer.parseInt(number);//プレイヤー番号をintにキャスト
		String[] linenumber = new String[10];//配列数は仮設定、各行の情報が入力
		file = new File("");//roomidとplayernumberを使用してファイルを特定

		//以下テキストファイル読み込み
		try
		{
			br = new BufferedReader(new FileReader(file));
			String str = br.readLine();

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

		if(WriteorRead == 0)
		{
			//filewrite();
			return null;
		}
		else
		{
			filereader(linenumber,line);
			return playerinfo;
		}
	}

	void filewriter(String[] lineinfo,int line)
	{
		try
		{

		}

		catch(Exception e)
		{

		}
	}

	void filereader(String[] lineinfo,int line)
	{
		//以下int配列へキャスト
		String[] temporary = lineinfo[line].split(",");

		for(int i = 0;i<temporary.length;i++)
		{
			playerinfo[i] = Integer.parseInt(temporary[i]);
		}
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
