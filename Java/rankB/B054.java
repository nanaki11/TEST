package main.java.rankB;

import java.util.Scanner;

public class B054 {


	//コンストラクタ
	public B054() {

	}

	static char strList[] = {'A','B','C','D','E'};
	static char intList[] = {'0','1','2','3','4'};

	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String iputList[] = line.split(" ");
        int sum = 0;


        for (String str :iputList){
        	sum += convertFromStrToInt(str);
        }

        System.out.println(convertFromIntToStr(sum));

	}

	private  static int convertFromStrToInt(String str){
		for (int i = 0 ; i < 5 ; i++ ){
			str = str.replace(strList[i], intList[i]);
		}
		int base5 = Integer.parseInt(str, 5);
		String base10 = Integer.toString(base5, 10);

		return Integer.parseInt(base10);
	}

	private  static String convertFromIntToStr(int num){
		String base5 = Integer.toString(num, 5);

		for (int i = 0 ; i < 5 ; i++ ){
			base5 = base5.replace(intList[i] , strList[i]);
		}


		return base5;
	}

}
