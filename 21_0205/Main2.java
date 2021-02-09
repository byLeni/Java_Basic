import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        final String[] SUBJECT_NAME = { "국어", "영어", "수학" };
        final int SUBJECT_SUM = 3;
        final int SUBJECT_COUNT = 3;

        int[][] students = new int[4][4];

        int score = 0;
        for (int i = 0; i < students.length - 1; i++) {
            int index = 0;
            while (index < SUBJECT_COUNT) {
                System.out.printf("%d번 학생의 %s 성적을 입력하세요 ▷ ", i + 1, SUBJECT_NAME[index]);
                score = input.nextInt();
                if (score < 0 || 100 < score) {
                    System.out.println("성적을 잘못 입력했습니다. 다시 입력해주세요!");
                } else {
                    students[i][index] = score;
                    students[i][SUBJECT_SUM] += score;
                    students[SUBJECT_SUM][index] += score;
                    index++;
                }
            }
            System.out.println();
            double avg = (double) students[i][SUBJECT_SUM] / SUBJECT_COUNT;
            System.out.printf("%d번 학생의 평균 점수: %.1f\n", i + 1, avg);
            System.out.println();
        }
        
        for (int i = 0; i < SUBJECT_COUNT; i++) {
            double avg = (double) students[SUBJECT_SUM][i] / SUBJECT_COUNT;
            System.out.printf("%s 과목의 평균은 %.1f 입니다.\n", SUBJECT_NAME[i], avg);
       }
    }
}
