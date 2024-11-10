import java.time.LocalDate;
import java.util.Scanner;

public class CalendarPrinter {
    public static void main(String[] args) {
        // 스캐너 객체 생성 - 호출 준비
        Scanner scanner = new Scanner(System.in);

        // 년도 정수로 입력받기
        System.out.print("년도를 입력하세요: ");
        int year = scanner.nextInt();

        // 월 정수로 입력받기
        System.out.print("월을 입력하세요: ");
        int month = scanner.nextInt();

        // printCalendar 메서드 호출
        printCalendar(year, month);
    }

    // printCalendar 메서드 정의
    public static void printCalendar(int year, int month){
        // 매월 첫번째날 LocalDate 객체 생성
        LocalDate firstDayOfMonth = LocalDate.of(year, month, 1);

        // 첫번째날의 요일 구하기 (월요일 : 1 ~ 일요일 : 7)
        int firstDayOfWeek = firstDayOfMonth.getDayOfWeek().getValue();

        // 일요일이 1이 될 수 있도록 설정 (일요일 : 1 ~ 토요일 : 7)
        firstDayOfWeek = (firstDayOfWeek == 7) ? 1 : firstDayOfWeek + 1;

        // 매월 마지막날 구하기
        int lastDayOfMonth = firstDayOfMonth.lengthOfMonth();

        // 달력 상단 문구 출력
        System.out.printf("[ %d년 %d월 달력 ]%n", year, month);

        // 요일 출력 - 한글로 했을 때 간격이 맞지않아 영어로 기재
        System.out.println("Su Mo Tu We Th Fr Sa");

        // 매월 첫번째날 시작 전 공백 출력
        for (int i = 1; i < firstDayOfWeek; i++) {
            System.out.print("   ");
        }

        // 날짜 출력
        for (int day = 1; day <= lastDayOfMonth; day++) {
            System.out.printf("%2d ", day);
            // 7일마다 줄개행
            if ((firstDayOfWeek + day -1) % 7 == 0) {
                System.out.println();
            }
        }
    }
}
