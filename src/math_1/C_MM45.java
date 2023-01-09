package math_1;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class C_MM45 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //人名清單
        ArrayList<String> nameList = new ArrayList<>();
        //禮物清單
        ArrayList<String> giftList = new ArrayList<>();
        //人名及其攜帶禮物Map
        HashMap<String, String> nameGiftMap = new HashMap<>();


        //紀錄人名、禮物名、人名及禮物配對
        for (int i=0; i<n; i++) {
            String name = sc.next();
            String gift = sc.next();
            nameList.add(name);
            giftList.add(gift);
            nameGiftMap.put(name, gift);
        }

        ArrayList<String> output = new ArrayList<>();
        makePair(nameList, giftList, nameGiftMap, "", output);
        System.out.println(output.size());
        for (String str: output) {
            System.out.println(str);
        }
    }

    private static void makePair (List<String> nameList, List<String> giftList, HashMap<String, String> nameGiftMap, String outputStr, ArrayList<String> output) {

        //遞迴的終止條件，最後一個配對
        if (nameList.size() == 1 ) {
            //若禮物不是自己的，全部配段完成，加入輸出資料
            if ( !nameGiftMap.get( nameList.get(0) ).equals( giftList.get(0)) )
                output.add(outputStr+ nameList.get(0) + " " + giftList.get(0));

            return;
        }

        //第一個人拿的禮物，從禮物清單第一個開始拿到最後
        for (int i=0; i< giftList.size(); i++) {

            List<String> tmpNameList =  new ArrayList<>(nameList);
            List<String> tmpGiftList = new ArrayList<>(giftList);
            String tmpOutputStr;

            //若該禮物不屬於第一個人的，則可以往下進行配對
            if ( !nameGiftMap.get( nameList.get(0) ).equals( giftList.get(i))) {
                //紀錄配對文字
                tmpOutputStr = outputStr + tmpNameList.get(0) + " " + tmpGiftList.get(i)+",";
                //暫存姓名清單 刪除第一個人的名字後，往下遞迴
                tmpNameList.remove(0);
                //暫存禮物清單 刪除該被拿取之禮物，往下遞迴
                tmpGiftList.remove(i);

                makePair(tmpNameList, tmpGiftList, nameGiftMap, tmpOutputStr, output);
            }
        }

    }
}
