package array_5;

import java.util.Scanner;

public class C_AR201 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i=0; i<n; i++) {
            //紀錄X軸最後到哪
            int lastX = 0;
            //紀錄每個點的高度
            int heights[] = new int [20];

            int totalHouse = sc.nextInt();
            for (int j=0; j<totalHouse; j++) {
                int start = sc.nextInt();
                int end = sc.nextInt();
                int height = sc.nextInt();

                for (int k=start; k<=end; k++)
                    heights[k] = height > heights[k] ? height : heights[k];

                lastX = end > lastX  ? end :lastX;
            }

            System.out.print(heights[0]);
            for (int j=1; j<=lastX; j++) {
                System.out.print(" "+heights[j]);
            }
            System.out.println();
        }

    }
}
