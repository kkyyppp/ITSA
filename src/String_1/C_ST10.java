package String_1;

import java.util.Scanner;

public class C_ST10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        //總共n行，星號開始為1個 每次多1，空白為n-星號個
        for (int i=1; i<=n; i++) {
            //輸出空白
            for (int j=0; j<n-i; j++)
                System.out.print(" ");
            //輸出星號
            for (int j=0; j<i; j++)
                System.out.print("*");

            System.out.println();
        }
    }
}
