import java.util.Scanner;

public class Student {
    
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("학생의 수를 입력하세요: ");
        int studentCount = input.nextInt();

        int index = 0;
        int sum = 0;

        int score;
        while (index < studentCount) {
            System.out.printf("학생 %d의 성적을 입력하세요: ", index + 1);
            score = input.nextInt();

            if (score < 0 || 100 < score) {
                System.out.println("잘못된 성적입니다. 다시 입력하세요.");
            } else {
                sum += score;
                index++;
            }
        }
        System.out.printf("성적 평균은 %.1f입니다.\n", (double) sum / studentCount);

        input.close();
    }
}
