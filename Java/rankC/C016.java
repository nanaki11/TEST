package main.java.rankC;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//入力文字列を数字に変換する
public class C016 {
	public static void main(String[] args) {

		Map<String,String> map =new HashMap<String,String>();
		map.put("A","4");
		map.put("E","3");
		map.put("G","6");
		map.put("I","1");
		map.put("O","0");
		map.put("S","5");
		map.put("Z","2");

		StringBuilder resultStr = new StringBuilder();

		Scanner sc = new Scanner(System.in);
		String inputStr = sc.nextLine();


		char cList[] = inputStr.toCharArray();
		for (char c : cList){
			String s = map.get(String.valueOf(c));
			if (s != null){
				resultStr = resultStr.append(s);
			} else {
				resultStr = resultStr.append(c);
			}
		}

		System.out.println(resultStr.toString());
	}

}
