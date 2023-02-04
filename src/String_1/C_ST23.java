package String_1;
import java.util.Scanner;


public class C_ST23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str[] = sc.nextLine().toLowerCase().replace(" ","").split(",");
        char c1[] = str[0].toCharArray();
        char c2[] = str[1].toCharArray();

        //幫兩組字串 紀錄各自有出現的字母
        int count1[] = new int[26];
        int count2[] = new int[26];

        for (int i=0; i<c1.length; i++) {
            count1[c1[i]-97] = 1;
        }
        for (int i=0; i<c2.length; i++) {
            count2[c2[i]-97] = 1;
        }

        //檢查出現的字母是不是一樣
        for (int i=0; i<count1.length; i++) {
            if (count1[i] != count2[i]) {
                System.out.println(0);
                return;
            }
        }

        System.out.println(1);
    }
}
