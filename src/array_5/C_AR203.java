package array_5;

import java.util.Scanner;

public class C_AR203 {
    public static void main(String[] args) {

        String planet[] = {"","Mercury","Venus","Earth","Mars","Juputer","Saturn","Uranus","Neptunus","Pluto"};

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i=0; i<n; i++) {
            int order = sc.nextInt();
            System.out.println(order + " " + planet[order]);
        }
    }
}
