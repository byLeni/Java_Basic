import java.util.Scanner;

/*
 * 1. 사용자가 입력한 정수 값의 팩토리얼을 구하시요. 
 * 2. 피보나치 수열
 * 3. 소수 구하기
 */
public class Main4 {
    
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int x;
        int max;

        // System.out.print("팩토리얼 계산! 정수입력 >> ");
        // x = input.nextInt();
        // System.out.printf("%d! = %d\n", x, factorial(x));

        // System.out.println("");
        // System.out.printf("피보나치 수열을 출력! max 범위 값은? ");
        // max = input.nextInt();
        // fibonacci(max);

        System.out.println("\n");
        System.out.printf("소수를 출력! max 범위 값은? ");
        max = input.nextInt();
        primeNumber(max);
    }
    
    public static long factorial(int x) {

        long multi = 1;
        for (int i = 2; i <= x; i++) {
            multi *= i;
        }
        return multi;
    }

    public static void fibonacci(int max) {

        int x = 1;
        int y = 1;
        int result = 1;

        System.out.printf("%d ", x);
        while (result <= max) {
            System.out.print(result + " ");
            result = x + y;
            x = y;
            y = result;
        }
    }

    public static void primeNumber(int max) {

        boolean isPrime = true;

        for (int i = 2; i <= max; i++) {
            isPrime = true;
            for (int j = 2; j * j <= i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.print(i + " ");
            }
        }
    }
}
