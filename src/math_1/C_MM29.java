package math_1;

import java.util.Scanner;

public class C_MM29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt()-1;

        //從大往下找
        while(n>1) {
            boolean isPrimeNumber = true;
            for (int i = 2; i < n; i++) {
                //可被其他人整除 非質數 掠過
                if (n % i == 0) {
                    isPrimeNumber = false;
                    continue;
                }
            }

            if (isPrimeNumber) {
                System.out.println(n);
                return;
            }
            n--;
        }
    }
}
