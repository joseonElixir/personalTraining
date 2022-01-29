package training00;

public class ForEx {

	public static void main(String[] args) {
		
		int arr1[] = new int [10];
		int arr2[] = new int [10];
		for(int i=0;i<10;i++) {
			int num =(int)(Math.random()*10+1);
			arr1[i]=num; //홀수
			arr2[i]=num; //짝수
			
			if(num%2==0) {
			//	System.out.println("if문을 통해 여과된 값."+i+"번째"+arr1[i]);
				arr1[i]++; // ::  arr1[i] =arr[i]+1; 
			}else {
			//	System.out.println("if문을 통해 여과된 값. "+i+"번째"+arr2[i]);
				arr2[i]++; // :: 
			}
			
//			System.out.println("arr1["+i+"]="+arr1[i]);
//			System.out.println("arr2["+i+"]="+arr2[i]);
			
			System.out.println("arr1 = "+arr1[i]+", arr2="+arr2[i]+" 인덱스 번호 i="+i);
			
		}
		
	}
	
}
