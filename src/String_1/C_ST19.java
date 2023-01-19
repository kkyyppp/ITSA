package String_1;

import java.util.Scanner;

public class C_ST19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        String country[] = {"JA","TW","UK","USE","USC","USW"};
        //以台灣為主，切換到其他國家要調整幾個小時
        int convert[] = {1,0,-8,-12,-13,-14};

        for (int i=0; i<n; i++) {
            String time = sc.next();
            String from = sc.next();
            String to = sc.next();

            int hour = Integer.valueOf( time.substring(0,2) );
            String minute = time.substring(2);

            //將時間轉成到台灣
            for(int j=0; j<country.length; j++) {
                if (from.equals( country[j])) {
                    hour -= convert[j];
                    break;
                }
            }

            //再將時間從台灣轉到另一個
            for(int j=0; j<country.length; j++) {
                if (to.equals( country[j])) {
                    hour += convert[j];
                    break;
                }
            }

            //循環 小於0或大於24的要轉換
            hour = hour<0 ? hour+24: hour;
            hour %=24;

            //補零
            String hourStr = hour>=10 ? hour+"" : "0"+hour;
            System.out.println(hourStr+minute+ " " + to);
        }


    }
}
