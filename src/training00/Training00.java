package training00;

public class Training00 {

	public static int[] backass(int size,int range, int start) {
		// ��ȣ�� �ߺ��˻� �տ� ¦�� �޿� Ȧ�� ��������
		
		
		if(size >range) {
			System.out.println("�迭�� ũ�Ⱑ �߻��ϴ� ������ ������ Ŭ �� ����.");
		return null;
		}
		int lot[] = new int[size];
		for (int i = 0; i < lot.length; i++) {
			lot[i] = (int) (Math.random() * range + start);
			for (int j = 0; j < i; j++) {
				if (lot[i] == lot[j]) {
					i--;
					
				}
			}
		}
	
		for (int i = 0; i < lot.length - 1; i++) {

			for (int j = i; j < lot.length; j++) {
				int tmp = 0;
				if (lot[i] % 2 == 0 && lot[j] % 2 == 0 && lot[i] < lot[j]) {
					//¦���� �켱 ã�°� ��ǥ.
					//�� ����ڿ� �� ����ڰ� ¦���϶� ũ�⸦ ���ؼ� ū ���� ����.
					tmp = lot[i];
					lot[i] = lot[j];
					lot[j] = tmp;
				}else if (lot[i]%2!= 0 && lot[j]%2 == 0) {
					//¦���� �տ��� ��ġ�ϴ°� ��ǥ.
					//�� ����ڰ� Ȧ���� ��, �� ����� �߿��� ¦���� ã�Ƽ� ����
					//���� i--�� break�� �Ѵ�.
					//�̷��� �ϸ� Ȧ������ lot[i]�� ¦���� �ٲ��,
					//i-- �� �� ��� for���� �������ͼ�
					//�ٽ� �ش� ���� �� ����� for������ ���� �� �ֱ� ������
					//¦�� ���� ���� ������ ������ �� �ִ�.
					tmp = lot[i];
					lot[i] = lot[j];
					lot[j] = tmp;
					i--;
					break;
				} else if ((lot[i] % 2 != 0 && lot[j] % 2 != 0) && lot[i] < lot[j]) {
					//¦�� ���� ���� ������ ������ �ڿ� Ȧ������ ������ �Ǹ� 
					//�� ����ڿ� ¦���� ���ٴ°� �ȴ�.
					//�߰��� Ȧ������ �ǹ̾��� ������ �������� 
					//�ᱹ���� ¦���� ������ �Ǿ� i�� ¦���� �Ǿ� �����Ŀ� ���� ������
					//�̿��� ���ٸ� ������ ���� �ʾƵ� �Ĺ��� Ȧ�� ������ �� �� �ִ�.
					
					tmp = lot[i];
					lot[i] = lot[j];
					lot[j] = tmp;
				} 

			}
		}
		
		for (int i = 0; i < lot.length; i++) {
			System.out.println(lot[i]);
		}

		return lot;
	}

	public static void main(String[] args) {

		int num[] = backass(20,20,1);//�迭�� ������, �迭�� �ԷµǴ� ������ ����, ������ ���۰��� ���ڷ� �Է�.
									//�̶� ������ ������ �迭�� ������� Ŀ����.
									//���ϰ��� ������ ��ȯ�Ǵ� ������ ���� ������
		//int num[] = null�� �Ǿ����.
		

	}

}
