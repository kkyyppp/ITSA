package String_1;

import java.util.Scanner;

public class C_ST22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char c[] = sc.next().toCharArray();

        for (int i = c.length - 1; i >= 0; i--) {

            if (c[i] >= 65 && c[i] <= 90)
                c[i] += 32;
            else if (c[i] >= 97 && c[i] <= 122)
                c[i] -= 32;

            System.out.print(c[i]);
        }
        System.out.println();
    }
}
