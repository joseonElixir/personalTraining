package training00;

public class Training00 {

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
				if (lot[i] % 2 == 0 && lot[j] % 2 == 0 && lot[i] < lot[j]) {
					//짝수를 우선 찾는게 목표.
					//주 대상자와 비교 대상자가 짝수일때 크기를 비교해서 큰 쪽을 스왑.
					tmp = lot[i];
					lot[i] = lot[j];
					lot[j] = tmp;
				}else if (lot[i]%2!= 0 && lot[j]%2 == 0) {
					//짝수를 앞열에 배치하는게 목표.
					//주 대상자가 홀수일 때, 비교 대상자 중에서 짝수를 찾아서 스왑
					//그후 i--와 break를 한다.
					//이렇게 하면 홀수였던 lot[i]가 짝수로 바뀌고,
					//i-- 후 비교 대상 for문을 빠져나와서
					//다시 해당 열을 비교 대상자 for문으로 돌릴 수 있기 때문에
					//짝수 선행 정렬 조건을 만족할 수 있다.
					tmp = lot[i];
					lot[i] = lot[j];
					lot[j] = tmp;
					i--;
					break;
				} else if ((lot[i] % 2 != 0 && lot[j] % 2 != 0) && lot[i] < lot[j]) {
					//짝수 선행 정렬 조건을 만족한 뒤에 홀수끼리 만나게 되면 
					//비교 대상자에 짝수가 없다는게 된다.
					//중간에 홀수끼리 의미없는 스왑이 있을지라도 
					//결국에는 짝수를 만나게 되어 i가 짝수가 되어 재정렬에 들어가기 때문에
					//이외의 별다른 조건을 주지 않아도 후방의 홀수 정렬을 할 수 있다.
					
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
