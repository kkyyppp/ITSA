package math_1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C_MM50 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer>  booty = new ArrayList<>();
        for (int i=0; i<n; i++)
            booty.add(sc.nextInt());

        int minDiff = findMinPile(booty,0 ,0);

        System.out.println(minDiff);
    }

    public static int findMinPile(List<Integer> booty, int leftPile, int rightPile) {

        //遞迴都要找出終止條件，其餘遞迴
        if (booty.size() == 1) {
            //最後一個元素加到左邊堆
           int leftMinDiff = Math.abs( leftPile - rightPile + booty.get(0));
           //最後一個元素加到右邊堆
            int rightMinDiff =  Math.abs( leftPile - rightPile - booty.get(0) );

            return Math.min(leftMinDiff, rightMinDiff);
        }

        //第一個元素分別加到左堆和右堆比較，看看加到哪可以產生最小差距
        List<Integer> remainingBooty = booty.subList(1, booty.size());
        //執行遞迴
        int leftMinDiff =  findMinPile(remainingBooty, leftPile+ booty.get(0), rightPile);
        int rightMinDiff =   findMinPile(remainingBooty, leftPile, rightPile+ booty.get(0));

        return Math.min(leftMinDiff, rightMinDiff);
    }

}
