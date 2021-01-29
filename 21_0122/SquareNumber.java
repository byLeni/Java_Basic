import java.util.Scanner;

/*
사용자에게 정수 하나를 입력 받아, 제곱 수를 출력하세요.
ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
입력 예 1) 2 -> 4
입력 예 2) 3 -> 9
입력 예 3) 4 -> 16
*/

public class SquareNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an int number : ");
        int x = input.nextInt();
        
        System.out.println(x + " square > " + x * x);
    }
    
}
