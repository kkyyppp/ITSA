package math_1;

import java.util.Scanner;

public class C_MM12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int distance = sc.nextInt();
        //1英吋 = 2.54公分
        double time = distance*100/(100-2.54*30);
        //Math.ceil()無條件進位到整數
        System.out.println( (int)Math.ceil(time));
    }
}
