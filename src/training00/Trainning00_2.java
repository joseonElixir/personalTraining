package training00;

public class Trainning00_2 {

	public static int[] ranArr(int size, int range, int start) {
		
		int arr[] = new int[size];
		if(size >range) {
			System.out.println("�迭�� ũ�Ⱑ �߻��ϴ� ������ ������ Ŭ �� ����.");
		return null;
		}
		
		
		//2��for�� 1���� �迭�� ��������, �ߺ��˻�, ���� ¦��, �Ĺ� Ȧ��, �������� �����ϱ�.
		//break�� �������� �κ� ����������.
		for(int i = 0 ; i<arr.length;i++) {
			arr[i] = (int) (Math.random() * range + start);
			for(int j=0;j<i;j++) {
				if (arr[i] == arr[j]) {
					i--;
					break;
				}else if((arr[i]%2!=0 && arr[j]%2!=0&& arr[j]<arr[i])||
					(arr[i]%2==0&&arr[j]%2!=0)||
					(arr[i]%2==0&& arr[j]%2==0&& arr[j]<arr[i])){
					
					int tmp= arr[i];
					arr[i]=arr[j];
					arr[j]=tmp;
				}
			}
			
		}
		
		for(int i=0; i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
		return arr;
	}

	public static void main(String[] args) {
		
		int arr[] = ranArr(10, 10, 1);

	}

}
