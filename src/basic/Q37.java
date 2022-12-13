package itsa;

import java.util.ArrayList;
import java.util.Scanner;

public class Q37 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//用一個長度7的List存美哦點數的count,index 0不使用
		ArrayList<Integer> pointCountList = new ArrayList<>();
		for(int i=0; i<7; i++) {
			pointCountList.add(0);
		}
		
		//存出現的點數次數
		for(int i=0; i<4; i++) {
			int point = sc.nextInt();
			pointCountList.set(point, pointCountList.get(point)+1);
		}
		
		if(pointCountList.contains(4))	//豹子
			System.out.println("WIN");
		else if(pointCountList.contains(2) && pointCountList.contains(1)) {//只有兩個一樣的
			int total=0;
			for(int point=1; point<7; point++) {
				if(pointCountList.get(point) == 1)
					total+= point;
			}
			System.out.println(total);
		}
		else if(pointCountList.contains(2)) {//有兩組兩個一樣的
			int total=0;
			for(int point=1; point<7; point++) {
				if(pointCountList.get(point) == 2)
					total = total>(point*2) ? total : (point*2);
			}
			System.out.println(total);
		}
		else //其餘不合規定的
			System.out.println("R");

	}

}
