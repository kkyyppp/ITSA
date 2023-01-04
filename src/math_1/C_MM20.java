package math_1;

import java.util.Scanner;

public class C_MM20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        //直接用function轉換
        //System.out.println( Integer.toHexString(n).toUpperCase());

        //先存好對應文字
        String convert[] = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "A", "B", "C", "D", "E", "F"};
        String result="";
        while(n>=16) {
            int tmp = n%16;
            result = convert[tmp]+result;
            n/=16;
        }
        result = convert[n]+result;

        System.out.println( result);
    }
}
