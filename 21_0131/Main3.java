import java.util.Scanner;

/*
 * 정수 2개를 전달 받아 둘 중 더 큰 수를 반환하는 메소드.
 */

public class Main3 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int x;
        int y;

        System.out.println("숫자 2개를 입력해주세요.");
        x = input.nextInt();
        y = input.nextInt();
        input.close();

        System.out.println("두 수 중 큰 수는 " + whichOneBig(x, y) + " 입니다.");
    }
    
    public static int whichOneBig(int x, int y) {

        int bigNumber = x;
        if (bigNumber < y) {
            bigNumber = y;
        }
        return bigNumber;
    }
}
