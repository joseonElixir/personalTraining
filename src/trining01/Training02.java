package trining01;

public class Training02 {

	public static void main(String[] args) {
	
		
		Train t = new Train();
		int arr[]=new int[10];
		Train t2 = new Train();
		
		t.makeArr(arr);
		t.takeArr(arr);
		t.printArr();
		t.arrAdr();
		System.out.println("-----------------------------------");
		
		
		t2.takeArr(t.outArr());
		t2.printArr();
		t2.arrAdr();
		
		System.out.println();
		System.out.println(t);
		System.out.println(t2);
		System.out.println(arr);
		
		

		
	}
	
}
