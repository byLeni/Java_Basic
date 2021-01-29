public class No1 {
    
    public static void main(String[] args) {
        star();
        number();
    }

    private static void star() {
        System.out.println("   *");
        System.out.println("  ***");
        System.out.println(" *****");
        System.out.println("*******");
        System.out.println(" *****");
        System.out.println("  ***");
        System.out.println("   *");
    }

    private static void number() {
        for (int i = 1; i < 10; i++) {
            System.out.println(i);
        }
    }
}
