import java.util.Scanner;

public class Sum {

    public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		// Scanner 객체 생성

		int number, total = 0;
		/* 
		- 숫자를 입력 받을 number 변수 선언!
		만약에 5개 숫자를 뒤에 사용한다고 하면 따로 기억을 해야겠지만
		문제에서 5개의 숫자를 총 합을 구하는데에만 사용함으로 숫자를 입력받는
		변수 number 1개만 사용합니다.
		
		- 총 합을 저장할 total 변수를 선언 및 초기화!
		*/ 

		System.out.println("입력한 정수가 양수이고, 3 또는 5의 배수인 경우 더합니다.");
		System.out.println("총 5개의 숫자를 입력합니다.\n");
		// 14~15행 출력문!
		

		/*
		같은 동작을 반복함으로 반복문에 넣었습니다.
		내일 배운다고합니다!
		
		★ for문 사용방법
		for (자료형 변수명 = 값; 반복문 조건; 연산식){
			반복할 내용
		}
		>> 해당 변수가 반복문 조건에 부합하는 동안 반복되며 한 번 반복할 때마다 연산식을 한 번 수행합니다.
		
		★ 제 코드 상의 for문 동작을 해석하자면,
		int형 변수 i를 1로 선언 및 초기화 하고
		변수 i 가 6보다 작은 경우 반복문을 동작시킵니다.
		i는 반복문이 1번 실행되고 나면(반복문 코드 끝에 도착하고 나면)값이 1 증가(i++)됩니다.
		*/		
		for (int i = 1; i < 6; i++) {
			System.out.printf("%d 번째 숫자는?  ", i);
			// 출력문 ㅎ--ㅎ
			number = input.nextInt();
			// Int형을 입력받아서 number에 넣기!
			if (number > 0 && (number % 3 == 0 || number % 5 == 0)) {
				// 으... 연산자 투성이... 왼쪽부터 해석해봅니다.
				/*
				number가 0보다 크고,
				3으로 나눴을 때 나머지가 0이거나 5로 나눴을 때 나머지가 0이면
				>> True
				
				number % 3 == 0 || number % 5 == 0 요 부분에 괄호가 되어있기 때문에
				이 부분의 참/거짓을 먼저 계산하여 알려준 뒤,
				number > 0 이 아이와 논리연산(True 인지 False인지를 구하는 계산)을 합니다.
				*/
				total += number;
				// 참일 때 실행되는 number 변수 값을 total에 저장시키기!
			}
		}

		System.out.println();
		// 개행 개행
		System.out.printf("총 합은 %d입니다.\n", total);
		// 출력문입니당 ㅎ-ㅎ
		System.out.println();
		// 개행 개행
    }
}
