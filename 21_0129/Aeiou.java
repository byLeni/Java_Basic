import java.util.Scanner;

public class Aeiou {
    public static void main(String[] args) {

        String string;
        String vowels = ""; // 모음
        String consonant = ""; // 자음

        System.out.print("영문자를 하나 입력하세요 >> ");
        string = new Scanner(System.in).nextLine();

        for (int i = 0; i < string.length(); i++) {
            char c = string.charAt(i);
            switch (c) {
                case 'a':
                    consonant += c + " ";
                    break;
                case 'e':
                    consonant += c + " ";
                    break;
                case 'i':
                    consonant += c + " ";
                    break;
                case 'o':
                    consonant += c + " ";
                    break;
                case 'u':
                    consonant += c + " ";
                    break;
                default:
                    vowels += c + " ";
                    break;
            }
        }
        
        System.out.println("모음 >> " + vowels);
        System.out.println("자음 >> " + consonant);      
    }
}
