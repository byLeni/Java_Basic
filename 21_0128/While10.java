import java.util.*;

public class While10{
	
	public static void main(String[] args){
		
		Random random = new Random();
		Scanner input = new Scanner(System.in);
		
		int num;
		int count = 0;
		
		int answer = random.nextInt(101);
		
		System.out.println("숫자를 맞춰보세요! 내가 생각한 숫자는 뭘까요?");
		
		do {
			System.out.print("정답은?? ");
			num = input.nextInt();
			
			if(num < answer){
				System.out.println(">> 땡! 제시한 정수가 낮습니다.\n");
			}
			else if(num > answer){
				System.out.println(">> 땡! 제시한 정수가 큽니다.\n");
			}
			
			count++;			
		} while(num != answer);	
		
		System.out.println();
		System.out.println("정답입니다!");
		System.out.println("도전 횟수는 "+count+"번 입니다.");
	}
}