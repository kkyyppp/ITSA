package itsa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Q18 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//接收使用者輸入 並轉為小寫
		String tmp =  sc.nextLine().toLowerCase();
		//將字串分割為字元
		char input[] = tmp.toCharArray();
		
		//直接把鍵盤存下來
		List<Character> list = new ArrayList<>();
		
		Character[] keyboard= 
			{
				//因為如果右邊沒東西，照題目要求要輸出相同字元，故直接最後一個字元多加一個來取用
					'`','1','2','3','4','5','6','7','8','9','0','-','=','=',	
					'~','!','@','#','$','%','^','&','*','(',')','_','+','+',
					'{','}','|','|',
					'q','w','e','r','t','y','u','i','o','p','[',']','\\','\\',
					':','"','"',
					'a','s','d','f','g','h','j','k','l',';','\'','\'',
					'<','>','?','?',
					'z','x','c','v','b','n','m',',','.','/','/',
					' ',' '
					};
       
		//用list存 因為可以使用indexof
		list = Arrays.asList(keyboard);
		
		String result="";
		for(int i=0; i<input.length; i++) {
			result = result + list.get( list.indexOf(input[i])+1 );
		}
		
		System.out.println(result);
	}

}
