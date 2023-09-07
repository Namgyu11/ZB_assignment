package Mini_assignment.assignment_07;
/*
* 1. 로또 구매 수량 입력
2. 입력한 개수만큼의 로또 개수 생성
3. 로또 당첨 번호 생성(숫자값은 중복 배제 및 정렬해서 표시)
4. 당첨 번호와 구매 로또 비교하여 숫자 일치 여부 판단
* */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Lotto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<int[]> list = new ArrayList<>(); // 로또 개수만큼 랜덤번호를 생성해서 담을 List
        int[] outputNumber; //출력번호
        int[] winningNumber;// 당첨번호

        char alpha = 'A';

        System.out.println("[로또 당첨 프로그램]\n");

        while (true) {
            System.out.print("로또 개수를 입력해 주세요.(숫자 1~10): ");
            int numberOfLotto = sc.nextInt();
            if(numberOfLotto < 1 || numberOfLotto > 10){
                System.out.println("1에서 10 사이의 수만 입력해주세요.");
            }else {
                for (int i = 0; i < numberOfLotto; i++) { // 입력 받은 개수에 따른 로또 번호 랜덤 생성

                    list.add(i, lottoNumberCreate());
                }
                break;
            }

        }

        for (int i = 0; i < list.size(); i++) {
            outputNumber = new int[6];
            for (int j = 0; j < outputNumber.length; j++) {
                outputNumber = list.get(i);
                if (j == 0) {
                    System.out.printf("%s\t%02d", alpha, outputNumber[j]);
                } else if (j < outputNumber.length - 1) {
                    System.out.printf(",%02d", outputNumber[j]);
                } else {
                    System.out.printf(",%02d\n", outputNumber[j]);
                }
            }
            if (i < list.size() - 1) {
                alpha++;
            } else {
                alpha = 'A'; // 다음 출력을 위해 초기화
                System.out.println();
            }
        }


        System.out.println("[로또 발표]");
        winningNumber = lottoNumberCreate();
        for (int i = 0; i < winningNumber.length; i++) {
            if (i == 0) {
                System.out.printf("\t%02d", winningNumber[i]);
            } else if (i < winningNumber.length - 1) {
                System.out.printf(",%02d", winningNumber[i]);
            } else {
                System.out.printf(",%02d\n\n", winningNumber[i]);
            }
        }

        //당첨 번호와 구매한 로또 번호를 비교해서 숫자 일치 여부 판단
        /* for
        System.out.println("[내 로또 결과]");
        for (int i = 0; i < list.size(); i++) {
            int count = 0;
            outputNumber = list.get(i);

            for (int j = 0; j < outputNumber.length; j++) {
                for (int k = 0; k < outputNumber.length; k++) {
                    if (outputNumber[j] == winningNumber[k]) {
                        count++;
                    }
                }
                if (j == 0) {
                    System.out.printf("%s\t%02d", alpha, outputNumber[j]);
                } else if (j < outputNumber.length - 1) {
                    System.out.printf(",%02d", outputNumber[j]);
                } else {
                    System.out.printf(",%02d => %d개 일치\n", outputNumber[j], count);
                }
            }
            alpha++;
        }
         */
        //foreach
        for (int[] outputNumber1 : list) {
            int count = 0;

            for (int j = 0; j < outputNumber1.length; j++) {
                for (int winningNum : winningNumber) {
                    if(outputNumber1[j] == winningNum){
                        count++;
                    }
                }
                if (j == 0) {
                    System.out.printf("%s\t%02d", alpha, outputNumber1[j]);
                } else if (j < outputNumber1.length - 1) {
                    System.out.printf(",%02d", outputNumber1[j]);
                } else {
                    System.out.printf(",%02d => %d개 일치\n", outputNumber1[j], count);
                }
            }
            alpha++;
        }
    }

    public static int[] lottoNumberCreate() {
        int[] inputNumber = new int[6];

        for (int i = 0; i < inputNumber.length; i++) {
            inputNumber[i] = (int) (Math.random() * 45) + 1;
            // 증복 제거
            for (int j = 0; j < i; j++) {
                if (inputNumber[i] == inputNumber[j]) {
                    i--;
                    break;
                }
            }
        }
        Arrays.sort(inputNumber);
        return inputNumber;
    }
}
