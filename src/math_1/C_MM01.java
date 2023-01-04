package math_1;

import java.util.Scanner;

public class C_MM01 {
    public static void main(String args[])  {
        Scanner sc = new Scanner(System.in);
        int upper = sc.nextInt();
        int lower = sc.nextInt();
        int height = sc.nextInt();

        System.out.printf("Trapezoid area:%.1f\n",  (upper+lower)*height/2.0 );
    }
}
