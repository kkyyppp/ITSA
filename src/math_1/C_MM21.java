package math_1;

import java.util.Scanner;

public class C_MM21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        //數字太大 需要使用到long
        long result = 1;

        //乘到2就可以了，因為乘1 就是自己
        for (; n>1; n--)
            result *= n;

        System.out.println(result);

    }
}
