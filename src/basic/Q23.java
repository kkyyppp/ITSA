package basic;

import java.util.Scanner;

public class Q23 {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		
		 String tmp[] = sc.next().split(",");
		 
		 //計算還剩多少錢要找
		 int balance = Integer.valueOf( tmp[0] );
		 balance = balance - Integer.valueOf( tmp[1] )*15;
		 balance = balance - Integer.valueOf( tmp[2] )*20;
		 balance = balance - Integer.valueOf( tmp[3] )*30;
		 
		 //錢不夠
		 if(balance<0) {
			 System.out.println(0);
			 return;
		 }
		 
		 int fiftyCount = balance/50;
		 balance = balance%50;
		 
		 int fiveCount= balance/5;
		 balance = balance%5;
		 
		 int oneCount = balance;
		 
		 System.out.println(oneCount+","+fiveCount+","+fiftyCount);

	}

}
