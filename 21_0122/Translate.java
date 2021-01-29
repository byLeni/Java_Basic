import java.util.Scanner;

public class Translate {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final double kilo = 1.609;

        System.out.print("Enter miles : ");
        int miles = input.nextInt();
        System.out.printf("%d miles is %.2f kilometers\n", miles, miles * kilo);
		
		input.close();
    }
}
