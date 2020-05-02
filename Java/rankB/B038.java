package main.java.rankB;

import java.util.Scanner;

public class B038 {
	static int footSum = 0;
	static int headSum = 0;
	static int tsuruFoot = 0;
	static int kameFoot = 0;

	//鶴亀算
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		String inputMatrix[] = line.split(" ");
		footSum = Integer.parseInt(inputMatrix[0]);
		headSum = Integer.parseInt(inputMatrix[1]);
		tsuruFoot = Integer.parseInt(inputMatrix[2]);
		kameFoot = Integer.parseInt(inputMatrix[3]);

		int reverseMatrix[] = createReverseMatrix();
		System.out.println(multiplyMatrix(reverseMatrix));
	}

	private static int[] createReverseMatrix(){

		int[] rltMatrix = new int[4];
		rltMatrix[0] = 1;
		rltMatrix[1] = -kameFoot;
		rltMatrix[2] = -1;
		rltMatrix[3] = tsuruFoot;

		return rltMatrix;
	}

	private static String multiplyMatrix(int[] reverseMatrix){
		StringBuilder st = new StringBuilder();

		if ((tsuruFoot-kameFoot) == 0){
			st.append("miss");
			return st.toString();
		}

		int tsuruVal = (reverseMatrix[0]*footSum + reverseMatrix[1]*headSum)/(tsuruFoot-kameFoot);
		int kameVal = (reverseMatrix[2]*footSum + reverseMatrix[3]*headSum)/(tsuruFoot-kameFoot);

		if(tsuruVal > 0
				&& kameVal > 0){

			st.append(tsuruVal);
			st.append(" ");
			st.append(kameVal);
		} else {
			st.append("miss");
		}


		return st.toString();
	}

}
