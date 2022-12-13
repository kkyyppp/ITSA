package itsa;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Q35 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//幾筆測資
		int num = sc.nextInt();
		
		for(int k=0; k<num; k++) {
			//總預算
			int budget = sc.nextInt();
			//員工數
			int employeeNum = sc.nextInt();
			//可選擇禮物數
			int giftNum = sc.nextInt();
			//餘額數
			int balance = budget;
			
			//存入禮物價格
			ArrayList<Integer> giftList = new ArrayList<>();
			for(int i=0; i<giftNum; i++)
				giftList.add(sc.nextInt());
			
			//利用工具排序
			Collections.sort(giftList);
			//依序檢調最便宜的禮物
			for(int i=0; i<employeeNum ; i++) {
				balance-= giftList.get(i);
			}
			
			//印出結果
			if(balance<0)
				System.out.println("Impossible");
			else
				System.out.println(budget-balance);
		}

	}

}
