/*
사용자가 정수를 반복해서 입력합니다.
0을 입력하면 반복문이 종료됩니다.
그 동안 입력받은 정수의 갯수를 출력해보세요.

예시)
10
20
30
0
종료: 총 4개를 입력하셨습니다.
*/

import java.util.Scanner;

public class While8 {
	
	public static void main(String[] args) {
		
		// anotherWay(args);
		
		Scanner input = new Scanner(System.in);
		
		// int number = 1;
		int count = 1;
		
		System.out.println("반복해서 정수를 입력받습니다.");
		System.out.println("입력한 정수가 0이면 종료합니다.");
		
		System.out.println("정수를 입력하세요.");
		
		System.out.print(" >> ");
		while(input.nextInt() != 0){
			count++;
			System.out.print(" >> ");
			// number = input.nextInt();
		}
		
		System.out.println("현재까지 입력한 정수의 갯수는 "+count+"개 입니다.");
	}

	static void anotherWay(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		boolean isContinue = true;
		
		int number;
		int count = 0;
		
		System.out.println("반복해서 정수를 입력받습니다.");
		System.out.println("입력한 정수가 0이면 종료합니다.");
		
		System.out.println("정수를 입력하세요.");
		while(isContinue){
			System.out.print(" >> ");
			number = input.nextInt();
			
			if (number == 0) {
				isContinue = false;
			}
			else {
				count++;				
			}
		}
		
		System.out.println("현재까지 입력한 정수의 갯수는 "+count+"개 입니다.");
	}
}