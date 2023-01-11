package String_1;

import java.util.Scanner;

public class C_ST16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char c[] = sc.next().toCharArray();

        System.out.print(c[0]);
        for (int i=1; i<c.length; i++)
            System.out.print("   "+c[i]);

        System.out.println();
    }
}
