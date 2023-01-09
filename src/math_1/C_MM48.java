package math_1;

import java.util.Scanner;

public class C_MM48 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i=0; i<n; i++) {
            int input = sc.nextInt();
            System.out.println( f91(input) );
        }
    }

    public static int f91(int n) {
        if (n<=100)
            return f91( f91(n+11));
        else
            return  n-10;
    }
}
