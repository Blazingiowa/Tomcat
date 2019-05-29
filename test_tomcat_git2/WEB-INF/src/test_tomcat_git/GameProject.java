package test_tomcat_git;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GameProject
{
	String player1;
	String player2;

	List<Integer> atcard = new ArrayList<Integer>();//攻撃側山札（０～１１の計１２枚）
	List<Integer> defcard = new ArrayList<Integer>();;//防御側山札（１２～１９の計８枚）

	int[][] athand = new int[5][5];//攻撃側の手札（５枚）
	int[][] defhand = new int[8][2];//防御側の手札（８枚）

	int at_movept;//攻撃側の行動値
	int def_movept;//防御側の行動値

	int def_hp;//防御側の信頼度（HP＝これが０になったら攻撃側の勝ち）
	int winpt;//勝利条件（防御側が３回防いだら＝これが３溜まったら防御側の勝ち）

	int[] atcardinfo = new int[5];//DBから攻撃カードのデータを受け取るときの退避用配列
	int[] defcardinfo = new int[2];//DBから防御カードのデータを受け取るときの退避用配列

	//DataBaseConnect DBC = new DataBaseConnect();//DBクラスのインスタンス

	/*------メモ--------------------------------------------------------/
	/<リスト名>.add(要素番号);//リストに追加							/
	/<リスト名>.get(要素番号)											/
	/<リスト名>.remove(要素番号);//リスト内を要素番号で削除				/
	/Collections.shuffle(<リスト名>);//リスト内のシャッフル				/
	/------------------------------------------------------------------*/

	//山札の初期設定
	void start()
	{
		//攻撃側の山札の初期設定、リストに０～１１を入れる（攻撃カードIDとなる）
		for (int i = 0; i < 12; i++)
		{
			atcard.add(i);
		}

		//防御側の山札の初期設定、リストに１２～１９を入れる（防御カードIDとなる）
		for (int i = 12; i < 20; i++)
		{
			defcard.add(i);
		}
	}

	/*攻撃側の手札の配列内容(5×5)------------------------------/
	/															/
	/	[カードID][ダメージ値][コスト][防カード１][防カード２]	/
	/															/
	/----------------------------------------------------------*/

	//攻撃側の手札の設定
	void athand()
	{
		Collections.shuffle(atcard);//攻撃カードの山札をシャッフル
		for (int i = 0; i < 5; i++)
		{
			//atcardinfo = DBC.reference(atcard.get(i), 0);//DBのカード情報を取り出して退避用配列にぶち込む
			for (int j = 0; j < 5; j++)
			{
				//攻撃側の手札にカード情報をセット
				athand[i][j] = atcardinfo[j];
			}
		}

	}

	/*防御側の手札の配列内容(8×2)--/
	/								/
	/	[カードID][コスト]			/
	/								/
	/------------------------------*/

	//防御側の手札の設定
	void defhand()
	{
		for (int i = 0; i < 8; i++)
		{
			//defcardinfo = DBC.reference(defcard.get(i), 0);//DBのカード情報を取り出して退避用配列にぶち込む
			for (int j = 0; j < 2; j++)
			{
				//防御側の手札にカード情報をセット
				defhand[i][j] = defcardinfo[j];
			}
		}

	}

}