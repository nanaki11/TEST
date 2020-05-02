import java.util.Arrays;
import java.util.Scanner;

public class B021 {

	private static String[] addESList ={"s", "sh", "ch", "o", "x"};
	private static String[] notRepIESList ={"ay", "iy", "uy", "ey", "oy" };



	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		for (int i = 0 ; i < N ; i++){
			String inputWord = sc.next();
			System.out.println(printEditWord(inputWord));
		}
	}

	private  static String printEditWord(String inputWord){
		StringBuilder resStrBld = new StringBuilder();

		String[] lastWrodList = new String[2];
		lastWrodList[0] = inputWord.substring(inputWord.length() -1);
		lastWrodList[1] = inputWord.substring(inputWord.length() -2);

		if (checkES(lastWrodList)){
			resStrBld.append(inputWord);
			resStrBld.append("es");
		}else if (checkVES1(lastWrodList)){
			resStrBld.append(inputWord.substring(0,inputWord.length() -1));
			resStrBld.append("ves");
		}else if (checkVES2(lastWrodList)){
			resStrBld.append(inputWord.substring(0,inputWord.length() -2));
			resStrBld.append("ves");
		}else if (checkIES(lastWrodList)){
			resStrBld.append(inputWord.substring(0,inputWord.length() -1));
			resStrBld.append("ies");
		}else {
			resStrBld.append(inputWord);
			resStrBld.append("s");
		}

		return resStrBld.toString();

	}

	private static boolean checkES(String[] lastWrodList){
		return Arrays.asList(addESList).contains(lastWrodList[0])
				|| Arrays.asList(addESList).contains(lastWrodList[1]);
	}

	private static boolean checkVES1(String[] lastWrodList){
		return Arrays.asList(lastWrodList).contains("f");
	}
	private static boolean checkVES2(String[] lastWrodList){
		return Arrays.asList(lastWrodList).contains("fe");
	}
	private static boolean checkIES(String[] lastWrodList){
		return "y".equals(lastWrodList[0])
				&& !Arrays.asList(notRepIESList).contains(lastWrodList[1]);
	}
}

