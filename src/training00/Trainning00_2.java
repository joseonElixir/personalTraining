package training00;

public class Trainning00_2 {

	public static int[] ranArr(int size, int range, int start) {
		
		int arr[] = new int[size];
		if(size >range) {
			System.out.println("배열의 크기가 발생하는 난수의 값보다 클 수 없다.");
		return null;
		}
		
		
		/**2중for문 1개로 배열에 난수생성, 중복검사, 전방 짝수, 후방 홀수, 내림차순 정렬하기.
		break로 쓸데없는 부분 빠져나오기.*/
		for(int i = 0 ; i<arr.length;i++) {
			arr[i] = (int) (Math.random() * range + start);
			for(int j=0;j<i;j++) {
				if (arr[i] == arr[j]) {
					i--;
					break; //중복일 경우 break로 for문을 빠져나온다.
				}else if((arr[i]%2!=0 && arr[j]%2!=0&& arr[j]<arr[i])||
					(arr[i]%2==0&&arr[j]%2!=0)||
					(arr[i]%2==0&& arr[j]%2==0&& arr[j]<arr[i])){
					
					int tmp= arr[i];
					arr[i]=arr[j];
					arr[j]=tmp;
				}
				/**조건 1. 주 대상자(i,후방)와 비교대상자(j,전방) 홀수면서 주 대상자가 비교 대상자보다 크면
				조건 2. 주 대상자가 짝수이고, 비교 대상자가 홀수면
				조건 3. 주 대상자와 비교대상자가 짝수임과 동시에 주 대상자가 비교 대상자보다 크면
				3가지 조건 중 하나라도 해당될 때 교환함.
				조건 2를 통해 전방 짝수, 후방 홀수를 만든다.
				조건 1과 3을 통해 각 수의 집합을 정렬 한다.*/
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
