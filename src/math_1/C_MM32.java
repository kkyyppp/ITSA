package math_1;

import java.util.Scanner;

public class C_MM32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int tmp = num;
        int n[] = new int[3];

        //取出每個數字
        for(int i=0; i<3; i++) {
            n[i] = tmp%10;
            tmp/=10;
        }

        if((Math.pow(n[0],3) + Math.pow(n[1],3)+ Math.pow(n[2],3)) == num)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
