package math_1;

import java.util.Scanner;

public class C_MM19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int time = sc.nextInt();
        double price = time* 0.9;

        if (time<= 800) {

        }
        else if (time < 1500)
            price *= 0.9;
        else
            price *= 0.79;

        System.out.printf("%.1f\n", price );
    }
}
