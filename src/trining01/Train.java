package trining01;

//�迭�� ����� ���� ���ο� �迭�� �����ϴ� �޼ҵ�

public class Train {
			
	static int num = 1;//����ƽ����
	String user;//�������
	int arr[];
	
	
	
	public Train() { //��Ģ�޼ҵ� (������)
		user = "";
		arr = new int[0];
		
	}
	
	public void takeArr(int [] ar) { //����޼ҵ�
		//������� arr�� ũ�Ⱑ 0�� ���
		//�Է¹��� �迭�� ���� ������� arr�� �����Ѵ�.
		if(arr.length==0) {
			arr= new int[ar.length];
		}
		for(int i=0;i<ar.length;i++) {
			arr[i]=ar[i];
		}
	}
	
	public void makeArr(int [] ar) { 
		//�Է����� �迭�� ũ��� ������� arr�� ũ�⸦ �ʱ�ȭ�ϰ�
		//�Է¹��� �迭�� ������ ���� �־� ���� �� 
		//�� ���� ������� arr�� �����Ѵ�.
		arr= new int[ar.length];
		for(int i=0; i<ar.length;i++) {
			ar[i]=(int)(Math.random()*30+1);
			//�̹� ���� ����ִ� �迭�� ������ ������� �迭�� �����Ϸ��� ���� �����ο��� ���� ��.
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
