package Mini_assignment.assignment_04;

import java.util.Random;
import java.util.Scanner;

public class RRnumber {
    public static void main(String[] args) {
        // 입력값은 2020년도 이후로 전제
        String year;
        String month;
        String day;
        String gender;
        Scanner sc = new Scanner(System.in);
        System.out.println("[주민등록번호 계산]");
        while (true) {
            System.out.print("출생년도를 입력해주세요.(yyyy): ");
            year = sc.next();
            if (Integer.parseInt(year) < 2020) {
                System.out.println("2020년도 이상만 입력할 수 있습니다");
            } else {
                break;
            }
        }

        while (true) {
            System.out.print("출생월을 입력해주세요.(mm): ");
            month = sc.next();
            if (Integer.parseInt(month) > 12) {
                System.out.println("12월 이상은 입력되지 않습니다.");
            } else if (month.length() != 2) {
                System.out.println("문자 형식에 맞게 입력해주세요");
            } else {
                break;
            }
        }


        while (true) {
            System.out.print("출생일을 입력해주세요.(dd): ");
            day = sc.next();
            if (Integer.parseInt(month) > 31) {
                System.out.println("31일 이하로 입력해주세요.");
            } else if (month.length() != 2) {
                System.out.println("문자 형식에 맞게 입력해주세요");
            } else {
                break;
            }

        }

        while (true) {
            System.out.print("성별을 입력해주세요.(m/f): ");
            gender = sc.next();
            if (gender.equals("m") || gender.equals("f")) {
                break;
            } else {
                System.out.println("문자 형식에 맞게 입력해주세요.");
            }
        }


        String frontid = year.substring(2, 4) + month.substring(0, 2) + day.substring(0, 2);
        int genderid;
        if (gender.equals("m")) {
            genderid = 3;
        } else {
            genderid = 4;
        }

        Random random = new Random();
        int backid = random.nextInt(1000000) + 1;
        System.out.println(frontid + "-" + genderid + String.format("%06d", backid));
    }
}
