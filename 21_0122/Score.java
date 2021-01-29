import java.util.Scanner;

public class Score {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int kScore, mScore, eScore;

        System.out.print("Korean Score : ");
        kScore = input.nextInt();
        System.out.print("Math Score: ");
        mScore = input.nextInt();
        System.out.print("English Score: ");
        eScore = input.nextInt();

        System.out.println();

        int total = kScore + mScore + eScore;
        double avg = total / 3.0;
        System.out.println("Your Total is \"" + total + "\"");
        System.out.println("Your average is \"" + avg + "\"");
        
        input.close();
    }
}
