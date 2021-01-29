import java.util.Scanner;

/*
사용자가 정수를 하나 입력합니다.
1. 입력한 정수가 양수라면 true라고 출력해보세요. 0이거나 음수일 땐 false.
2. 입력한 정수가 22면 true.
3. 입력한 정수가 짝수라면 true.
*/

public class BooleanTest {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("숫자를 입력하세요: ");
        int num = input.nextInt();
        q1(num);
        q2(num);
        q3(num);
    }
    
    public static void q1(int num) {
        if (0 < num) {
            System.out.println(is + " 양수입니다.");
        } else {
            System.out.println(is + " 음수이거나 0입니다.");
        }
    }
    
    public static void q2(int num) {
        if (num == 22) {
            System.out.println("True 22입니다.");
        } else {
            System.out.println("False 22가 아닙니다.");
        }
    }

    public static void q3(int num) {
        if (num % 2 == 0) {
            System.out.println(is + " 짝수입니다.");
        } else {
            System.out.println(is + " 홀수입니다.");
        }
    }
}
