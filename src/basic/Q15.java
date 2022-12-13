package itsa;

import java.util.Scanner;
import java.util.TreeMap;

public class Q15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String tmp =  sc.nextLine();
		//大小寫不分，所以先都轉成小寫
		tmp = tmp.toLowerCase();
		
		//紀錄總共有幾個詞，詞的數量為空白加1
		int wordsCount=1;
		
		//檢查是否為連續分隔號
		boolean lateCharIsSplit = false;
		
		//紀錄<字元,出現次數>，treemap會依照key值大小排序
		TreeMap<Character , Integer> map = new TreeMap<>();
		for(int i=0; i<tmp.length(); i++) {
			char key = tmp.charAt(i);
			
			//遇到空白 逗點 句點為分隔號，詞數加1(但連續分隔號不能重複算)如I had a god. You have a cat.
			if(key == ' ' || key == '.' || key == ',') {
				//不是最後的分隔號，且上一個字元也不是分隔號(不然會重複計算)，字詞數就要加1
				if((i!=tmp.length()-1) && !lateCharIsSplit)
					wordsCount++;
				
				//紀錄此字元為分隔號
				lateCharIsSplit = true;
				//為分隔號 後面就不用執行累計
				continue;
			}
			else
				lateCharIsSplit = false;
			
			
			
			if(!map.containsKey(key)){ //沒紀錄過 則計數1
				map.put(key, 1);
			}
			else {	//紀錄過則計數加1
				map.put(key, map.get(key)+1);
			}
		}
		
		//先輸出詞數量
		System.out.println(wordsCount);
		//再依序輸出次數
		for(char key : map.keySet()) {
			System.out.println(key+" : "+map.get(key));
		}

	}

}
