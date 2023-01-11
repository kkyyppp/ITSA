package String_1;

import java.util.Scanner;

public class C_ST15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        //只輸出n-1行， 1~n 一邊要一邊不要，為n-1個-
        for (int i=1; i<n; i++) {

            //順序輸出，從1到i
            for (int j=1; j<=i; j++)
                System.out.print(j);

            //倒序輸出，從n到+1
            for (int j=n; j>i; j--)
                System.out.print(j);

            System.out.println();
        }
    }
}
