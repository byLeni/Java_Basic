import java.util.Scanner;

public class CoffeeShop {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int selected, price, temp;
        String coffee;

        System.out.println("음료를 선택해주세요.");
        System.out.println("ㅡ ㅡ ㅡ ㅡ ㅡ ㅡ ㅡ ㅡ ㅡ ㅡ");
        System.out.println("1. 아메리카노: 2000원");
        System.out.println("2. 카페라떼: 2500원");
        System.out.println("3. 카페모카: 3000원");
        System.out.print(" >> ");

        selected = input.nextInt();
        if (selected == 1) {
            coffee = "아메리카노";
            price = 2000;
        } 
        else if (selected == 2) {
            coffee = "카페레떼";
            price = 2500;
        }
        else {
            coffee = "카페모카";
            price = 3000;
        }     

        System.out.println();
        System.out.println("ㅡ ㅡ ㅡ ㅡ ㅡ ㅡ ㅡ ㅡ ㅡ ㅡ");
        System.out.println("1. 차갑게 아이스로! (500원 추가 됩니다.)");
        System.out.println("2. 따뜻하게!");
        System.out.print(" >> ");

        temp = input.nextInt();
        System.out.println();
        if (temp == 1) {
            price += 500;
            System.out.printf("주문하신 아이스 %s는 %d원 입니다.\n", coffee, price);
        }
        else {
            System.out.printf("주문하신 %s는 %d원 입니다.\n", coffee, price);
        }
        System.out.println();
       
    }
}
