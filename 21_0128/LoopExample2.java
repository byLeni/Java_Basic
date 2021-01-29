/*
구구단~~
*/

import java.util.Scanner;

public class LoopExample2 {
	
	public static void main(String[] args){
		// Scanner input = new Scanner(System.in);
		// 1회성 객체는 모아서 처리할까?? 흠.... 고민
		
		int dan;
		int count = 1;
		
		System.out.print("몇 단 출력할까요? ");
		dan = new Scanner(System.in).nextInt();
		
		while(count <= 9){
			System.out.printf("%d * %d = %d\n", dan, count, dan * count);
			count++;
		}
		
		System.out.println();		
	}
}