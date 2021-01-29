/*
1 ~ 100 정수 중에서,
1의 자리가 3, 6, 9인 정수만 출력하세요.
ex) 3 6 9 13 16 19 ...
*/

public class While5 {
	
	public static void main(String[] args){
		
		final int DEAD_LINE = 100;
		
		int i = 3;
		
		while(i <= DEAD_LINE){
			
			int remainder = i % 10;
			if(remainder == 3 || remainder == 6 || remainder == 9){
				System.out.print(i + " ");
			}
			i++;
		}
		
		System.out.println();
	}
}