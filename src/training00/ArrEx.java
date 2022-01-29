package training00;

public class ArrEx {

	public static void main(String[] args) {
		
		int jackpot777[] = new int [6];// [] : 배열의 크기
		
		
		for (int i=0;i<jackpot777.length;i++) {
			
			jackpot777[i] = (int)(Math.random()*45+1);
			
			for(int j=0;j<i;j++) {
				if(jackpot777[i]==jackpot777[j]) {
					i--;
				}
			}
		}
		for(int i =0;i<jackpot777.length;i++) {
			
			for(int j=0;j<i;j++) {
				if(jackpot777[i]<jackpot777[j]) {
					int luck = jackpot777[i];
					jackpot777[i]=jackpot777[j];
					jackpot777[j]= luck;
				}
			}
		}
		
		for(int i =0;i<jackpot777.length;i++) {
			System.out.println(jackpot777[i]);
		}
		
		
	}
	
}
