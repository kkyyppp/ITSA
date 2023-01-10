package String_1;

import java.util.ArrayList;
import java.util.Scanner;

public class C_ST11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //偶數少一行，乾脆直接讓它變基數
        if (n%2 == 0)
            n--;

        //空白一開始有 n/2 個數量，上三角形的行數也是，星號一開始有一個
        int half = n/2;
        int spaceCount = half;
        int starCount=1;

        //先輸出上三角，空白每次少1，星號每次多2
        for (int i=0; i<=half; i++, spaceCount--, starCount+=2) {
            //輸出空白
            for (int j=0; j<spaceCount; j++)
                System.out.print(" ");
            //輸出星號
            for (int j=0; j<starCount; j++)
                System.out.print("*");

            System.out.println();
        }

        //輸出下三角，下三角行數為half，空白一開始為一個，星號則為n-2
        spaceCount=1;
        starCount = n-2;
        //空白每次多1，星號每次少2
        for (int i=0; i<half; i++, spaceCount++, starCount-=2) {
            //輸出空白
            for (int j=0; j<spaceCount; j++)
                System.out.print(" ");
            //輸出星號
            for (int j=0; j<starCount; j++)
                System.out.print("*");

            System.out.println();
        }

    }
}
