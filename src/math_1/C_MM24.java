package math_1;

import java.util.Scanner;

public class C_MM24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int time = sc.nextInt();
        int hourlyWage = sc.nextInt();
        double wage = 0;

        if (time<=60)
            wage = time* hourlyWage;
        else if (time<=120)
            wage = 60*hourlyWage + (time-60)*hourlyWage*1.33;
        else
            wage = 60*hourlyWage + 60*hourlyWage*1.33 + (time-120)*hourlyWage*1.66;

        System.out.printf("%.1f\n",wage);
    }
}
