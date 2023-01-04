package math_1;

import java.util.Scanner;

public class C_MM13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int startTime = sc.nextInt()*60 + sc.nextInt();
        int endTIme = sc.nextInt()*60 + sc.nextInt();
        double totalTime = endTIme- startTime;

        int price = 0;
        if (totalTime <30) {
            //未滿半小時不計費
        }
        else if (totalTime<120) {
            //以半小時為單位 無條件進位 再乘上費率30
            price = (int) Math.floor(totalTime/30) * 30;
        }
        else if (totalTime<=240) {
            //先扣掉2小時 加上2小時的費用
            totalTime -= 120;
            price = 30*4;

            price += (int) Math.floor(totalTime/30) * 40;
        }
        else {
            //先扣掉2小時 加上2小時的費用
            totalTime -= 120;
            price = 30*4;
            //再扣掉2小時 加上2-4小時的費用
            totalTime -= 120;
            price += 40*4;

            price += (int) Math.floor(totalTime/30) * 60;
        }
        System.out.println( price );
    }
}
