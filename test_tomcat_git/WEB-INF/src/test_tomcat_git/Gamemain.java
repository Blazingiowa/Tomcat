package test_tomcat_git;

public class Gamemain
{
	Text tx = new Text();

	int kouyama[]=new int[12];//攻撃側山札
	int move_pt=0;	//防御側行動ポイント
	int trust_pt=100;//防御側の信頼度
	int continu_def=0;//連続して攻撃が防がれた回数
	void ymsyokisyori()//攻撃側山札の中身を全部0に..初期処理を兼ねる
	{
		for(int j=0;j<12;j++)
		{
			kouyama[j]=0;
		}
	}

	void yamasyori()//攻撃側山札シャッフル
	{
		for(int j=1;j<13;j++)
		{
			int ran=new java.util.Random().nextInt(12);
			while(kouyama[ran]!=0)
			{
				ran=new java.util.Random().nextInt(12);
			}
			kouyama[ran]=j;
		}
		for(int j=0;j<12;j++)
		{
			System.out.println(kouyama[j]);
		}
	}
	void pt_plus()//防御側行動ポイント回復
	{
		move_pt+=10;

	}
	void win_judg()//勝利判定
	{
		if(trust_pt<=0)//攻撃側が勝利した場合
		{

		}
		else if (continu_def==3)//防御側が勝利した場合
		{

		}

	}
	void attack_judg()
	{

	}
}
