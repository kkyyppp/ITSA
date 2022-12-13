package basic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Q39 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//幾筆測資
		int num = sc.nextInt();
		
		for(int i=0; i<num; i++) {
			ArrayList<Integer> score = new ArrayList<>();
			score.add( sc.nextInt() );
			score.add( sc.nextInt() );
			score.add( sc.nextInt() );
			
			int sum = score.get(0)+score.get(1)+score.get(2);
			
			//排序 由小排到大 
			Collections.sort(score);
			
			if(score.get(0)>=60)	//座小的大於60分 三顆一定都大於60分
				System.out.println("P");
			else if(score.get(1)>=60 && sum>=220)
				System.out.println("P");
			else if(score.get(1)>=60)
				System.out.println("M");
			else if(score.get(2)>=80)
				System.out.println("M");
			else
				System.out.println("F");
		}

	}

}
