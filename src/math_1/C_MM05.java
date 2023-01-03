package math_1;

import java.util.Scanner;

public class C_MM05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double edge = sc.nextDouble();
        double area = edge*edge;
        System.out.printf("%.1f\n",area);
    }
}
