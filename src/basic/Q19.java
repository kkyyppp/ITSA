package basic;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Q19 {
    public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		//紀錄總共有幾組
		int num = sc.nextInt();
		
		//紀錄訂單時間
		int order[] = new int[num*2];
		for(int i=0; i<order.length; i++) {
			order[i] = sc.nextInt();
		}
		
		//記錄總巴士數
		int busCount = 0;
		//紀錄當前巴士返回時間
		int current = 0;
		
		//印為一筆訂單出發時間和結束時間  故一次要加二
		for(int i=0; i<order.length; i+=2) {
			//如果訂單已經使用過 就略過
			if(order[i] == -1)
				continue;
			
			//第二個迴圈從i開始，因為前面的訂單肯定被使用過了
			for(int j=i; j<order.length; j+=2) {
				//如果當前巴士的返回時間接得上這筆訂單的出發時間 就繼續發車
				if(current <= order[j]) {
					//設為反回時間
					current = order[j+1];
					//使用過的訂單做紀錄
					order[j] = -1;
				}
			}
			busCount++;
			current = 0;
		}
		
		System.out.println(busCount);
		
    }
    
}

