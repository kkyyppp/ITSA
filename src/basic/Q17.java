package basic;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class Q17 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String sentence =  sc.nextLine();
		
		//先轉乘小寫
		sentence = sentence.toLowerCase();
		//利用空白分割字詞
		String words[] = sentence.split(" ");

		//set用來保存[不重複]的資料，如果重複會自動幫忙刪除，其中LinkedHashSet還會保持先後存入的順序
		LinkedHashSet<String> set = new LinkedHashSet<>();
		//將分割後的字詞存入set
		for(String word : words)
			set.add(word);
		
		//依序印出
		int i=0;
		for(String word : set) {
			System.out.print(word);
			i++;
			if(i!=set.size())
				System.out.print(" ");
		}
		
		System.out.println();
	}

}
