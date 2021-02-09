import java.util.Scanner;

class Circle {

    private double radius;
    private Point center;

    public Circle(double radius, int x, int y) {
        this.radius = radius;
        this.center = new Point(x, y);
    }

    public Point getCenter() {
        return this.center;
    }

    public double getScope() {
        return this.radius * this.radius * Math.PI;
    }

    public double getCircumference() {
        return 2 * Math.PI * this.radius;
    }
}

class Point {

    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }
}

public class Main {
    
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int radius;
        int x;
        int y;

        System.out.println("원의 넓이와 둘레를 출력합니다.");
        System.out.print("반지름을 입력해 주세요: ");
        radius = input.nextInt();

        System.out.print("원의 중심 좌표 x를 입력해 주세요: ");
        x = input.nextInt();

        System.out.print("원의 중심 좌표 y를 입력해 주세요: ");
        y = input.nextInt();

        Circle c1 = new Circle(radius, x, y);

        System.out.println();
        System.out.printf("원의 넓이: %.2f%n", c1.getScope());
        System.out.printf("원의 둘레: %.2f%n", c1.getCircumference());
        System.out.printf("원의 중심 좌표: (%d, %d)%n", c1.getCenter().getX(), c1.getCenter().getY());

        input.close();
    }
}
