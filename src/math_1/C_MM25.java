package math_1;

import java.util.Scanner;

public class C_MM25 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int enter=sc.nextInt();
        int n = enter/3;

        //利用梯形公式計算3的等差級數和 上底(3) 下底(3n) 高(n)
        System.out.println(n*(3+3*n)/2);
    }
}
