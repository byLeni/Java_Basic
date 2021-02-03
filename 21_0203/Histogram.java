import java.util.Scanner;

/**
 *  사용자가 1 ~ 5까지의 정수를 입력합니다. (5번)
 * 해당 숫자를 몇 번 입력했는지 *로 나타내시요.
 *  입력 예) 1 1 2 3 4
 *  출력 예)
 *  1 : **
 *  2 : *
 *  3 : *
 *  4 : *
 *  5 : 
 */
public class Histogram {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        String numberOne = "1: ";
        String numberTwo = "2: ";
        String numberTree = "3: ";
        String numberFour = "4: ";
        String numberFive = "5: ";

        System.out.println("숫자 5개를 입력해주세요!");
        
        int num;
        for (int i = 0; i < 5; i++) {
            System.out.print(" ▷ ");
            num = input.nextInt();

            switch (num) {
                case 1:
                    numberOne += "*";
                    break;

                case 2:
                    numberTwo += "*";
                    break;

                case 3:
                    numberTree += "*";
                    break;

                case 4:
                    numberFour += "*";
                    break;

                case 5:
                    numberFive += "*";
                    break;

                default:
                    System.out.println("숫자를 잘못 입력하셨네요 ㅠ.ㅠ");
                    break;
            }
        }

        System.out.println();
        System.out.println(numberOne);
        System.out.println(numberTwo);
        System.out.println(numberTree);
        System.out.println(numberFour);
        System.out.println(numberFive);
    }
}
