package String_1;

import java.util.Scanner;

public class C_ST01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true) {
            int target = sc.nextInt();
            int x = sc.nextInt();

            //對應轉換字元
            String convert[] = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "A", "B", "C", "D", "E", "F"};
            String output = "";

            //一直取餘數，並把餘數存下
            while (x >= target) {
                output = convert[x % target] + output;
                x /= target;
            }
            //最後的商要加進去
            output = x + output;

            System.out.println(output);
        }
    }
}
