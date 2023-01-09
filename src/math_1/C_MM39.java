package math_1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class C_MM39 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i<3; i++) {
            list.add(sc.nextInt());
        }

        //排序
        Collections.sort(list);

        //優先檢查是否可以成為三角形(兩邊和大於第三邊)
        if(list.get(0)+ list.get(1) <= list.get(2))
            System.out.println("Not Triangle");
        else if ( Math.pow(list.get(0), 2) +  Math.pow(list.get(1), 2) ==  Math.pow(list.get(2), 2))
            System.out.println("Right Triangle");
        else if ( Math.pow(list.get(0), 2) +  Math.pow(list.get(1), 2) <  Math.pow(list.get(2), 2))
            System.out.println("Obtuse Triangle");
        else if ( Math.pow(list.get(0), 2) +  Math.pow(list.get(1), 2) >  Math.pow(list.get(2), 2))
            System.out.println("Acute Triangle");
    }
}
