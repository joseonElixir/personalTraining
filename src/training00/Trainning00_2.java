package training00;

public class Trainning00_2 {

	public static int[] ranArr(int size, int range, int start) {
		
		int arr[] = new int[size];
		if(size >range) {
			System.out.println("배열의 크기가 발생하는 난수의 값보다 클 수 없다.");
		return null;
		}
		
		
		//2중for문 1개로 배열에 난수생성, 중복검사, 전방 짝수, 후방 홀수, 내림차순 정렬하기.
		//break로 쓸데없는 부분 빠져나오기.
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
