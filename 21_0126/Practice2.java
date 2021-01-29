import java.util.Scanner;

public class Practice2 {

/*
 * 사용자가 정수 3개를 입력합니다.
 * 3개의 정수가 순서대로 입력되었다면 true
 * (2번째가 수가 1번째 수보다 1크고, 3번째수가 2번째수보다 1클때)
 * (1,2,3) -> true
 * (4,5,6) -> true
 * (7,5,3) -> false
 */
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int x, y, z;

        System.out.println("정수 3개를 입력합니다.");
        System.out.print("첫번째 정수: ");
        x = input.nextInt();
        System.out.print("두번째 정수: ");
        y = input.nextInt();
        System.out.print("세번째 정수: ");
        z = input.nextInt();

        Boolean order = x == y - 1 && y + 1 == z;
        Boolean reverse = x == y + 1 && y - 1 == z;

        if (order || reverse) {
            System.out.println("세 수는 연속합니다.");
        } 
        else {
            System.out.println("세 수는 연속하지 않습니다.");
        }
    }
}
