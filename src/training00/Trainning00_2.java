package training00;

public class Trainning00_2 {

	public static int[] ranArr(int size, int range, int start) {
		
		int arr[] = new int[size];
		if(size >range) {
			System.out.println("�迭�� ũ�Ⱑ �߻��ϴ� ������ ������ Ŭ �� ����.");
		return null;
		}
		
		
		/**2��for�� 1���� �迭�� ��������, �ߺ��˻�, ���� ¦��, �Ĺ� Ȧ��, �������� �����ϱ�.
		break�� �������� �κ� ����������.*/
		for(int i = 0 ; i<arr.length;i++) {
			arr[i] = (int) (Math.random() * range + start);
			for(int j=0;j<i;j++) {
				if (arr[i] == arr[j]) {
					i--;
					break; //�ߺ��� ��� break�� for���� �������´�.
				}else if((arr[i]%2!=0 && arr[j]%2!=0&& arr[j]<arr[i])||
					(arr[i]%2==0&&arr[j]%2!=0)||
					(arr[i]%2==0&& arr[j]%2==0&& arr[j]<arr[i])){
					
					int tmp= arr[i];
					arr[i]=arr[j];
					arr[j]=tmp;
				}
				/**���� 1. �� �����(i,�Ĺ�)�� �񱳴����(j,����) Ȧ���鼭 �� ����ڰ� �� ����ں��� ũ��
				���� 2. �� ����ڰ� ¦���̰�, �� ����ڰ� Ȧ����
				���� 3. �� ����ڿ� �񱳴���ڰ� ¦���Ӱ� ���ÿ� �� ����ڰ� �� ����ں��� ũ��
				3���� ���� �� �ϳ��� �ش�� �� ��ȯ��.
				���� 2�� ���� ���� ¦��, �Ĺ� Ȧ���� �����.
				���� 1�� 3�� ���� �� ���� ������ ���� �Ѵ�.*/
			}
			
		}
		
		for(int i=0; i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
		return arr;
	}

	public static void main(String[] args) {
		
		int arr[] = ranArr(10, 20, 1);

	}

}
