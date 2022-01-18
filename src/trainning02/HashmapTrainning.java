package trainning02;

import java.util.HashMap;
import java.util.*;
import java.util.Scanner;

public class HashmapTrainning {

	public static void main(String[] args) {
		
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<10;i++) {
			String st = ""+((int)(Math.random()*100));
			hm.put((int)(Math.random()*100+1),st );
		}
		System.out.println("개선for문으로 만든 key값 추출");
		for(int i : hm.keySet()) {
			System.out.println("생성된 키값:"+i+", 생성된 밸류값:"+hm.get(i));
		}
		System.out.println();
		System.out.println("Object 배열을 통해 만든 key값 추출");
		Object[] ob = hm.keySet().toArray();
		for(int i=0;i<ob.length;i++) {
			System.out.println(ob[i]+"="+hm.get(ob[i]));
		}
		System.out.println();
		Iterator<Integer> it = hm.keySet().iterator();
		System.out.println("Iterator를 통해 만든 key값 추출");
		while(it.hasNext()) {
			int num=it.next();
			System.out.println(num+"="+hm.get(num));
		}
		
		
	}
	
	
	
}
