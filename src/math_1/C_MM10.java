package math_1;

import java.util.Scanner;

public class C_MM10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double celsius = sc.nextDouble();
        double fahrenheit = celsius *9 /5 +32;
        System.out.printf("%.1f\n",fahrenheit );
    }
}
