package array_1;

import java.util.Scanner;

public class C_AR04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalData = sc.nextInt();

        for (int i=0; i<totalData; i++) {
            int rows =sc.nextInt();
            int cols =sc.nextInt();
            int data[][] = new int[rows][cols];
            int dataTransfer[][] = new int[rows][cols];

            //讀取
            for(int j=0; j<rows; j++) {
                for (int k = 0; k < cols; k++) {
                    data[j][k] = sc.nextInt();
                }
            }

            //轉換 自己是1 且 上下左右有0者皆為邊界，邊界才設為1
            for(int j=0; j< rows; j++) {
                for (int k=0; k< cols; k++) {
                   if (data[j][k]==1 && //自己是1
                           (j==0 || k==0 || j==rows-1 || k==cols-1 || //就在最邊邊
                           data[j][k+1] ==0 || data[j][k-1] ==0 || //或是 上下為0
                           data[j+1][k] ==0 || data[j-1][k] ==0) ) //或是 左右為0
                       dataTransfer[j][k] = 1;
                   else
                       dataTransfer[j][k] = 0;
                }
            }

            //輸出
            for(int j=0; j<rows; j++) {
                for (int k = 0; k < cols; k++) {
                    if (k== cols-1) {//最後一行要換行且沒有空白
                        if (dataTransfer[j][k] == 1)
                            System.out.println("0 ");
                        else
                            System.out.println("_ ");
                    }
                    else {
                        if (dataTransfer[j][k] == 1)
                            System.out.print("0 ");
                        else
                            System.out.print("_ ");
                    }
                }
            }
            if (i!=totalData-1)
                System.out.println();
        }
    }
}
