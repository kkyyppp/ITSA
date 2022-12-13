package basic;

import java.util.Scanner;

public class Q21 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//先把第一個值存下來
		float min= sc.nextFloat();
		float max = min;
		
		//剩下九次 有比當前max大就置換max  比當前min小就置換min
		for(int i=0; i<9; i++) {
			float tmp = sc.nextFloat();
			max = tmp>max ? tmp : max;
			min = tmp<min ? tmp : min;
		}
		
		System.out.printf("maximum:%.2f\n",max);
		System.out.printf("minimum:%.2f\n",min);

	}

}
