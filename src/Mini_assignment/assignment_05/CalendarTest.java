package Mini_assignment.assignment_05;

import java.util.Calendar;
import java.util.Scanner;

public class CalendarTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("[달력 출력 프로그램]");
        System.out.print("달력의 연도를 입력해주세요.(yyyy): ");
        int year = sc.nextInt();
        System.out.print("달력의 월을 입력해주세요(mm): ");
        int month = sc.nextInt();
        System.out.println("\n");
        System.out.println("[" + year + "년 " + month + "월" + "]");

        Calendar day = Calendar.getInstance();

        day.set(year, month - 1, 1);

        int lastDay = day.getActualMaximum(day.DAY_OF_MONTH); // 입력한 달의 마지막 요일

        int startDay = day.get(day.DAY_OF_WEEK);  // 입력한 달의 시작 요일 일요일 = 1 , 월요일 = 2 ...

        System.out.println("일\t월\t화\t수\t목\t금\t토");

        switch (startDay) { // 요일에 맞춰 일 수 띄워주기
            case 7:
                System.out.print("\t");
            case 6:
                System.out.print("\t");
            case 5:
                System.out.print("\t");
            case 4:
                System.out.print("\t");
            case 3:
                System.out.print("\t");
            case 2:
                System.out.print("\t");
        }


        for (int i = 1; i <= lastDay; i++) {
            System.out.print(i + "\t");
            if (startDay % 7 == 0) {
                System.out.println(); // 토요일이 지난 뒤 줄 바꿈
            }
            startDay++;
        }
    }
}
