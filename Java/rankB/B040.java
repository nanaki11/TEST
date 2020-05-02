package main.java.rankB;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class B040 {
	static String nomal = "abcdefghijklmnopqrstuvwxyz";
	static char[] noumalList = nomal.toCharArray();
	static char[] keyList = null;;

	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String line = sc.nextLine();
        String lineList[] = line.split(" ");

        String genbun = sc.nextLine();
        char genbunList[] = genbun.toCharArray();

        int cnt = Integer.parseInt(lineList[0]);

        String key = lineList[1];
        keyList = key.toCharArray();
        Map<Character,Character> map = new HashMap<Character,Character>();
        for (int i =  0 ; i < keyList.length ; i ++){
        	map.put(keyList[i],noumalList[i]);
        }


        for (int i =  0 ; i < cnt ; i ++){
        	for (int m =  0 ; m < genbunList.length ; m ++){
        		if (map.get(genbunList[m]) != null){
        		genbunList[m] = map.get(genbunList[m]);
        		}
        	}
        }
        System.out.println(String.valueOf(genbunList));


	}

}
