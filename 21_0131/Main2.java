import java.util.Scanner;

/*
 1. 정수를 전달 받아 짝수면 true, 홀수면 false를 return 하는 메소드를 작성 
 2. 정수를 전달 받아 0 ~ 100 사이의 수이면 true, 그 이외의 수는 false를 리턴하는 메소드를 작성
 */

public class Main2 {

    public static void main(String[] args) {

        int x;

        System.out.print("정수를 입력하세요 >> ");
        x = new Scanner(System.in).nextInt();

        System.out.println("짝수 인가요? " + isEvenNumber(x));
        System.out.println("0 ~ 100 사이에 존재하나요? " + isIn(x));
    }
    
    public static boolean isEvenNumber(int x) {

        boolean result = false;
        if (x % 2 == 0) {
            result = true;
        }
        return result;
        /*
        조건문을 안 적고 그냥 바로 아래와 같이 해도 된다.
        어쨋던 조건문 연산 후 boolean이 나오니까!
        
        return x % 2 == 0;
        
        흠.. 그래도 가독성엔 따로 적어주는게 좋은 것 같다.
        */
    }

    public static boolean isIn(int x) {

        boolean result = false;
        if (0 <= x && x <= 100) {
            result = true;
        }
        return result;
    }
}
