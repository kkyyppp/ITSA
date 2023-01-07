package math_1;

import java.util.Scanner;

public class C_MM28 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int scope=sc.nextInt();
        for(int i=35;i<=scope;i+=35) {
            if(i+35<=scope)
                System.out.print(i+" ");
            else
                System.out.println(i);
        }
    }
}
