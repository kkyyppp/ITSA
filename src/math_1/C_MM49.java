package math_1;

import java.math.BigInteger;
import java.util.Scanner;

public class C_MM49 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i=0; i<n; i++) {
            //數字太大，需要使用BigInteger來計算
            BigInteger input = new BigInteger(sc.next());

            //用input的倍數檢查是否為 連續1數字太慢，反過來用連續1數字看是否為input的倍數
            int count=1;
            BigInteger target = new BigInteger("1");
            //判斷餘數是否為0
            while( !target.remainder(input).equals(new BigInteger("0")) ) {
                count++;
                //每次*10 +1，相當於後面多加一個1
                target = target.multiply( new BigInteger("10")).add(new BigInteger("1") );
            }

            System.out.println(count );
        }

    }
}
