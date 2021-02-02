import java.util.Scanner;

/*
1. 3개의 정수를 전달 받아 합을 구해서 정수 형태로 return하는 메소드 작성
2, 3개의 정수를 전달 받아 평균을 구해서 정수 형태로 return하는 메소드를 작성
*/
public class SumAvg {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int x;
        int y;
        int z;

        System.out.println("3개의 정수를 입력해주세요!");
        x = input.nextInt();
        y = input.nextInt();
        z = input.nextInt();
        input.close();

        System.out.println("3개 정수의 합: " + plusNumber(x, y, z));
        System.out.println("3개 정수의 평균: "+avgNumber(x, y, z));
    }
    
    public static int plusNumber(int x, int y, int z) {
        return x + y + z;
    }

    public static int avgNumber(int x, int y, int z) {
        return (x + y + z) / 3;
    }
}
