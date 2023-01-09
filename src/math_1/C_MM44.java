package math_1;

import java.util.Scanner;

public class C_MM44 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String target = sc.next();
        String content = sc.next();

        int index = 0;
        int count = 0;
        //不等於-1 代表有找到，計數+1， 往下一個index為起始開始搜尋 index+1
        while( (index = content.indexOf(target, index) )!= -1) {
            count++;
            index++;
        }

        System.out.println(count);
    }
}
