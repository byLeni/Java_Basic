/*
사용자가 정수 하나를 입력합니다.
입력한 정수 만큼 "JAVA"를 출력해보세요.

입력 예) 5
출력 예) JAVA JAVA JAVA JAVA JAVA
*/

import java.util.Scanner;

public class While6 {
	
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		int count;
		
		System.out.println("사용자가 입력한 숫자만큼 JAVA를 출력합니다.\n");
		
		System.out.print("몇 번 반복하시겠어요? ");
		count = input.nextInt();
		
		System.out.println();
		
		while(count != 0){
			System.out.print("JAVA ");
			count--;
		}
		
		System.out.println();
	}
}