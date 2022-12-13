package itsa;

import java.util.Scanner;

public class Q40 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] isbn = new int[10];
		for(int i=0; i<10; i++) {
			String tmp = sc.next().replace("X", "10");
			isbn[i] = Integer.valueOf(tmp);
		}
		
		
		int sum=0;
		for(int i=0; i<2; i++) {
			sum=0;
			for(int j=0; j<10; j++) {
				sum+= isbn[j];
				isbn[j] = sum;
			}
		}
		
		System.out.println((sum%11)==0 ? "YES" : "NO");
	}

}
