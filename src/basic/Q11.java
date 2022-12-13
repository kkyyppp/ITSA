package itsa;

import java.util.Scanner;

public class Q11 {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 //紀錄有幾行幾列
		 int row = sc.nextInt();
		 int col = sc.nextInt();
		 
		 //反轉矩陣 乾脆一開始就反著紀錄
		 //原本是int[row][col]的矩陣 反轉後會變成 int [col][row]的矩陣
		 int [][] tmp = new int [col][row];
		 //反著紀錄即為 把原本第i行第j列的數值 改記錄到 第j行第i列
		 for(int i=0; i<row; i++) {
			 for(int j=0; j<col; j++) {
				 tmp[j][i] = sc.nextInt();
			 }
		 }
		 
		 //最後印出一開始已經反轉的舉證	
		 for(int i=0; i<col; i++) {
			 for(int j=0; j<row; j++) {
				 System.out.print(tmp[i][j]);
				 
				 if(j!=row-1)
					 System.out.print(" ");
			 }
	
			System.out.println();
		 }
	}

}
