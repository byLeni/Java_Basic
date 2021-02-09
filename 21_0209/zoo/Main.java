package zoo;

import java.util.Scanner;

public class Main {

    static Scanner input = new Scanner(System.in);
    
    public static void main(String[] args) {

        Zoo myZoo;

        System.out.println("코끼리를 키워 봅시다!");
        System.out.print("동물원 이름을 정해주세요: ");
        String name = input.nextLine();
        System.out.print("동물원 주소를 정해주세요: ");
        String addr = input.nextLine();
        myZoo = new Zoo(name, addr);
        
        System.out.print("몇 마리 키울까요? ");
        int count = input.nextInt();
        input.nextLine();
        for (int i = 0; i < count; i++) {
            System.out.printf("%d번째 코키리 이름은? ", i + 1);
            name = input.nextLine();
            myZoo.addElephant(name);
        }

        while (true) {
            System.out.println("\n--- 코끼리 정보 출력 --------------------");
            int i = 1;
            for (Elephant e : myZoo.getElephant()) {
                System.out.printf("\n- %d번 코끼리\n이름: %s", i, e.getName());
                if (90 < e.getSatietyLevel()) {
                    System.out.printf("\t포만감: %d ( 배가 불러요! )", e.getSatietyLevel());
                } else if (e.getSatietyLevel() < 40) {
                    System.out.printf("\t포만감: %d ( 배가 고파여.. )", e.getSatietyLevel());
                } else {
                    System.out.printf("\t포만감: %d ( 그냥 그래요 )", e.getSatietyLevel());
                }
                i++;
            }
            System.out.println();
            System.out.print("\n몇 번 코끼리에게 밥을 줄까요? (코끼리 번호를 입력하거나, 종료: 0)");
            int index = input.nextInt();
            if (index == 0) {
                break;
            } else {
                if(0 <index && index < myZoo.getElephant().length){
                    System.out.print("먹이를 얼마나 줄까요? ");
                    int feed = input.nextInt();
                    myZoo.getElephant()[index-1].feeding(feed);
                }
            }
        }

    }
}
