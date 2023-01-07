package math_1;

import java.util.Scanner;

public class C_MM33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        boolean isFirst = true;
        //6是第一個完美數，從6開始即可
        for (int i = 6; i <= n; i++) {
            int sum = 0;
            for (int j = 1; j < i; j++) {
                if (i % j == 0)
                    sum += j;
            }

            if (sum == i) {
                if (isFirst) {//第一個前面不用空白分割
                    System.out.print(sum);
                    isFirst = false;
                } else
                    System.out.print(" " + sum);
            }
        }

        System.out.println();
    }
}
