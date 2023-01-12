package String_1;

import java.util.Scanner;

public class C_ST14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=1, spaceCount=n-1; i<=n; i++, spaceCount--) {
            //輸出空白
            for (int j=0; j<spaceCount; j++)
                System.out.print(" ");

            //奇數行順序排序，偶數行反向排序
            if (i%2 ==1) {
                for (int j = 1; j <= i; j++)
                    System.out.print(j);
            }
            else {
                for (int j = i; j >= 1; j--)
                    System.out.print(j);
            }

            System.out.println();
        }

    }
}
