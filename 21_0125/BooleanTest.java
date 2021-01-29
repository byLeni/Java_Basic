import java.util.Scanner;

/*
사용자에게 중량을 물어봅니다. 정수값으로
1. 벤치프레스
2. 데드리프트
3. 스쿼트
3개의 값을 입력받습니다.
총합이 500kg이상이면 true를 출력합니다.
*/

public class BooleanTest {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
		
        int bench, dead, squat;
		
        System.out.println("아래 3가지의 중량을 입력해주세요.");
        System.out.print("벤치프레스: ");
        bench = input.nextInt();
        System.out.print("데드리프트: ");
        dead = input.nextInt();
        System.out.print("스쿼트: ");
        squat = input.nextInt();

        int sum = bench + dead + squat;
        System.out.printf("\n총합 : %d\n\n", sum);
        if (sum >= 500) {
            System.out.println("wow~ 언더아머 추천!");
        }
        else {
            System.out.println(":q 노력!");
        }
        
    }
}
