package itsa;

import java.util.Scanner;

public class Q34 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			int height = sc.nextInt();
			int gender = sc.nextInt();
			
			if(gender == 1) 
				System.out.printf( "%.1f\n",  ((height-80)*0.7) );
			else
				System.out.printf( "%.1f\n",  ((height-70)*0.6) );
		}
	}

}
