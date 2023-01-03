package math_1;

import java.util.Scanner;

public class C_MM09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();

        if (i>31)
            System.out.println("Value of more than 31");
        else if (i== 0) //任何數的0次方 = 1
            System.out.println(1);
        else {
            System.out.println(2 << i-1);
        }

        //<< 相當於*2  數次 (以二進位來看，左移一位相當於乘以2)
        //反之>> 相當於/2 數次
    }
}
