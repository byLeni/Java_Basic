/*
 * 1. 10부터 20까지 출력해보세요.
 * 2. 10부터 0까지 역순으로 출력해보세요.
 * 3. 0부터 50까지 7의 배수만 출력해보세요.
 * 4. 0부터 50까지의 7의 배수의 개수를 세어 출력해보세요.
 * 5. 사용자에게 입력받은 수만큼만 Hello라고 출력해보세요.
 * 6. 0부터 50가지의 합을 구해보세요.
 * 7. 사용자에게 입력받은 단수의 구구단을 출력해보세요.
 * 8. 사용자에게 입력받은 수의 제곱수들을 5개 출력해보세요.
 * 		입력예) 3 -> 출력예) 3 9 27 81 243
 */

import java.util.Scanner;

public class LoopPractice {
    public static void main(String[] args) {

        System.out.println("1. 10부터 20까지 출력합니다.\n");
        for (int i = 10; i < 21; i++) {
            System.out.print(i + " ");
        }

        System.out.println("\n\n\nㅡ ㅡ ㅡ ㅡ ㅡ ㅡ ㅡ ㅡ ㅡ ㅡ ㅡ ㅡ ㅡ ㅡ ㅡ ㅡ ㅡ ㅡ ㅡ ㅡ ㅡ ㅡ ㅡ ㅡ");
        System.out.println("2. 10부터 0까지 역순으로 출력합니다.\n");
        for (int i = 10; i >= 0; i--) {
            System.out.print(i + " ");
        }
        
        System.out.println("\n\n\nㅡ ㅡ ㅡ ㅡ ㅡ ㅡ ㅡ ㅡ ㅡ ㅡ ㅡ ㅡ ㅡ ㅡ ㅡ ㅡ ㅡ ㅡ ㅡ ㅡ ㅡ ㅡ ㅡ ㅡ");
        System.out.println("3. 0부터 50 사이의 7의 배수를 출력합니다.\n");
        int count = 0;
        for (int i = 7; i <= 50; i +=7) {
            System.out.print(i + " ");
            count++;
        }

        System.out.println("\n\n\nㅡ ㅡ ㅡ ㅡ ㅡ ㅡ ㅡ ㅡ ㅡ ㅡ ㅡ ㅡ ㅡ ㅡ ㅡ ㅡ ㅡ ㅡ ㅡ ㅡ ㅡ ㅡ ㅡ ㅡ");
        System.out.println("4. 0부터 50 사이의 7의 배수의 갯수입니다.\n");
        System.out.print(count);

        System.out.println("\n\n\nㅡ ㅡ ㅡ ㅡ ㅡ ㅡ ㅡ ㅡ ㅡ ㅡ ㅡ ㅡ ㅡ ㅡ ㅡ ㅡ ㅡ ㅡ ㅡ ㅡ ㅡ ㅡ ㅡ ㅡ");
        System.out.println("5. 사용자가 원하는 수만큼 Hello라고 출력합니다.\n");
        int wordCount = new Scanner(System.in).nextInt();
        for (int i = 0; i < wordCount; i++) {
            System.out.print("Hello ");
        }

        System.out.println("\n\n\nㅡ ㅡ ㅡ ㅡ ㅡ ㅡ ㅡ ㅡ ㅡ ㅡ ㅡ ㅡ ㅡ ㅡ ㅡ ㅡ ㅡ ㅡ ㅡ ㅡ ㅡ ㅡ ㅡ ㅡ");
        System.out.println("6. 0부터 40가지의 합을 구합니다.\n");
        int sum = 0;
        for (int i = 0; i < 40; i++) {
            sum += i;
        }
        System.out.print(sum);

        System.out.println("\n\n\nㅡ ㅡ ㅡ ㅡ ㅡ ㅡ ㅡ ㅡ ㅡ ㅡ ㅡ ㅡ ㅡ ㅡ ㅡ ㅡ ㅡ ㅡ ㅡ ㅡ ㅡ ㅡ ㅡ ㅡ");
        System.out.println("7. 사용자가 원하는 단수의 구구단을 출력합니다.\n");
        int dan = new Scanner(System.in).nextInt();
        for (int i = 1; i <= 9; i++) {
            System.out.printf("%d x %d = %d%n", dan, i, dan * i);
        }

        System.out.println("\n\n\nㅡ ㅡ ㅡ ㅡ ㅡ ㅡ ㅡ ㅡ ㅡ ㅡ ㅡ ㅡ ㅡ ㅡ ㅡ ㅡ ㅡ ㅡ ㅡ ㅡ ㅡ ㅡ ㅡ ㅡ");
        System.out.println("8. 사용자가 입력한 수의 제곱수들을 5개 출력합니다.\n");
        int pow = 1;
        int num = new Scanner(System.in).nextInt();
        for (int i = 0; i < 5; i++) {
            System.out.print(num * pow + " ");
            pow *= num;
        }

        System.out.println();
    }
}
