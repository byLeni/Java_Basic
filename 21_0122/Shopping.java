import java.util.Scanner;

/*
지불 금액, 제품 가격을 입력 받고 10% 부과세와 거스름돈을 출력하세요.
*/

public class Shopping {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter paid money : ");
        int pMoney = input.nextInt();
        
        System.out.print("Enter products price : ");
        int pPrice = input.nextInt();
        
        System.out.println();
        
        double tax = pPrice * 0.1;
        int change = pMoney - pPrice;
        
        System.out.println("Imposition tax is : " + tax);
        System.out.print("Change is : "+ change);
    }
}