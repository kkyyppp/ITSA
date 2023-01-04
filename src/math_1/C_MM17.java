package math_1;

import java.util.Scanner;

public class C_MM17 {
    public static void main(String[] args) {
        //公式解
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int tmp = 0;

        //輾轉相除法取最大公因數
        //y = x取餘數y
        //x = 原本y
        while(x % y != 0){
            tmp = y;
            y = x % y;
            x = tmp;
        }
        System.out.println(y);
    }
}
