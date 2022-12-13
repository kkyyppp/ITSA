package itsa;

import java.util.Scanner;

public class Q10 {

	public static void main(String[] args) {
//		 Scanner sc=new Scanner(System.in);  
//		 int scors =sc.nextInt();
//		 int scors1 =sc.nextInt();  
//		 
//	     int num ;   
//	     if (scors>scors1) {  
//	    	 num=scors1;   
//	     } else {
//	    	 num=scors;  
//	     }  
//	    
//	     for (int i=num;i>0;i--) {  
//	    	 if (scors %i==0 && scors1 %i==0) {  
//	                System.out.println(i);  
//	                break;  
//	         } 
//	    }  
		
		//公式解
		 Scanner scanner = new Scanner(System.in);
		 int x = scanner.nextInt();
		 int y = scanner.nextInt();
		 int tmp = 0;
		 
		 //輾轉相除法取最大公因數
		 //y = x取餘數y
		 //x = 原本y
		 while(x % y != 0){
			 tmp = y;
			 y = x % y;
			 x = tmp;
		 }
		 System.out.println(y);
	}

}
