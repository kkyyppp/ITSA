package itsa;

import java.util.Scanner;

public class Q28 {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);  
         
         //紀錄特獎及頭獎號碼  
         String award[] = new String[4];  
         for(int i=0; i<4; i++) {  
             award[i] = sc.next();  
         }  
           
         //紀錄獎金和得獎數  
         int money=0;  
         int awardCount[] = new int[7];  
           
         int num = sc.nextInt();  
         for(int i=0; i<num; i++) {  
             String tmp = sc.next();  
               
             //檢查特獎  
             if(award[0].equals(tmp)) {  
                 money+= 2000000;  
                 awardCount[0]++;  
                 continue;  
             }  
               
             int maxPrice= 0;
             int awardOrder= -1;
             
             //檢查頭獎到六獎  
             for(int j=1; j<4; j++) {  
                 if(award[j].equals(tmp)) {  
                	 maxPrice= 200000;  
                	 awardOrder= 1;
                	 //頭獎是僅次特獎，所以不用繼續測
                	 break;
                 }  
                 else if(award[j].substring(1, 8).equals( tmp.substring(1, 8) )) {  
                     if(maxPrice<40000) {
                    	 maxPrice = 40000;
                    	 awardOrder = 2;
                     }
                 }  
                 else if(award[j].substring(2, 8).equals( tmp.substring(2, 8) )) {  
                	 if(maxPrice<10000) {
                    	 maxPrice = 10000;
                    	 awardOrder = 3;
                     } 
                 }  
                 else if(award[j].substring(3, 8).equals( tmp.substring(3, 8) )) {  
                	 if(maxPrice<4000) {
                    	 maxPrice = 4000;
                    	 awardOrder = 4;
                     }  
                 }  
                 else if(award[j].substring(4, 8).equals( tmp.substring(4, 8) )) {  
                	 if(maxPrice<1000) {
                    	 maxPrice = 1000;
                    	 awardOrder = 5;
                     } 
                 }  
                 else if(award[j].substring(5, 8).equals( tmp.substring(5, 8) )) {  
                	 if(maxPrice<200) {
                    	 maxPrice = 200;
                    	 awardOrder = 6;
                     } 
                 }  
             }
             
             if(awardOrder != -1) {
            	 money+= maxPrice;
            	 awardCount[awardOrder]++;
             }
            	 
         }  
           
         System.out.println(awardCount[0]+" "+awardCount[1]+" "+awardCount[2]+" "+awardCount[3]+" "+awardCount[4]+" "+awardCount[5]+" "+awardCount[6]);  
         System.out.println(money);

	}

}
