package calendar;

import java.time.LocalDate;
// import java.time.format.TextStyle;
// import java.util.Locale;

/*
 * 2021년 2월 1일의 날짜 객체를 만들고,
 * 객체의 요일을 확인하고,
 * 객체의 달의 길이를 확인하고,
 * 요일만큼 공백을 만들어주고,
 * 숫자를 1부터 하나씩 길이만큼 출력.
 * 토요일에서 일요일로 넘어갈때 다음줄로 넘어간다.
 */

public class Main4 {
    public static void main(String[] args) {

        final int YEAR = 2021;
        final int DAY = 01;
        final int[] MONTH = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};

        for (int month : MONTH) {
            LocalDate mon = LocalDate.of(YEAR, month, DAY);
            drawMonth(mon);
        }
		
		/*
		* 메소드 확인용 연습 코드
		*/
        
        // 객체의 요일을 출력
        // System.out.println(today.getDayOfWeek().name());
        
        // 객체의 요일을 원하는 스타일로 출력
		// Local과 TextStyle 클래스를 쓰기 위해서는 위에 import 주석을 해제해야 합니다.
        // Locale locale = Locale.getDefault();
        // System.out.println(today.getDayOfWeek().getDisplayName(TextStyle.SHORT, locale));
        /*
         * 객체의 번호 출력
         *  월(1) ~ 일(7)
         */
        // System.out.println(today.getDayOfWeek().getValue());

        // 객체의 달의 길이 확인
        // System.out.println(today.lengthOfMonth());
    }

    public static void drawMonth(LocalDate month) {
        System.out.printf("--%s----------------------\n", month.getMonth().name());
        // 맨 위의 요일 출력하기
        System.out.println("일 월 화 수 목 금 토");

        // 첫 주의 공백 만들어 주기
        int space = month.getDayOfWeek().getValue();
        if (space != 7) {
            for (int i = 0; i < space; i++) {
                System.out.printf("%3s", " ");
            }
        }

        // 날짜 표기
        int days = month.lengthOfMonth();
        for (int i = 1; i <= days; i++) {
            System.out.printf("%02d ", i);
            if ((i + space) % 7 == 0) {
                System.out.println();
            }
        }
        System.out.println();
    }
}
