import java.util.Random;
import java.util.Scanner;

/*
 * 1. 사용자가 입력한 정수만큼의 길이를 가지는 배열을 생성.
 * 2. 사용자가 입력한 길이만큼 반복하여. 원소값을 대입연산 해보세요.
 */

public class Main4 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("배열의 길이를 입력해주세요 ▷ ");
        int length = input.nextInt();
        int[] arr = new int[length];

        input.close();

        System.out.print("원소 값을 출력합니다 ▷ ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new Random().nextInt(9) + 1;
            System.out.print(arr[i] + " ");
        }

        System.out.println();
    }
}
