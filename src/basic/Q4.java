package basic;

import java.util.Scanner;

public class Q4 {

	public static void main(String[] args) {
		
        Scanner sc=new Scanner(System.in);  
        int colck1 =sc.nextInt();  
        int min1 =sc.nextInt();  
        int colck2 =sc.nextInt();  
        int min2 =sc.nextInt();  
        
        //全部轉成分鐘計算
        int time1=colck1*60+min1;  
        int time2=colck2*60+min2;  
        int time=time2-time1;  
        int result=0;  
          
        if (time<=120) {  
            result=time / 30 * 30;  
        }else if(time <=240 && time >120) {  
              
            result=(time-120)/30*40+120;  
        }else {  
              
            result =(time-240)/30*60+120+160;  
        }  
        System.out.println(result);  

	}

}
