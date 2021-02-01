public class PrintStarts {
    public static void main(String[] args) {
        // question1();
        // question2();
        // question3();
        // question4();

        // 삼각형
        // question5();

        // 역삼각형
        // question6();

        // 마름모
        question7();

    }
    
    public static void question1() {
        String star = "*";
        for (int i = 0; i < 5; i++) {
            System.out.println(star);
            star += "*";
        }
    }

    public static void question2() {
        String star = "*****";
        for (int i = 0; i < 5; i++) {
            System.out.println(star);
            star = star.substring(0, star.length() - 1);
        }
    }
    
    public static void question3() {
        String star = "*";
        for (int i = 0; i < 5; i++) {
            System.out.printf("%5s\n", star);
            star += "*";
        }
    }

    public static void question4() {
        String star = "*****";
        for (int i = 0; i < 5; i++) {
            System.out.printf("%5s\n", star);
            star = star.substring(0, star.length() - 1);
        }
    }

    public static void question5() {
        /*
        출력문으로 할 수 있겠지만...
        이왕 for문 연습하는 거 for문으로 작성해보자.
        */

        String star = "*";
        int space = 3;
        
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= space; j++) {
                System.out.print(" ");
            }
            System.out.println(star);
            star += "**";
            space--;
        }
    }
        
        public static void question6() {
        /*
        출력문으로 할 수 있겠지만...
        이왕 for문 연습하는 거 for문으로 작성해보자.
        */
        
        String star = "***********";
        int space = 0;
        
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < space; j++) {
                System.out.print(" ");
            }
            star = star.substring(0, star.length() - 2);
            System.out.println(star);
            space++;
        }
    }
        
        public static void question7() {
        /* 
        5번 6번을 그대로 출력하면 마름모!
        지만 모양이 애매하다. (중간라인 길이가 같다!)
        */
        // question5();
        // question6();

        // 그래서 for문으로도 만들어보자 !
        String star = "*";
        int space = 4;

        for (int i = 1; i < 10; i++) {
            if (i < 10 / 2) {
                for (int j = 0; j < space; j++) {
                    System.out.print(" ");
                }
                System.out.println(star);
                star += "**";
                space--;
            } else {
                for (int j = 0; j < space; j++) {
                    System.out.print(" ");
                }
                System.out.println(star);
                if (0 < star.length() - 2) {
                    star = star.substring(0, star.length() - 2);
                }
                space++;
            }
        }
    }
}
