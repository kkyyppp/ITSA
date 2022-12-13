package basic;

import java.util.ArrayList;
import java.util.Scanner;

public class Q27 {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 //用文字取可以直接取第幾個字元
         String answer = sc.next();
         
		 ArrayList<Integer> list = new ArrayList<>();
		 //用Integer.valueOf()轉乘int，但char直接轉數字會變成ascii碼，故要用字串轉
		 list.add(Integer.valueOf(answer.charAt(0)+""));
		 list.add(Integer.valueOf(answer.charAt(1)+""));
		 list.add(Integer.valueOf(answer.charAt(2)+""));
		 list.add(Integer.valueOf(answer.charAt(3)+""));
		 
		 String input;  
		 while( !(input=sc.next()).equals("0000") ) {  
	            int Acount=0;  
	            int Bcount=0;  
	              
	            //每一個位數分別檢查  
	            for(int i=0; i<4; i++) {  
	                int cur = Integer.valueOf( input.substring(i, i+1) );  
	                  
	                //有A算A，沒A才檢查B  
	                if(cur == list.get(i))  
	                    Acount++;  
	                else if(list.contains(cur))  
	                    Bcount++;  
	            }  
	              
	            System.out.println(Acount+"A"+Bcount+"B");  
	        }    
	        
	}

}
