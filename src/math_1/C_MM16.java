package math_1;

import java.util.Scanner;

public class C_MM16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        if ( (x*x + y*y) <= 100*100)
            System.out.println( "inside");
        else
            System.out.println( "outside");
    }
}
