package main.java.rankB;

import java.util.Scanner;

//5 5
//1 2
//3 4
//オートフィルター
public class B053 {

	static int tateCnt;
	static int yokoCnt;
	static String data[][] = new String[2][2];

	public B053(String[] inputList) {
		//メンバ変数を設定する処理
		tateCnt = Integer.parseInt(inputList[0].split(" ")[0]);
		yokoCnt = Integer.parseInt(inputList[0].split(" ")[1]);

		for (int i = 0 ; i < 2  ;i++){
			data[i] = inputList[i+1].split(" ");
		}
	}

	//文字列から差を返却
	private int subtractStr(String str1 ,String str2 ){
		return Integer.parseInt(str1) - Integer.parseInt(str2);
	}

	private StringBuilder createTable(){
		StringBuilder sb = new StringBuilder();

		return sb;
	}

	public static void main(String[] args) {

		//入力値の処理
		Scanner sc = new Scanner(System.in);
		String[] inputList  = new String[3];

		for (int i = 0 ; i < 3 ; i++){
			inputList[i] = sc.nextLine();
		}

		B053 b = new B053(inputList);

		for (int i = 0 ; i < yokoCnt ; i ++){


		}

		System.out.println(b.createTable().toString());
	}

}
