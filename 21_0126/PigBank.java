import java.util.Scanner;

public class PigBank {

/*
102p 6번 저금통
*/
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int coin, total = 0;

        System.out.print("저금통 속 500원 의 갯수는? ");
        coin = input.nextInt();
        total += coin * 500;

        System.out.print("저금통 속 100원 의 갯수는? ");
        coin = input.nextInt();
        total += coin * 100;

        System.out.print("저금통 속 50원 의 갯수는? ");
        coin = input.nextInt();
        total += coin * 50;

        System.out.print("저금통 속 10원 의 갯수는? ");
        coin = input.nextInt();
        total += coin * 10;

        System.out.println("저금통 속에는 " + total + "원이 있습니다.");        
    }
}
