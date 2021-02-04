import java.util.Random;

/*
 * 길이가 다른 정수형 배열이 2개 있습니다.
 * 2개의 정수배열을 전달받아서 합을 담고 있는 배열을 return하는 메소드.
 
 + 매개변수 배열의 길이와 상관없이 계산이 되도록 만드세요!
 */

public class Main3 {
    static Random r = new Random();
    public static void main(String[] args) {

        int[] arr = new int[r.nextInt(10) + 1];
        int[] arr2 = new int[r.nextInt(10) + 1];

        setArrays(arr);
        setArrays(arr2);

        int[] sum = sumArrays(arr, arr2);
        for (int value : sum) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
    
    public static void setArrays(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(100) + 1;
        }
    }
    
    public static int[] sumArrays(int[] arr, int[] arr2) {
        int[] temp;

        int length = arr2.length;
        if (length < arr.length) {
            length = arr.length;
            temp = arr;
            arr = arr2;
            arr2 = temp;
        }

        int[] sum = new int[length];

        for (int i = 0; i < sum.length; i++) {
            if (i < arr.length) {
                sum[i] = arr[i] + arr2[i];
            } else {
                sum[i] = arr2[i];
            }
        }
        return sum;
    }
}
