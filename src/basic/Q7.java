package basic;

import java.util.Scanner;

public class Q7 {
	public static void main(String[] args) {
		  Scanner sc=new Scanner(System.in);  
		  
		  //紀錄有幾行計算
		  int num =sc.nextInt();
		  //紀錄第一個數 a[0]紀錄實數,a[1]紀錄虛數
		  int a[] =  new int[2];
		  //記錄第二個數
		  int b[] =  new int[2];
		  
		  for(int i=0; i<num; i++) {
			  String operator = sc.next();
			  a[0] = sc.nextInt();
			  a[1] = sc.nextInt();
			  b[0] = sc.nextInt();
			  b[1] = sc.nextInt();
			  
			  //複數計算
			  switch (operator) {
			  	case "+"://加法   實部相加 虛部相加
			  		System.out.println((a[0]+b[0])+ " "+ (a[1]+b[1]) );
			  		break;
			  	case "-"://減法   實部相減 虛部相減
			  		System.out.println((a[0]-b[0])+ " "+ (a[1]-b[1]) );
			  		break;
			  	case "*"://乘法   公式如下
			  		System.out.println((a[0]*b[0] - a[1]*b[1])+ " "+ (a[0]*b[1] + a[1]*b[0]) );
			  		break;
			  }
		  }
	}
}
