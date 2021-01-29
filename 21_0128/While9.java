/*
사용자가 n, m 두개의 정수를 입력합니다.
n의 m제곱수를 구해보세요.

입력) 2 7
출력) 128
*/

import java.util.*;

public class While9 {
	
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		int n;
		int m;
		int result = 1;
		
		System.out.println("n의 m제곱수를 구합니다.");
		System.out.println("n과 m값을 차례대로 입력해주세요.");
		System.out.println("예시) 2 7");
		System.out.print(" >> ");
		n = input.nextInt();
		m = input.nextInt();
		
		System.out.printf("%d의 %d제곱수는 ", n, m);
		while(m != 0){
			result *= n;
			m--;
		}		
		
		System.out.printf("%d입니다.\n", result);
	}
}
