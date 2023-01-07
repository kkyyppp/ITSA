package math_1;

import java.util.Scanner;

public class C_MM36 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int score=sc.nextInt();
        switch (score) {
            case 3:
            case 4:
            case 5:
                System.out.println("Spring");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Summer");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Autumn");
                break;

            default:
                System.out.println("Winter");
        }

    }
}
