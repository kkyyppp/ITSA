package String_1;

import java.util.Scanner;

public class C_ST17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        //將字串轉為array
        char c[] = str.toCharArray();

        //每個字元一個從左到右，一個從右到左，搭配比對
        //前後比對到中間即可
        int half = c.length/2;
        for (int i=0; i<half; i++) {
            if (c[i] != c[c.length-i-1]) {
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");


        //法二，將字元倒序儲存看是否一樣
//        String invert="";
//        for (int i=c.length-1; i>=0; i--)
//            invert += c[i];
//
//        if (str.equals(invert))
//            System.out.println("YES");
//        else
//            System.out.println("NO");



    }

}
