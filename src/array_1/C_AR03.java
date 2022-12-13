package array_1;

import java.util.Scanner;

public class C_AR03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum=0;
        for(int i=0; i<6; i++) {
            int tmp = sc.nextInt();
            sum += Math.pow(tmp, 3);
        }

        System.out.println(sum);
    }
}
