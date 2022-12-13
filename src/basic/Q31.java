package basic;

import java.util.HashMap;
import java.util.Scanner;

public class Q31 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input[] = sc.nextLine().split(" ");
		
		int maxCount=0, element=0;
		
		HashMap<Integer, Integer> map = new HashMap<>();
		for(int i=0; i<input.length; i++) {
			int key = Integer.valueOf(input[i]);
			
			if(!map.containsKey(key)) {
				map.put(key, 0);
			}
			
			//累計
			int curCount = map.get(key)+1;
			map.put(key, curCount);
			
			//確認目前最大count 及記錄可能的過半元素
			if(curCount >maxCount) {
				maxCount= curCount;
				element = key;
			}
		}
		
		
		if(maxCount >= (input.length/2+1) )
			System.out.println(element);
		else
			System.out.println("NO");
		
	}

}
