package array_5;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class C_AR202 {
    public static void main(String[] args) {

        List<String> elements = Arrays.asList("Metal", "Water", "Wood", "Fire", "Earth");

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i=0; i<n; i++) {
            String input = sc.next();
            String type = sc.next();

            //找出元素所在index
            int index = elements.indexOf(input);

            //相生是下面一個元素，相剋是下兩個元素
            if (type.equals("Generating"))
                index++;
            else
                index+=2;

            //循環
            index %=5;

            System.out.println(elements.get(index));
        }
    }
}
