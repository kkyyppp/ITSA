package itsa;

import java.util.Scanner;

public class Q38 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//度 = 千瓦小時 = kWh
		int kWh = sc.nextInt();
		
		double summerPrice[] = {2.1, 3.02, 4.39, 4.97, 5.63};
		double nonSummerPrice[] = {2.1, 2.68, 3.61, 4.01, 4.5};
		int level[] = {0, 120, 330, 500, 700, Integer.MAX_VALUE};
		
		double summerBill=0;
		double nonSummerBill=0;
		
		for(int i=1; i<level.length; i++) {
			
			if(kWh <= level[i]) {
				int diffkWh = kWh-level[i-1];
				summerBill+=  diffkWh* summerPrice[i-1];
				nonSummerBill+= diffkWh * nonSummerPrice[i-1];
				break;
			}
			else {
				int diffkWh = level[i]-level[i-1];
				summerBill+=  diffkWh* summerPrice[i-1];
				nonSummerBill+= diffkWh * nonSummerPrice[i-1];
			}
		}
		
		
		System.out.println("Summer months:"+summerBill);
		System.out.println("Non-Summer months:"+nonSummerBill);
	}
}
