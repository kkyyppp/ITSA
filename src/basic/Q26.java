package itsa;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.TreeMap;

public class Q26 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);  
        //紀錄總共有幾組  
        int num = Integer.valueOf(sc.nextLine());  
          
        TreeMap<Integer, ArrayList<Integer>> map = new TreeMap<Integer, ArrayList<Integer>>();  
          
        int number[] = new int[num];  
        //總共讀取num個數字  
        for(int i=0; i<num; i++) {  
            number[i] = sc.nextInt();  
              
            //計算各位數總和 並設為key以存入TreeMap，用工具來排序  
            int key=0, tmp=number[i];  
            while(tmp>0) {  
                key+= tmp%10;  
                tmp/= 10;  
            }  
              
            //如果那個總和樹還沒有存過 則要先新增list  
            if(!map.containsKey(key))  
                map.put(key, new ArrayList<Integer>());  
              
            //存數那個總和數的list  
            map.get(key).add(number[i]);  
        }  
          
        //依序輸出  
        for(Integer key: map.keySet()) {  
            ArrayList<Integer> list = map.get(key);  
            //利用工具直接將Arraylist排序  
            Collections.sort(list);  
              
            for(int i=0; i<list.size(); i++) {  
            	//最後一個才要換行
                if( (i==list.size()-1) && key==map.lastKey())  
                    System.out.println(list.get(i));  
                else  
                    System.out.print(list.get(i)+" ");  
                      
            }  
        } 
	}

}
