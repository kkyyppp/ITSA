package basic;

import java.util.Scanner;

public class Q12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		
		System.out.println(function(k));
	}
	
	//建立一個function讓自己可以呼叫自己，因為main無法呼叫自己
	public static int function(int k) {
		if(k>1)
			return function(k-1) + function(k/2);
		else
			return k+1;
	}
}
