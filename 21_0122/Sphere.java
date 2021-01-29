import java.util.Scanner;

public class Sphere {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("radis : ");
        double radius = input.nextDouble();
        double volume = 4.0 / 3 * radius * radius * radius;
        System.out.println("volume : " + volume);
        
        input.close();
    }
}
