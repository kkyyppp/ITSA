package basic;

import java.util.Scanner;

public class Q5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);  
		int enter =sc.nextInt();  
		
		String result="";  
        
        //負數相當於+256後的正數
        //e.g. -2 = 1111 1110 => 不把它當負數看相當於 128+64+32+16 +8+4+2 = 254 = 256+(-2)
        if(enter <0)  
            enter = 256+enter;  
      
        //十進位正數轉二進位的方法
        //每次除以2餘數存下來
        if(enter >= 0) {  
            for(int i=0; i<8; i++) {  
                if(enter%2 == 0)   
                    result = "0"+result;  
                else  
                    result = "1"+result;  
                  
                enter = enter/2;  
            }  
        }  
        
        System.out.println(result);    
         
	        
	}

}
