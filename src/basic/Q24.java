package basic;

import java.math.BigDecimal;
import java.util.Scanner;

public class Q24 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//每期 本利和 (本就是1所以要加1)
		BigDecimal r = sc.nextBigDecimal().add(new BigDecimal(1));
		//期數
		int n = sc.nextInt();
		//每期投入金額
		BigDecimal p =  sc.nextBigDecimal();
		
		BigDecimal total = new BigDecimal(0);
		for(int i=0; i<n; i++) {
			total = total.add(p).multiply(r);	
		}
		
		//因為java的浮點數不精準，所以要用BigDecimal 及toBigInteger
		System.out.println(total.toBigInteger());

	}

}
