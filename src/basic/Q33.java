package itsa;

import java.util.Scanner;

public class Q33 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input[] = sc.nextLine().split(" ");
		
		float avg = 0;
		for(int i=0; i<input.length; i++) {
			avg+= Integer.valueOf(input[i]);
		}
		
		avg = avg/input.length;
		System.out.printf("Size: %d\n", input.length);
		System.out.printf("Average: %.3f\n", avg);
	}

}
