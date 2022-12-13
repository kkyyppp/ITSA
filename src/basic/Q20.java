package basic;

import java.util.Scanner;

public class Q20 {
	public static void main(String args[]) {
		 Scanner sc = new Scanner(System.in);
		//紀錄總共有幾組
		int num = sc.nextInt();
		
		for(int i=0; i<num; i++) {
			String a = sc.next();
			String b = sc.next();
			
			//用來存兩個大整數
			int A[] = new int[a.length()];
			int B[] = new int[b.length()];
			//紀錄大整數的 max size
			int max = a.length()>b.length() ? a.length() : b.length();
			
			//用來存總和 ,考慮進位 所以位數要加一
			int sum[] = new int[max+1];
			
			//將字串轉換為大整數(字串是從左到右，但數字是從右到左 所以要反著存)
			int aLength = a.length();
			for(int j=0 ; j<aLength; j++) {
				A[aLength-j-1] = Integer.valueOf(a.substring(j, j+1));
			}
		
			int bLength = b.length();
			for(int j=0 ; j<bLength; j++) {
				B[bLength-j-1] = Integer.valueOf(b.substring(j, j+1));
			}

			//執行加法
			for(int t=0; t<max; t++) {
				if(t<a.length())
					sum[t] += A[t];
				if(t<b.length())
					sum[t] += B[t];
				
				//處理進位
				sum[t+1] = sum[t]/10;
				sum[t] = sum[t]%10;
			}
			
			//若最大一個位數有進位，則要多讀一個數字
			String sumStr = "";
			if(sum[max] != 0)
				max++;
			
			for(int j=0; j<max; j++)
				sumStr =  sum[j]+sumStr;
			
			System.out.println(sumStr);
		}
	 }

}
