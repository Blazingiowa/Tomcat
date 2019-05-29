package test_tomcat_git;

public class GameProject
{
	String player1;
	String player2;

	int[][] atcard = new int[12][5];//攻撃のカード（カードID０～１１の計１２枚）
	int[][] defcard = new int[8][2];//防御のカード（カードID１２～１９の計８枚）

	int p1_movept;//ｐ１の行動値
	int p2_movept;//ｐ２の行動値

	int p1_hp;//ｐ１のHP
	int p2_hp;//ｐ２のHP

	int[] atcardinfo = new int[5];//DBから攻撃カードのデータを受け取るときの退避用配列
	int[] defcardinfo = new int[2];//DBから防御カードのデータを受け取るときの退避用配列

	DataBaseConnect DBC = new DataBaseConnect();//DBクラスのインスタンス

	/*攻撃側の手札の配列内容(5×5)------------------------------/
	/															/
	/	[カードID][ダメージ値][コスト][防カード１][防カード２]	/
	/															/
	/----------------------------------------------------------*/

	//攻撃側の手札の設定
	void atcard()
	{
		for (int i = 0; i < 12; i++)
		{
			atcardinfo = DBC.reference(i, 0);//DBのカード情報を取り出して退避用配列に入れる
			for (int j = 0; j < 5; j++)
			{
				//攻撃のカード情報をセット
				atcard[i][j] = atcardinfo[j];
			}
		}

	}

	/*防御側の手札の配列内容(8×2)--/
	/								/
	/	[カードID][コスト]			/
	/								/
	/------------------------------*/

	//防御側の手札の設定
	void defcard()
	{
		for (int i = 0; i < 8; i++)
		{
			defcardinfo = DBC.reference(i, 0);//DBのカード情報を取り出して退避用配列に入れる
			for (int j = 0; j < 2; j++)
			{
				//防御側のカード情報をセット
				defcard[i][j] = defcardinfo[j];
			}
		}

	}

}