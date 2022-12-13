package array_1;

import java.util.Scanner;

public class C_AR02 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str[] = sc.nextLine().split(" ");

        for(int i=str.length-1; i>0; i--)
            System.out.print(str[i]+" ");

        System.out.println(str[0]);
    }
}
