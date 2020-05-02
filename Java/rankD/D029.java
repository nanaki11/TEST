import java.util.Scanner;

//サイコロ（入力値）の裏面を求めるプログラム
public class D029 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int iNum = sc.nextInt();
        String resultNum = getAnsNum(iNum);
        System.out.println(resultNum);
    }

    public static String getAnsNum(int iNum){
        String sResult;
        int iResult = 7 - iNum;
        sResult = String.valueOf(iResult);
        return sResult;
    }

}
