import java.util.Scanner;

public class Time {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter sec : ");
        int sec = input.nextInt();

        int hour = sec / 3600;
        int minute = sec % 3600 / 60;
        sec = sec % 60;

        System.out.printf("%d hour %d minutes %d sec\n", hour, minute, sec);
    }
}
