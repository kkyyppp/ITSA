package basic;

import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);   
	     int x=sc.nextInt();  
	     int y=sc.nextInt();  
	     
	     //距離公式 長的平方+寬的平方 >= 半徑的平方 即在圓內
	     System.out.println((x*x + y*y<=10000)?"inside":"outside");  
	              
	}  
	

}
