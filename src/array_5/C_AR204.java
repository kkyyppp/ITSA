package array_5;

import java.util.Scanner;

public class C_AR204 {
    public static void main(String[] args) {
        String zodiac[] = {"rat","ox","tiger","rabbit","dragon","snake","horse","sheep","monkey","rooster","dog","pig"};

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i=0; i<n; i++) {
            int age = sc.nextInt();
            int order;

            if (age >=0)
                order = (age-1) % 12;
            else {
                order = age % 12;
                if (order !=0)
                    order +=12;
            }

            System.out.println(age + " " + zodiac[order]);
        }
    }
}
