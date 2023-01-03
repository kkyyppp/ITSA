package math_1;

import java.util.Scanner;

public class C_MM02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int bottom = sc.nextInt();
        int height = sc.nextInt();

        //一定要用浮點數去除(整數/浮點數 = 浮點數)
        double area = bottom * height / 2.0;
        System.out.println( area);
    }
}
