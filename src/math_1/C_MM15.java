package math_1;

import java.util.Scanner;

public class C_MM15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        if (x>=0 && x<=100 && y>=0 && y<=100)
            System.out.println( "inside");
        else
            System.out.println( "outside");
    }
}
