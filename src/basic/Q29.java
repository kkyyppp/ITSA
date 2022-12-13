package itsa;

import java.util.Scanner;

public class Q29 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		
		//先轉換英文
		int p = invert(input.charAt(0));
		
		//按照公式計算
		p+= Integer.valueOf(input.substring(1, 2))*8 + 
				Integer.valueOf(input.substring(2, 3))*7+
				Integer.valueOf(input.substring(3, 4))*6+
				Integer.valueOf(input.substring(4, 5))*5+
				Integer.valueOf(input.substring(5, 6))*4+
				Integer.valueOf(input.substring(6, 7))*3+
				Integer.valueOf(input.substring(7, 8))*2+
				Integer.valueOf(input.substring(8, 9))+
				Integer.valueOf(input.substring(9, 10));
		
		System.out.println( p%10==0 ? "CORRECT!!!" : "WRONG!!!");
				
	}
	
	public static int invert(char c) {
		int result = 0;
		
		switch(c) {
			case 'A':
				result = 1+ 9*0;
				break;
			case 'B':
				result = 1+ 9*1;
				break;
			case 'C':
				result = 1+ 9*2;
				break;
			case 'D':
				result = 1+ 9*3;
				break;
			case 'E':
				result = 1+ 9*4;
				break;
			case 'F':
				result = 1+ 9*5;
				break;
			case 'G':
				result = 1+ 9*6;
				break;
			case 'H':
				result = 1+ 9*7;
				break;
			case 'J':
				result = 1+ 9*8;
				break;
			case 'K':
				result = 1+ 9*9;
				break;
			case 'L':
				result = 2+ 9*0;
				break;
			case 'M':
				result = 2+ 9*1;
				break;
			case 'N':
				result = 2+ 9*2;
				break;
			case 'P':
				result = 2+ 9*3;
				break;
			case 'Q':
				result = 2+ 9*4;
				break;
			case 'R':
				result = 2+ 9*5;
				break;
			case 'S':
				result = 2+ 9*6;
				break;
			case 'T':
				result = 2+ 9*7;
				break;
			case 'U':
				result = 2+ 9*8;
				break;
			case 'V':
				result = 2+ 9*9;
				break;
			case 'X':
				result = 3+ 9*0;
				break;
			case 'Y':
				result = 3+ 9*1;
				break;
			case 'W':
				result = 3+ 9*2;
				break;
			case 'Z':
				result = 3+ 9*3;
				break;
			case 'I':
				result = 3+ 9*4;
				break;
			case 'O':
				result = 2+ 9*5;
				break;
				
		}
		
		return result;
		
	}

}
