package String_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.TreeMap;


public class C_ST18 {
    public static void main(String[] args) throws IOException {

        //紀錄保留字 不計算
        List<String> reservedWords = Arrays.asList("auto", "break", "case", "char", "const", "continue", "default", "do", "double",
                "else", "enum", "extern", "float", "for", "goto", "if", "int", "long", "register", "return", "short", "signed", "sizeof",
                "static", "struct", "switch", "typedef", "union", "unsigned", "void", "volatile", "while");

        //紀錄變數出現的行數
        TreeMap<String, String> countMap = new TreeMap<>();


        //這題沒有講總共有幾行 無法使用scanner，否則會一直卡在輸入無法停止
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //題目說 最多每行100個字，最多1000行
        char c[] = new char[100*1000];
        br.read(c);

        //char[]轉String,char =0 表示沒資料就不讀取
        String str="";
        for (int i=0; (c[i]!=0) && i<c.length ; i++) {


            str+= c[i];
        }
        String content[] = str.split("\n");

        //每一行檢查
        for (int i=0; i<content.length; i++) {
            //先用正規表示式移除符號，再用空白切割出來單字
            String words[] = content[i].replaceAll("[()+=;{},]","").split(" ");

            for (int j=0; j<words.length; j++) {
                String word = words[j];
                //保留字不計數
                if (reservedWords.contains(word))
                    continue;

                if (!countMap.containsKey(word))
                    countMap.put(word, j+"");
                else
                    countMap.put(word, countMap.get(word)+" "+j);
            }
        }


    }
}
