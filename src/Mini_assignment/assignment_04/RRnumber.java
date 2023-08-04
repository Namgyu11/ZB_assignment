package Mini_assignment.assignment_04;

import java.util.Random;
import java.util.Scanner;

public class RRnumber {
    public static void main(String[] args){
        // 입력값은 2020년도 이후로 전제
        Scanner sc = new Scanner(System.in);
        System.out.println("[주민등록번호 계산]");
        System.out.print("출생년도를 입력해주세요.(yyyy): ");
        String year = sc.next();
        System.out.print("출생월을 입력해주세요.(mm): ");
        String month = sc.next();
        System.out.print("출생일을 입력해주세요.(dd): ");
        String day = sc.next();
        System.out.print("성별을 입력해주세요.(m/f): ");
        String gender = sc.next();

        String frontid = year.substring(2,4) + month.substring(0,2) + day.substring(0,2);
        int genderid;
        if(gender.equals("m")){
            genderid = 3;
        }else {
            genderid = 4;
        }

        Random random = new Random();
        int backid = random.nextInt(1000000) + 1;
        System.out.println(frontid + "-" + genderid + String.format("%06d",backid)) ;
    }
}
