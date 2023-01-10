package String_1;

import java.util.Scanner;

public class C_ST05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        //存學校 跟特性
        String colleges[] = new String[n];
        String characters[] = new String[n];
        for (int i=0; i<n; i++) {
            colleges[i] = sc.next();
            characters[i] = sc.nextLine();
        }

        int m = Integer.valueOf(sc.nextLine());

        //m個條件需要測試
        for(int i=0; i<m; i++) {
            String str = sc.nextLine();
            //用加號分割 每個"或"的條件，加號位特殊字元 須加逃脫字元"\\"
            String tmp[] = str.split("\\+");

            boolean isFirstMatched = true;
            //每個學校都跑一輪是否符合
            for(int l=0; l<characters.length; l++) {

                //每個"或"的條件(有一個符合即可)
                for (int j=0; j<tmp.length; j++) {

                    boolean isMatch = true;

                    //再用"空白"分割 每個或條件的 交集特性(都需要符合)
                    String demands[] = tmp[j].split(" ");
                    for (int k=0; k<demands.length; k++) {
                        if (!characters[l].contains( demands[k]))
                            isMatch = false;
                    }

                    //交集特性都有符合 且不在已入選名單 則儲存
                    String matched = colleges[l];
                    if (isMatch) {
                        if (isFirstMatched) {
                            System.out.print(colleges[l]);
                            isFirstMatched = false;
                        } else
                            System.out.print(" " + colleges[l]);
                        //有一個"或的條件"條件符合就不用再檢查了
                        break;
                    }
                }
            }

            System.out.println();
        }
    }
}
