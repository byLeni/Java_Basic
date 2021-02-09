package school;

import java.util.Scanner;

public class Main {
    
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        int classCount;
        StudentClass[] sClass;
        
        System.out.println("This is Leni School, Welcome!");

        System.out.print("학급 수를 입력하세요: ");
        classCount = input.nextInt();
        sClass = new StudentClass[classCount];
        for (int i = 0; i < classCount; i++) {
            sClass[i] = new StudentClass();
            setClass(sClass[i]);
        }

        System.out.println();
        System.out.println("학생들의 이름 목록을 출력합니다.");
        for (StudentClass c1 : sClass) {
            System.out.printf("--- %s반 아이들 -----------------\n", c1.getName());
            for (Student s : c1.getStudents()) {
                System.out.print(s.getName() + " ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("학생들의 평균을 출력합니다.");
        System.out.println("점수는 (국, 수, 영 :: 평균)으로 표시됩니다!");
        for (StudentClass c1 : sClass) {
            System.out.printf("--- %s반 아이들 -----------------\n", c1.getName());
            for (Student s : c1.getStudents()) {
                System.out.printf("- %s의 성적 (%d, %d, %d :: %.2f)\n", s.getName(), s.getKorScore(), s.getMatScore(),
                        s.getEngScore(), s.getAvg());
            }
            System.out.printf("▷ %s반의 각 과목 평균\n", c1.getName());
            System.out.printf("- 국어: %.2f\n", c1.classKorAVG());
            System.out.printf("- 수학: %.2f\n", c1.classMatAVG());
            System.out.printf("- 영어: %.2f\n", c1.classEngAVG());
            System.out.println();
        }
    }

    private static void setClass(StudentClass c1) {
        input.nextLine();
        System.out.println();
        System.out.print("학급이름을 설정해주세요; ");
        String name = input.nextLine();
        c1.setName(name);

        System.out.printf("%s반의 학생인원을 입력해주세요: ", name);
        int studnetCount = input.nextInt();
        for (int i = 0; i < studnetCount; i++) {
            input.nextLine();
            System.out.println();
            System.out.printf("%d번째 학생 정보를 입력합니다.\n", i + 1);
            System.out.print("학생 이름: ");
            String studentName = input.nextLine();
            System.out.printf("%s의 국어 성적: ", studentName);
            int korScore = input.nextInt();
            System.out.printf("%s의 수학 성적: ", studentName);
            int matScore = input.nextInt();
            System.out.printf("%s의 영어 성적: ", studentName);
            int engScore = input.nextInt();

            c1.addStudent(studentName, korScore, matScore, engScore);
        }
    }
    
}
