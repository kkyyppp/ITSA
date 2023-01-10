package String_1;

import java.util.*;

public class C_ST06 {
    public static void main(String[] args) {

        //list初始化要預先放值得方式
        //list可以有方式搜尋元素資料，故不使用Array
        //java 1.9可用List.of
        List<String> subjectList =  Arrays.asList("I","He","She","They","Mary","John");
        List<String> verbList =  Arrays.asList("love","like","see","find");
        List<String> objectList =  Arrays.asList("me","him","her","them","Mary","John");
        List<String> thirdPersonList =  Arrays.asList("He","She","Mary","John");
        //紀錄 主詞和受詞是同一類人稱代名詞

        //java 1.9可用Maps.of
        Map<String, String> subjectAndObjectMap = new HashMap<String, String>() {{
            put("I", "me");
            put("He", "him");
            put("John", "him");
            put("She", "her");
            put("Mary", "her");
            put("They", "them");
        }};
        //紀錄 受詞要改成反身代名詞
        Map<String, String> objectToReflexiveMap =  new HashMap<String, String>() {{
            put("me", "myself");
            put("him", "himself");
            put("her", "herself");
            put("them", "themselves");
        }};

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //nextInt不會吃掉換行符號 自己加
        sc.nextLine();

        for (int i=0; i<n; i++) {

            List<String> tmpSubject = new ArrayList<>();
            List<String> tmpVerbList = new ArrayList<>();
            List<String> tmpObject = new ArrayList<>();

            //分門別類儲存主詞 受詞 動詞
            String tmp[] = sc.nextLine().split(" ");
            for (int j=0; j<tmp.length; j++) {
                String str = tmp[j];
                //主詞跟受詞不是互斥，所以不能用 if else
                if (subjectList.contains( str ) )
                    tmpSubject.add(str);
                if (objectList.contains( str ) )
                    tmpObject.add(str);
                if (verbList.contains( str ) )
                    tmpVerbList.add(str);
            }

            //是不是第一個輸出的字串，第一個不用加" or "
            boolean isFirst=true;
            for (int a=0; a<tmpSubject.size(); a++) {

                for (int b=0; b<tmpVerbList.size(); b++) {
                    for (int c=0; c<tmpObject.size(); c++) {
                        //字串比對要用equals
                        if (tmpSubject.get(a).equals(tmpObject.get(c)))
                            continue;

                        String subject = tmpSubject.get(a);
                        String verb = tmpVerbList.get(b);
                        String object = tmpObject.get(c);
                        String prefix = " or ";

                        //第三人稱要加s
                        if (thirdPersonList.contains( subject) )
                            verb +="s";

                        //當主詞和受詞是同一類人稱代名詞時，受詞要改成反身代名詞
                        if (subjectAndObjectMap.get(subject).equals(object))
                            object = objectToReflexiveMap.get(object);

                        //第一個以上不要加 or
                        if (isFirst) {
                            prefix = "";
                            isFirst = false;
                        }

                        System.out.print(prefix + subject+" "+verb+" "+object);
                    }
                }
            }
            System.out.println();
        }
    }
}
