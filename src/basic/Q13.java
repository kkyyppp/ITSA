package basic;

import java.util.Scanner;
import java.util.TreeMap;

public class Q13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//讀取總共幾行
		int num =  Integer.valueOf( sc.nextLine() );

		
		for(int i=0; i<num; i++) {
			//讀取一行(牌堆)，因為使用next() 只能讀取一張牌，可是不知道總共有幾張牌
			String line = sc.nextLine(); 
			//用空白分割出每一張牌
			String cards[] = line.split(" ");
			
			//map的element為<key, value>結構，用key來取value
			//其中TreeMap可以直接按照Key升密排序element
			TreeMap<Integer, String> map= new TreeMap<>();
			
			//計算每一張牌的價值，然後放進TreeMap中
			for(int j=0; j<cards.length; j++) {
				//直接把key設為 牌的價值大小
				int key = 0;
				//取得每張牌的花色(取第一個字元)
				char suit =  cards[j].charAt(0);
				//取得每張牌的點數
				int point = Integer.valueOf( cards[j].substring(1) );
				
				//把撲克牌想成14進位(因為一個花色有13張牌)
				switch(suit) {
					case 'S':	//''單引號表 字元(char)、""雙引號表 字串(String)
						key = 14*3; //黑桃最大 所以是14*3
						break;
					case 'H':
						key = 14*2;
						break;
					case 'D':
						key = 14;
						break;
					case 'C':
						key = 0;
						break;
				}
				
				//價值 = 0-(花色+點數) ，因為treemap預設是升冪排列，如果要按照Key由大排到小，則需要調整為倒數
				key = 0-(key+point);
				//放進map中
				map.put(key, cards[j]);
			}
			
			
			//依序輸出treemap
			for(Integer key : map.keySet()) {
				System.out.print(map.get(key));
				
				if(key != map.lastKey())
					System.out.print(" ");
			}
			System.out.println();
		}
		
	}

}
