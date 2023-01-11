package String_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.Stream;

public class C_ST18 {
    public static void main(String[] args) throws IOException {

        //這題沒有講總共有幾行 無法使用scanner，否則會一直卡在輸入無法停止
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //
        Stream<String> content = br.ready();
        System.out.println(  content.count() );


        System.out.println();
    }
}
