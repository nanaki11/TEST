package main.java.rankB;

import java.util.Scanner;

public class B033 {
	static String STARTSTR ="| ";
	static String EMPTYSTR =" ";
	static String ENDSTR ="|";
	static String HAIHUN ="-";


	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int subjectNum = sc.nextInt();
		String title[] =  new String[subjectNum];
		for (int i = 0 ; i < subjectNum ; i++){
			title[i] = sc.next();
		}


		int dataNum = sc.nextInt();
		String data[] = new String[dataNum];
		String dataVal[][] =  new String[dataNum][subjectNum] ;



		for (int i = 0 ; i < dataNum ; i++){
			for (int m = 0 ; m < subjectNum ; m++){
			data[i] = sc.next();
			}
			dataVal[i] =  data[i].split(" ");
		}

		int maxLength[] = new int[subjectNum];

		for (int i = 0 ; i < subjectNum ; i++){
			int lenght = 0;

			for (int m = 0 ; m < dataNum ; m++){
				if (dataVal[m][i].length() >  lenght){
					lenght = dataVal[m][i].length();
				}
			}
			maxLength[i] = lenght;
		}


		makeHeaderAndIchiran(title);
		makeKugiri(maxLength);
		for (int i = 0 ; i < data.length ; i++){
			makeHeaderAndIchiran(dataVal[i]);
		}

	}

	private  static void makeHeaderAndIchiran(String title[]){
		StringBuilder st = new StringBuilder();
		for (int i = 0 ; i < title.length ; i ++){
			st.append(STARTSTR);
			st.append(title[i]);
			st.append(EMPTYSTR);
		}
		st.append(ENDSTR);
		System.out.println(st.toString());
	}

	private  static void makeKugiri(int maxLength[]){
		StringBuilder st = new StringBuilder();
		st.append(ENDSTR);

		for (int i = 0 ; i < maxLength.length ; i ++){
			for (int m = 0 ; m < (maxLength[i] + 2) ; m ++){
				st.append(HAIHUN);
			}
		}
		st.append(ENDSTR);

		System.out.println(st.toString());
	}

}
