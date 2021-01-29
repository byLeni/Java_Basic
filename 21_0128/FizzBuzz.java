/*
1 ~ 100까지의 수를 출력.
3의 배수는 Fizz
5의 배수는 Buzz
3의 배수이면서 5의 배수는 Fizz Buzz

예시) 1 2 Fizz 4 Buzz Fizz 7 8 Fizz Buzz 11 Fizz 13 14 Fizz Buzz 16 ... 
*/

public class FizzBuzz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		final int DEAD_LIEN = 100;
		
		int i = 1;
		boolean isPrint = true;
		
		while(i < DEAD_LIEN) {
			
			if(i%3!=0 && i%5!=0) {
				System.out.print(i+" ");				
			}
			else {
				if(i%3==0) {
					System.out.print("Fizz ");
				}
				if(i%5==0) {
					System.out.print("Fuzz ");
				}
			}
			i++;	
		}
		
		System.out.println();
	}
}
