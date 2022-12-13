package itsa;

import java.util.Scanner;

public class Q36 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//幾筆測資
		int input = sc.nextInt();

		if(input%400 == 0)
			System.out.println("Bissextile Year");
		else if(input%100 == 0)
			System.out.println("Common Year");
		else if(input%4 == 0)
			System.out.println("Bissextile Year");
		else
			System.out.println("Common Year");
	}

}
