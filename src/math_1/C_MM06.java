package math_1;

import java.util.Scanner;

public class C_MM06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int km = sc.nextInt();
        double miles = km* 1.6;
        System.out.printf( "%.1f\n", miles);
    }
}
