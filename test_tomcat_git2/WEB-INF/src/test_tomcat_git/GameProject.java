package test_tomcat_git;

import java.util.ArrayList;
import java.util.List;
//import java.util.Scanner;

public class GameProject
{
	String player1;
	String player2;
	List<Integer> atcard =new ArrayList<Integer>();//攻撃カード（０～１１の計１２枚）
	List<Integer> difcard =new ArrayList<Integer>();;//防御カード（１２～１９の計８枚）
	int[][]athand = new int[5][5];//攻撃者の手札（５枚）
	int[][]difhand = new int[8][2];//防御者の手札（８枚）
	//static int del;
	//Random rd = new Random();

/*------メモ-----------------------------------------------------------------------------------------------------*/
		//Scanner sc =new Scanner(System.in);

			//<リスト名>.add(要素番号);//リストに追加
			//<リスト名>.get(要素番号)
			//<リスト名>.remove(要素番号);//リスト内を要素番号で削除
			//Collections.shuffle(<リスト名>);//リスト内のシャッフル
/*---------------------------------------------------------------------------------------------------------------*/

	void startmethod()
	{
		atcard.add(0);
		atcard.add(1);
		atcard.add(2);
		atcard.add(3);
		atcard.add(4);
		atcard.add(5);
		atcard.add(6);
		atcard.add(7);
		atcard.add(8);
		atcard.add(9);
		atcard.add(10);
		atcard.add(11);
	}
	void hand()
	{

	}


}