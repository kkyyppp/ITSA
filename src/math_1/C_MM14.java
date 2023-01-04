package math_1;

import java.util.Scanner;

public class C_MM14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int time = sc.nextInt();
        int days = time/ (60*60*24);
        time %= (60*60*24);
        int hours = time/ (60*60);
        time %= (60*60);
        int minutes = time/ 60;
        time %= 60;
        int seconds = time;

        System.out.println(days+" days");
        System.out.println(hours+" hours");
        System.out.println(minutes+" minutes");
        System.out.println(seconds+" seconds");
    }
}
