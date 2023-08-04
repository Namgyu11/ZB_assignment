package Mini_assignment.assignment_03;

import java.util.Scanner;


/*
    백엔드 스쿨 16기
    이름: 하남규
* */
public class Ticket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("나이를 입력해주세요.(숫자): ");
        int age = sc.nextInt();
        System.out.print("입장시간을 입력해주세요.(숫자입력): ");
        int time = sc.nextInt();
        System.out.print("국가유공자 여부를 입력해주세요.(y/n): ");
        String AMM = sc.next().toLowerCase();
        System.out.print("복지카드 여부를 입력해주세요.(y/n): ");
        String card = sc.next().toLowerCase();

        int charge = 10000; // 기본 입장료

        if (AMM.equals("y") || card.equals("y")) { // 복지카드와 국가유공자의 경우 일반 할인 적용
            charge = 8000;
            //중첩 if문을 활용해서 할인이 중복될 경우 특별 할인 적용
            if (age < 13) {
                charge = 4000; //13세 미만이면 특별 할인 적용
            }
            if (time >= 17) { // 17시이후에 입장하면 특별 할인 적용
                charge = 4000;
            }
        }
        if (age < 13) {
            charge = 4000; //13세 미만이면 특별 할인 적용
        }

        if (time >= 17) { // 17시이후에 입장하면 특별 할인 적용
            charge = 4000;
        }

        if (age < 3) { // 3세 미만일 경우 무료
            charge = 0;
        }
        System.out.print("입장료: " + charge);
    }
}
