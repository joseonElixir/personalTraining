package training00;

public class ForEx {

	public static void main(String[] args) {
		
		int arr1[] = new int [10];
		int arr2[] = new int [10];
		for(int i=0;i<10;i++) {
			int num =(int)(Math.random()*10+1);
			arr1[i]=num; //Ȧ��
			arr2[i]=num; //¦��
			
			if(num%2==0) {
			//	System.out.println("if���� ���� ������ ��."+i+"��°"+arr1[i]);
				arr1[i]++; // ::  arr1[i] =arr[i]+1; 
			}else {
			//	System.out.println("if���� ���� ������ ��. "+i+"��°"+arr2[i]);
				arr2[i]++; // :: 
			}
			
//			System.out.println("arr1["+i+"]="+arr1[i]);
//			System.out.println("arr2["+i+"]="+arr2[i]);
			
			System.out.println("arr1 = "+arr1[i]+", arr2="+arr2[i]+" �ε��� ��ȣ i="+i);
			
		}
		
	}
	
}
