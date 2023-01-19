package String_1;

import java.util.Scanner;

public class C_ST20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i=0; i<n; i++) {
            char a[] = sc.next().toCharArray();
            char b[] = sc.next().toCharArray();

            if(a.length != b.length) {
                System.out.println(0);
                break;
            }

            int count =0;
            for (int j=0; j<a.length; j++) {
                for (int k=0; k<b.length; k++)
                    if (a[j] == b[k]) {
                        //置換為非英文、計數
                        b[k] = '~';
                        count++;
                        break;
                    }
            }

            //所有字元都有map到
            if (count == a.length)
                System.out.println(1);
            else
                System.out.println(0);
        }
    }
}
