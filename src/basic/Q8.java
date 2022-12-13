package basic;

import java.util.Scanner;

public class Q8 {

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);  
         
		 int score=sc.nextInt();  
		 //質數定義 除了1和自己以外不會被整除
		 //所以從2開始計算 取餘數
		 for(int i=2; i<score; i++) {  
			 
			 //發現有整除可以直接退出
	         if(score%i==0) {  
	        	 System.out.println("NO");  
	             return;  
	         }  
	     }  
	  
		 //都沒被退出，代表都沒被整除 即為質數
	     System.out.println("YES");  
	}

}
