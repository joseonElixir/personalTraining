package training00;

public class Trainning00_1 {

	public static int[] backass(int size,int range, int start) {
		// 번호를 중복검사 앞열 짝수 뒷열 홀수 내림차순
		
		
		if(size >range) {
			System.out.println("배열의 크기가 발생하는 난수의 값보다 클 수 없다.");
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
				if ((lot[i] % 2 == 0 && lot[j] % 2 == 0 && lot[i] < lot[j])||
					(lot[i]%2!= 0 && lot[j]%2 == 0)||
					(lot[i] % 2 != 0 && lot[j] % 2 != 0 && lot[i] < lot[j])) {
					
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

		int num[] = backass(20,20,1);//배열의 사이즈, 배열에 입력되는 난수의 범위, 난수의 시작값을 인자로 입력.
									//이때 난수의 범위가 배열의 사이즈보다 커야함.
									//리턴값이 없으면 반환되는 정보가 없기 때문에
		//int num[] = null이 되어버림.
		

	}

}
