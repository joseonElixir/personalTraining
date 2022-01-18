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
		System.out.println("����for������ ���� key�� ����");
		for(int i : hm.keySet()) {
			System.out.println("������ Ű��:"+i+", ������ �����:"+hm.get(i));
		}
		System.out.println();
		System.out.println("Object �迭�� ���� ���� key�� ����");
		Object[] ob = hm.keySet().toArray();
		for(int i=0;i<ob.length;i++) {
			System.out.println(ob[i]+"="+hm.get(ob[i]));
		}
		System.out.println();
		Iterator<Integer> it = hm.keySet().iterator();
		System.out.println("Iterator�� ���� ���� key�� ����");
		while(it.hasNext()) {
			int num=it.next();
			System.out.println(num+"="+hm.get(num));
		}
		
		
	}
	
	
	
}
