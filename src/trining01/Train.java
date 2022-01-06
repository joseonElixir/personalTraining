package trining01;

//배열에 저장된 값을 새로운 배열에 저장하는 메소드

public class Train {
			
	static int num = 1;//멤버변수
	String user;
	int arr[];
	
	
	
	public Train() { //변칙메소드 (생성자)
		
		arr = new int[0];
		
	}
	
	public void takeArr(int [] ar) { //멤버메소드
		
		if(arr.length==0) {
			arr= new int[ar.length];
		}
		for(int i=0;i<ar.length;i++) {
			arr[i]=ar[i];
		}
	}
	
	public void makeArr(int [] ar) { 
		arr= new int[ar.length];
		for(int i=0; i<ar.length;i++) {
			ar[i]=(int)(Math.random()*30+1);
			//이미 값이 담겨있는 배열의 정보를 멤버변수 배열에 저장하려면 위의 랜덤부여만 빼면 됨.
			arr[i]=ar[i];
			
		}
	}
	
	public void printArr () {
		
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
			
		}
	}
	
	public int[] outArr() {
		return arr;
	}
	
	public void arrAdr() {
		System.out.println(arr);
	}
	
	
}
