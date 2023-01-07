package math_1;

import java.util.Scanner;

public class C_MM35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        if(input%400 == 0)
            System.out.println("Bissextile Year");
        else if(input%100 == 0)
            System.out.println("Common Year");
        else if(input%4 == 0)
            System.out.println("Bissextile Year");
        else
            System.out.println("Common Year");
    }
}
