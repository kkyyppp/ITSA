package basic;

import java.util.Scanner;

public class Q16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String subStr =  sc.nextLine();
		String mainStr =  sc.nextLine();
		
		
		int count = 0;
		
		//如果mainStr含有subStr 則繼續往下找
		int subStrShowAt = -1;
		while( (subStrShowAt=mainStr.indexOf(subStr)) != -1) {
			//找到計數
			count ++;
			
			//mainStr 置換
			//e.g.  aaa123bbab 找 aa，第一次subStrShowAt為0，則mainStr置換為 aa123bbab
			mainStr = mainStr.substring(subStrShowAt+1);
		}
		
		System.out.println(count);

	}

}
