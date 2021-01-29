/*
반복해서 정수를 입력받습니다.
입력한 정수가 100보다 크면 종료하세요.
*/

import java.util.Scanner;

public class While7 {
	
	public static void main(String[] args){
		
		int number;
		boolean isConditue = true;
		
		System.out.println("반복해서 정수를 입력받습니다.");
		System.out.println("입력한 정수가 100보다 크면 종료합니다.");
		
		System.out.println("정수를 입력하세요.");
		while(isConditue){
			System.out.print(" >> ");
			number = new Scanner(System.in).nextInt();
			if(number > 100){
				isConditue = false;
			}
		}
	}
}