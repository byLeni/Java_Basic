import java.util.*;

public class WeightScale {
    public static void main(String[] args) {
        
        double height;
        double weight;

        double standWeight;

        System.out.println("표준 체중을 계산합니다.");
        System.out.print("당신의 키는? (단위: cm) ");
        height = new Scanner(System.in).nextDouble();
        System.out.print("당신의 몸무게는? (단위: kg) ");
        weight = new Scanner(System.in).nextDouble();

        System.out.println("------------------------------");
        standWeight = (height - 100) * 0.9;
        System.out.println("표준체중: " + standWeight);

        int remainder = (int)(weight - standWeight);
        if (10 < remainder){
            System.out.println("과체중입니다.");
        } else if (-10 > remainder) {
            System.out.println("저체중입니다.");
        } else {
            System.out.println("표준입니다!");
        }

    }
}