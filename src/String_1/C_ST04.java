package String_1;

import java.util.Scanner;

public class C_ST04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            //將char轉型int成即可
            int n = (int) sc.next().charAt(0);
            System.out.println(n);
        }

    }
}
