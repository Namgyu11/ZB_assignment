package Mini_assignment.assignment_01;

/*
 백엔드 스쿨 17기
 이름: 하남규
 */
public class Gugudan {
    public static void main(String[] args) {

        System.out.println("[구구단 출력]");
        for(int i = 1; i < 10; i++){
            for(int j = 2; j < 10; j++){
                System.out.print(String.format("%02d X ",j));
                System.out.print(String.format("%02d = ",i));
                System.out.print(String.format("%02d\t",j*i));
            }
                System.out.println();
        }

    }
}
