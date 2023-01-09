package math_1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class C_MM38 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> edge = new ArrayList<>();
        edge.add(sc.nextInt());
        edge.add(sc.nextInt());
        edge.add(sc.nextInt());

        //由小到大排序
        Collections.sort(edge);

        if (edge.get(0) + edge.get(1) > edge.get(2))
            System.out.println("fit");
        else
            System.out.println("unfit");
    }
}
