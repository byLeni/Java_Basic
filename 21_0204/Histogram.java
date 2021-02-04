import java.util.Scanner;

public class Histogram {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        final int LOOP_COUNT = 10;

        int[] numCount = new int[10];

        System.out.printf("숫자 %d개를 입력해주세요!\n", LOOP_COUNT);
        
        int num;
        int remainder;
        for (int i = 0; i < LOOP_COUNT; i++) {
            System.out.print(" ▷ ");
            num = input.nextInt() - 1;

            if (0 <= num && num <= 100) {
                remainder = num / 10;
                numCount[remainder]++;
            }
        }
        
        System.out.println();
        for (int i = 0; i < numCount.length; i++) {
            System.out.printf("%3d - %3d: ", i * 10 + 1, (i + 1) * 10);
            for (int j = 0; j < numCount[i]; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
