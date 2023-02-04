package array_5;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class C_AR205 {
    public static void main(String[] args) throws ParseException {

        Date starSign[] = new Date[13];
        String name[] = {"Capricorn","Aquarius","Pisces","Aries","Taurus","Gemini","Cancer","Leo","Virgo","Libra","Scorpio","Sagittarius","Capricorn"};
        SimpleDateFormat sdf = new SimpleDateFormat("MMdd");

        //設定各星座最後的日期(山羊座跨年，故利用技巧設為13個區間)
        starSign[0] = sdf.parse("0120");
        starSign[1] = sdf.parse("0219");
        starSign[2] = sdf.parse("0320");
        starSign[3] = sdf.parse("0419");
        starSign[4] = sdf.parse("0520");
        starSign[5] = sdf.parse("0621");
        starSign[6] = sdf.parse("0722");
        starSign[7] = sdf.parse("0822");
        starSign[8] = sdf.parse("0922");
        starSign[9] = sdf.parse("1023");
        starSign[10] = sdf.parse("1121");
        starSign[11] = sdf.parse("1220");
        starSign[12] = sdf.parse("1231");

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i=0; i<n; i++) {
            String str = sc.next();
            Date birth = sdf.parse(str);
            int day = Integer.valueOf(str);

            //檢查輸入日期落在哪個區間，即為那個星座
            for (int j=0; j<starSign.length; j++) {
                if (birth.getTime() <= starSign[j].getTime()) {
                    System.out.println(day + " " + name[j]);
                    break;
                }
            }
        }
    }
}
