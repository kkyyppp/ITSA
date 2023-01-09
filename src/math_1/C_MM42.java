package math_1;

import java.util.Scanner;

public class C_MM42 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        double sum=0;
        for(int i=1; i<=n; i++)
            sum += Math.pow(-1, i+1) / (2*i-1);

        System.out.printf("%.3f\n", sum);
    }
}
