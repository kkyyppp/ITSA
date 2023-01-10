package String_1;

import java.util.Scanner;

public class C_ST09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        //先設定好每一行的文字有幾顆星(時間複雜度 2N)
        String lineStr = "";
        for (int i=0; i<x; i++)
            lineStr +="*";
        //總共幾行 輸出幾次
        for (int i=0; i<y; i++) {
          System.out.println(lineStr);
        }

        //傳統二維for loop(時間複雜度 N*N)，用2000 2000下去帶就有明顯差別
//        for (int i=0; i<y; i++) {
//            for (int j=0; j<x; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
    }
}
