package String_1;

import java.util.Scanner;

public class C_ST12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();

        if (A<B) {
            for (int i=A; i<=B; i++) {
                for (int j=0; j<i; j++)
                    System.out.print("*");

                System.out.println();
            }
        }
        else {
            for (int i=A; i>=B; i--) {
                for (int j=0; j<i; j++)
                    System.out.print("*");

                System.out.println();
            }
        }

    }
}
