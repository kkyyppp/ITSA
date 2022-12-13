package basic;

import java.util.Scanner;

public class Q32 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char input[] = sc.nextLine().toCharArray();
		int shift = sc.nextInt();

		
		for(int i=0; i<input.length; i++) {
		
			//ASCII碼的 A~X
			if(input[i]>=65 && input[i]<=88)
				input[i] =  (char) (input[i]+shift);
			//ASCII碼的 Y Z,因為要大寫循環，再shift的話ASCII會轉移到非英文字
			else if(input[i]==89 || input[i]==90)
				input[i] =  (char) (input[i]+shift -24);
			//ASCII碼的 a~x
			else if(input[i]>=97 && input[i]<=120)
				input[i] =  (char) (input[i]+shift);
			//ASCII碼的 y z,因為要大寫循環，再shift的話ASCII會轉移到非英文字
			else if(input[i]==121 || input[i]==122)
				input[i] =  (char) (input[i]+shift -24);
		}
		
		System.out.println( String.valueOf(input) );
	}

}
