package training00;

public class Training00 {

	public static int[] backass() {
		// ��ȣ�� �ߺ��˻� �տ� ¦�� �޿� Ȧ�� ��������
		int lot[] = new int[20];
		for (int i = 0; i < lot.length; i++) {
			lot[i] = (int) (Math.random() * 40 + 1);
			for (int j = 0; j < i; j++) {
				if (lot[i] == lot[j]) {
					i--;
				}
			}
		}

		for (int i = 0; i < lot.length - 1; i++) {

			for (int j = i; j < lot.length; j++) {
				int tmp = 0;
				if ((lot[i] % 2 == 0 && lot[j] % 2 == 0) && lot[i] < lot[j]) {
					//¦���� �켱 ã�°� ��ǥ.
					//�� ����ڰ� ¦���϶� 
					tmp = lot[i];
					lot[i] = lot[j];
					lot[j] = tmp;
				}
				if (lot[i]%2!= 0 && lot[j]%2 == 0) {
					tmp = lot[i];
					lot[i] = lot[j];
					lot[j] = tmp;
					i--;
					break;
				} else if ((lot[i] % 2 != 0 && lot[j] % 2 != 0) && lot[i] < lot[j]) {
					tmp = lot[i];
					lot[i] = lot[j];
					lot[j] = tmp;
				} 

			}
		}

		return lot;
	}

	public static void main(String[] args) {

		int lot[] = backass();

		for (int i = 0; i < lot.length; i++) {
			System.out.println(lot[i]);
		}

	}

}
