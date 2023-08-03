package Mini_assignment.assignment_02;

import java.util.Scanner;

public class Cashback {
    public static void main(String[] args) {
        System.out.println("[캐시백 계산]");
        System.out.print("결제 금액을 입력해주세요.(금액): ");

        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        int cb = i / 10;
        cb = (cb / 100) * 100; // 100을 나눠서 소수점 아래값들은 버린 후 다시 100을 곱해 백원 단위로 캐시백 반환

        if (cb > 300) { // 캐시백 포인트는 최대 300원 -> 300원을 넘어가면 강제로 300원 유지
            cb = 300;
        }
        System.out.print("결제금액은 " + i + "원이고, 캐시백은 " + cb + "원 입니다");
    }
}
