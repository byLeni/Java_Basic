import java.util.Scanner;

public class Theater {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int loop;
        int[] seats = new int[10];
        // 초기화 하지 않으면 기본 0 저장

        while (true) {
            System.out.print("좌석을 예약 하시겠습니까? (yes: 1 / no: 0) 숫자로 입력해주세요 ▷ ");
            loop = input.nextInt();

            if (loop != 1) {
                break;
            }

            System.out.println("현재의 예약 상태는 다음과 같습니다.");
            System.out.println("--------------------------------------");
            System.out.println("1 2 3 4 5 6 7 8 9 10");
            System.out.println("--------------------------------------");
            for (int seat : seats) {
                System.out.print(seat + " ");
            }

            System.out.println();
            System.out.print("예약하실 좌석 번호를 입력해주세요 ▷ ");
            int num = input.nextInt();
            if (num <= 0 || seats.length < num) {
                System.out.println("좌석 번호가 잘못 되었습니다.");
            } else {
                if (seats[num - 1] == 0) {
                    seats[num - 1] = 1;
                    System.out.printf("%d 번 좌석 예약이 완료되었습니다 : -) 즐거운 관람되세요!\n", num);
                } else {
                    System.out.println("이미 예약 된 좌석입니다.");
                }
            }
        }
        
        input.close();
    }
}
