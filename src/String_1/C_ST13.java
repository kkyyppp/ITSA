package String_1;

import java.util.Scanner;

public class C_ST13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int n = sc.nextInt();

        //1特別，額外輸出
        if (n == 1){
            System.out.println(1);
            return;
        }

        //上三角空白起始個數 n-1 每次減1, 第一航數字起始最大值1，每次加1
        int spaceCount = n-1;
        int lineMaxNumber = 1;

        //先輸出上三角
        for (int i=0; i<n; i++, spaceCount--, lineMaxNumber++) {
            //這一行的左半邊空白
            for (int j=0; j<spaceCount; j++)
                System.out.print(" ");
            //這一行的左半邊數字，從1開始(j=1)，一直到lineMaxNumber (j<=lineMaxNumber)，每次累加1(j++)
            for (int j=1; j<=lineMaxNumber; j++)
                System.out.print(j);
            //這一行的右半邊數字，從開始(j=lineMaxNumber-1)，一直到1 (j>=1)，每次累減1(j--)
            for (int j=lineMaxNumber-1; j>=1; j--)
                System.out.print(j);
            ///這一行的右半邊空白
            for (int j=0; j<spaceCount; j++)
                System.out.print(" ");

            System.out.println();
        }


        //下三角空白起始個數1 每次加1, 第一行數字起始最大值n-1，每次減1
        spaceCount = 1;
        lineMaxNumber = n-1;

        //輸出下三角
        for (int i=0; i<n; i++, spaceCount++, lineMaxNumber--) {
            //這一行的左半邊空白
            for (int j=0; j<spaceCount; j++)
                System.out.print(" ");
            //這一行的左半邊數字，從1開始(j=1)，一直到starCount/2 (j<=starCount/2)，每次累加1(j++)
            for (int j=1; j<=lineMaxNumber; j++)
                System.out.print(j);
            //這一行的右半邊數字，從開始(j=(starCount/2)-1)，一直到1 (j>=1)，每次累減1(j--)
            for (int j=lineMaxNumber-1; j>=1; j--)
                System.out.print(j);
            ///這一行的右半邊空白
            for (int j=0; j<spaceCount; j++)
                System.out.print(" ");

            System.out.println();
        }
    }
}
