package math_1;

import java.util.Scanner;

public class C_MM11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int price = sc.nextInt();

        System.out.printf("NT10=%d\n", price/10 );
        price %=10;
        System.out.printf("NT5=%d\n", price/5 );
        price %=5;
        System.out.printf("NT1=%d\n", price );
    }
}
