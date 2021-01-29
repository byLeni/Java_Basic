import java.util.Scanner;

/*
사용자가 5자리의 정수를 입력합니다.
뒤집어서 출력해보세요.
ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
입력 예) 12345
출력 예) 54321
*/

public class ReverseNumber {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number : ");
        int num = input.nextInt();

        if (9999 < num && num < 100000) {
            System.out.print("Upside Down number : " + num % 10);
            num = num / 10;
            System.out.print(num % 10);
            num = num / 10;
            System.out.print(num % 10);
            num = num / 10;
            System.out.print(num % 10);
            num = num / 10;
            System.out.println(num % 10);
        }
        else
            System.out.println("Please Enter the number inside 9999 ~ 100000");
    }
}
