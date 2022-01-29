package training00;

import java.util.Scanner;

class ForArr{
	
	int [] arr ;
	public ForArr(int i) {
		arr= new int[i];
	}
	
	public int[] setArr() {
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=(int)(Math.random()*10+1);
		}
		
		return arr;
	}
	
	public void getArr(int[] arr) {
		System.out.println();
		System.out.println("저장된 값 출력하기");
		for(int i = 0; i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
	}
	
	public void getMultiple (int[] arr) {
		
		System.out.println();
		System.out.println("2의 배수 출력하기");
		
		for(int i=0; i<arr.length;i++) {
			if(arr[i]%2==0) {
				System.out.println(arr[i]);
	
			}
		}
	}
}


public class ForTrainning01 {

	public static void main(String[] args) {
		ForArr farr= new ForArr(10);
		
		Scanner cs = new Scanner(System.in);
		
		
		System.out.print("데이터 입력: ");
		
		int get_data = cs.nextInt();
		cs.nextLine();
		
		switch(get_data){
		case 1 : farr.getArr(farr.setArr()); break;
		case 2 : farr.getMultiple(farr.setArr()); break;
			
		}
		
		
		
		
	}

}
