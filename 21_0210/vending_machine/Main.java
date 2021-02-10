package vending_machine;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        VendingMachine vm = new VendingMachine();

        System.out.println("음료 좀 뽑아 볼 까요?");
        System.out.println("1번 콜라, 2번 사이다, 3번 커피");
        System.out.print("▷ ");
        int choice = input.nextInt();
        
        Drink drink = new Drink();
        switch (choice) {
            case 1:
                drink = vm.makeCoca();
                break;
            case 2:
                drink = vm.makeSprite();
                break;
            case 3:
                drink = vm.makeCoffee();
                break;
            default:
                System.out.println("잘못 된 선택입니다 T-T.. 물이라도 드릴께요..");
                break;
        }

        System.out.print(drink.getName());
        System.out.println(drink.getPrice());

        input.close();
    }
}
