package math_1;

import java.util.Scanner;

public class C_MM07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        //使用pow fuction會變成double，故要用%f輸出
        System.out.printf("%d %.0f %.0f\n", n, Math.pow(n,2), Math.pow(n,3)  );
    }
}
