import java.util.Scanner;

public class CmToFeet {

    /*
    p101 3번.
    */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int height;

        System.out.print("키를 입력하세요: ");
        height = input.nextInt();

        System.out.printf("%dcm는 %d피트 %f인치입니다.\n", height, (int)(height * 0.03280841666667), height * 0.393701);
    }
}
