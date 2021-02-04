import java.util.Arrays;
import java.util.Random;

public class Main4 {
    static Random r = new Random();

    public static void main(String[] args) {

        int[] arr = new int[r.nextInt(10) + 1];
        int[] arr2 = new int[r.nextInt(10) + 1];

        setArrays(arr);
        setArrays(arr2);

        /*
        *  19 - 20 같음 확인용 코드!
        *  아래 두 줄을 실행 시킬 때는 8 - 12 행을 주석 처리 해주세요. 
        */
        // int[] arr = { 1, 2, 3 };
		// int[] arr2 = { 1, 2, 3 };
        
        System.out.println("두 배열은 같나요? "+ equalArr(arr, arr2));
        // System.out.println(Arrays.equals(arr, arr2));
        // java 기본 class: Arrays
    }
    
    public static void setArrays(int[] arr) {

        System.out.print("▷ { ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(100) + 1;
            System.out.printf("%3d ", arr[i]);
        }
        System.out.println("} ");
    }
    
    public static boolean equalArr(int[] arr, int[] arr2) {
        // 두 개의 정수 배열이 같으면 true를 return하는 메소드

        boolean isEqual = true;
        if (arr.length != arr2.length) {
            isEqual = false;
        } else {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] != arr2[i]) {
                    isEqual = false;
                    break;
                }
            }
        }
        return isEqual;
    }
    
}
