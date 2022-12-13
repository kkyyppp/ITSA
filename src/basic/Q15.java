package basic;

import java.util.Scanner;
import java.util.TreeMap;

public class Q15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String tmp =  sc.nextLine();
		//大小寫不分，所以先都轉成小寫
		tmp = tmp.toLowerCase();
		String str[] = tmp.split(" ");
		
		//紀錄<字元,出現次數>，treemap會依照key值大小排序
		TreeMap<Character , Integer> map = new TreeMap<>();
		for(int i=0; i<tmp.length(); i++) {
			char key = tmp.charAt(i);
			
			//除了英文以外都略過不統計,小寫a為ascii 97, z =122
			if (!(key>=97 && key<=122))
				continue;

			if(!map.containsKey(key)){ //沒紀錄過 則計數1
				map.put(key, 1);
			}
			else {	//紀錄過則計數加1
				map.put(key, map.get(key)+1);
			}
		}
		
		//先輸出詞數量
		System.out.println(str.length);
		//再依序輸出次數
		for(char key : map.keySet()) {
			System.out.println(key+" : "+map.get(key));
		}

	}

}
