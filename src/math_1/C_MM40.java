package math_1;

import java.util.Scanner;

public class C_MM40 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i=1; i<n; i++)
            System.out.print(i+" + ");

        System.out.println(n+" = "+ ((1+n)*n/2) );
    }
}
