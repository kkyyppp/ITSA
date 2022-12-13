package basic;

import java.util.Scanner;

public class Q14 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);  
        int input =sc.nextInt();  
        int tmp = input;  
        String invert="";  
        
        //將數值每次除以10取餘數紀錄  即可得到 反轉後得數值
        while(tmp>0) {  
            invert = invert+tmp%10;  
            tmp = tmp/10;  
        }  
        
        //若反轉後的數值 等於 原本數值 及代表為 回文
        if(input == Integer.valueOf(invert))  
            System.out.println("YES");  
        else  
            System.out.println("NO");  
          

	}

}
