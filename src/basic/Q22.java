package itsa;

import java.util.Scanner;

public class Q22 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[][] record = new int[3][3];
		
		//先記錄下來
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				record[i][j] = sc.nextInt();
			}
		}
		
		//總共只有8個連成線的可能性 依序檢查
		int total = record[0][0]+record[0][1]+ record[0][2];
		if (total == 0 || total==3) {
			System.out.println("True");
			return;
		}
		
		total = record[1][0]+record[1][1]+ record[1][2];
		if (total == 0 || total==3) {
			System.out.println("True");
			return;
		}
		
		total = record[2][0]+record[2][1]+ record[2][2];
		if (total == 0 || total==3) {
			System.out.println("True");
			return;
		}
		
		total = record[0][0]+record[1][0]+ record[2][0];
		if (total == 0 || total==3) {
			System.out.println("True");
			return;
		}
		
		total = record[0][1]+record[1][1]+ record[2][1];
		if (total == 0 || total==3) {
			System.out.println("True");
			return;
		}
		
		total = record[0][2]+record[1][2]+ record[2][2];
		if (total == 0 || total==3) {
			System.out.println("True");
			return;
		}
		
		total = record[0][0]+record[1][1]+ record[2][2];
		if (total == 0 || total==3) {
			System.out.println("True");
			return;
		}
		
		total = record[0][2]+record[1][1]+ record[2][0];
		if (total == 0 || total==3) {
			System.out.println("True");
			return;
		}
		
		
		
		System.out.println("False");
		
	}

}
