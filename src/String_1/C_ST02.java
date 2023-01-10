package String_1;

import java.util.Scanner;

public class C_ST02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i=0; i<n; i++) {
            //讀取字串轉乘char array
            char cArray[] = sc.next().toCharArray();

            //反向輸出char array即為倒向文字
            for(int j=cArray.length-1; j>=0; j--)
                System.out.print(cArray[j]);

            System.out.println();
        }
    }
}
