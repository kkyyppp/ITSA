package String_1;

import java.util.Scanner;

public class C_ST25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int shift = sc.nextInt();
        int codingType = sc.nextInt();

        System.out.print(shift+"\n"+codingType+"\n");

        if (codingType == 1)
            shift = 0-shift;


        while (true) {
            char c[] = sc.next().toCharArray();

            for (int i=0; i<c.length; i++) {
                //小寫
                if (c[i] >= 97) {
                    c[i] = (char) ((c[i] -97 +shift)%26 + 97);
                }
                else {  //大寫
                    c[i] = (char) ((c[i] -65 +shift)%26 + 65);
                }

                System.out.print(c[i]);
            }
            System.out.println();
        }
    }
}
