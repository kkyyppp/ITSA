package itsa;

import java.util.Scanner;

public class Q25 {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		//紀錄總共有幾組
		 int num = Integer.valueOf(sc.nextLine());
		 
		 for(int i=0; i<num; i++) {
			 //先讀取一行再轉乘char array，不能用next() 因為中間可能有空白
			 char[] tmp = sc.nextLine().toCharArray();
			 
			 int total = 0;
			 for(int j=0; j<tmp.length; j++)
				 total += tmp[j];	//char轉成int就直接是ASCII編碼
				 
			 System.out.println(total);
		 }
		 
		 

	}

}
