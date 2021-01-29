import java.util.Scanner;

public class Aeiou {
    public static void main(String[] args) {

        String string;
        String vowels = ""; // 모음
        String consonant = ""; // 자음

        int vowelsCount = 0;
        int consonantCount = 0;

        final String VOWELS = "aeiou";

        System.out.println("중복을 제외한 영문장의 자/모음을 구분하고 자/모음과 각 갯수를 출력합니다.");
        System.out.print(" >> ");
        string = new Scanner(System.in).nextLine();

        for (int i = 0; i < string.length(); i++) {

            string = string.toLowerCase();
            // 대문자를 소문자로 변환시켜줘야한다. 컴퓨터는 대/소문자가 같다고 인식하지 못한다.
            char c = string.charAt(i);
            int hasVowels = VOWELS.indexOf(c);

            switch (hasVowels) {
                case -1:
                    if (consonant.indexOf(c) == -1) {
                        consonant += c + " ";
                        consonantCount++;
                    }
                    break;
                default:
                    if (vowels.indexOf(c) == -1) {
                        vowels += c + " ";
                        vowelsCount++;
                    }
                    break;
            }
        }
        
        System.out.println("모음 >> " + vowels + " ( " + vowelsCount + " )");
        System.out.println("자음 >> " + consonant + " ( " + consonantCount + " )");     
    }
}
