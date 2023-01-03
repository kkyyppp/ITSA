package math_1;

import java.util.Scanner;

public class C_MM04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        System.out.printf( "%d+%d=%d\n", n1, n2, (n1+n2) );
        System.out.printf( "%d*%d=%d\n", n1, n2, (n1*n2) );
        System.out.printf( "%d-%d=%d\n", n1, n2, (n1-n2) );

        if( (n1%n2) >= 0)
            System.out.printf( "%d/%d=%d...%d\n", n1, n2, (n1/n2), (n1%n2) );
        else {  //餘數不得為負值，故跟商借1，補給餘數
            System.out.printf("%d/%d=%d...%d\n", n1, n2, (n1 / n2)-1, (n1 % n2)+n2 );
        }
    }
}
