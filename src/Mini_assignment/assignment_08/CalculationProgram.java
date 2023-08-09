package Mini_assignment.assignment_08;

import java.util.Scanner;


public class CalculationProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tax = 0; // 최종 세금
        int finalDTax = 0; // 누진 공세 세금
        int taxM; // 현재 세율에 맞는 마지막 세율에 적용할 금액

        int taxRateResult1 = (int) (12000000 * 0.06);
        int taxRateResult2 = (int) (34000000 * 0.15);
        int taxRateResult3 = (int) (42000000 * 0.24);
        int taxRateResult4 = (int) (62000000 * 0.35);
        int taxRateResult5 = (int) (150000000 * 0.38);
        int taxRateResult6 = (int) (200000000 * 0.40);
        int taxRateResult7 = (int) (500000000 * 0.42);

        System.out.println("[과세금액 계산 프로그램]");

        System.out.print("연소득을 입력해주세요: ");
        int income = sc.nextInt(); // 연소득 금액

        if (income <= 12000000) {
            tax = taxRateResult1;

            System.out.printf("%d  *  6%% = %d\n", income, tax);
        }
        if (income > 12000000 && income <= 46000000) {
            taxM = income - 12000000;

            tax = taxRateResult1 + (int) ((taxM) * 0.15);
            finalDTax = findDTax(income, 1080000, 15);
            System.out.printf("%d * 6%% = %d\n", 120000, taxRateResult1);
            System.out.printf("%d * 15%% = %d\n", taxM, (int) ((taxM) * 0.15));
        }
        if (income > 46000000 && income <= 88000000) {
            taxM = income - 12000000 - 34000000;

            tax = taxRateResult1 + taxRateResult2 + (int) ((taxM) * 0.24);
            finalDTax = findDTax(income, 5220000, 24);


            System.out.printf("%d * 6%% =   %d\n", 12000000, taxRateResult1);
            System.out.printf("%d * 15%% =  %d\n", 34000000, taxRateResult2);
            System.out.printf("%d * 24%% =  %d\n", taxM, (int) ((taxM) * 0.24));
        }
        if (income > 88000000 && income <= 150000000) {
            taxM = income - 12000000 - 34000000 - 42000000;

            tax = taxRateResult1 + taxRateResult2 + taxRateResult3 + (int) (income * 0.35);
            finalDTax = findDTax(income, 14900000, 35);


            System.out.printf("%d * 6%% = %d\n", 120000, taxRateResult1);
            System.out.printf("%d * 15%% = %d\n", 34000000, taxRateResult2);
            System.out.printf("%d * 24%% = %d\n", 42000000, taxRateResult3);
            System.out.printf("%d * 35%% = %d\n", taxM, (int) ((taxM) * 0.35));
        }
        if (income > 150000000 && income <= 300000000) {
            taxM = income - 12000000 - 34000000 - 42000000 - 62000000;

            tax = taxRateResult1 + taxRateResult2 + taxRateResult3 + taxRateResult4 + (int) (income * 0.38);
            finalDTax = findDTax(income, 19400000, 38);

            System.out.printf("%d * 6%% = %d\n", 120000, taxRateResult1);
            System.out.printf("%d * 15%% = %d\n", 34000000, taxRateResult2);
            System.out.printf("%d * 24%% = %d\n", 42000000, taxRateResult3);
            System.out.printf("%d * 35%% = %d\n", 62000000, taxRateResult4);

            System.out.printf("%d * 38%% = %d\n", taxM, (int) ((taxM) * 0.38));

        }
        if (income > 300000000 && income <= 500000000) {
            taxM = income - 12000000 - 34000000 - 42000000 - 62000000 - 150000000;

            tax = taxRateResult1 + taxRateResult2 + taxRateResult3 + taxRateResult4 + taxRateResult5 +
                    (int) (income * 0.40);
            finalDTax = findDTax(income, 25400000, 40);

            System.out.printf("%d * 6%% = %d\n", 120000, taxRateResult1);
            System.out.printf("%d * 15%% = %d\n", 34000000, taxRateResult2);
            System.out.printf("%d * 24%% = %d\n", 42000000, taxRateResult3);
            System.out.printf("%d * 35%% = %d\n", 62000000, taxRateResult4);
            System.out.printf("%d * 35%% = %d\n", 150000000, taxRateResult5);

            System.out.printf("%d * 40%% = %d\n", taxM, (int) ((taxM) * 0.40));

        }
        if (income > 500000000 && income <= 1000000000) {
            taxM = income - 12000000 - 34000000 - 42000000 - 62000000 - 150000000 - 200000000;

            tax = taxRateResult1 + taxRateResult2 + taxRateResult3 + taxRateResult4 + taxRateResult5 +
                    taxRateResult6 + (int) (income * 0.42);
            finalDTax = findDTax(income, 35400000, 42);

            System.out.printf("%d * 6%% = %d\n", 120000, taxRateResult1);
            System.out.printf("%d * 15%% = %d\n", 34000000, taxRateResult2);
            System.out.printf("%d * 24%% = %d\n", 42000000, taxRateResult3);
            System.out.printf("%d * 35%% = %d\n", 62000000, taxRateResult4);
            System.out.printf("%d * 38%% = %d\n", 150000000, taxRateResult5);
            System.out.printf("%d * 40%% = %d\n", 150000000, taxRateResult6);

            System.out.printf("%d\t*\t42%% = \t%d\n", taxM, (int) ((taxM) * 0.42));
        }
        if (income > 1000000000) {
            taxM = income - 12000000 - 34000000 - 42000000 - 62000000 - 150000000 - 200000000 - 500000000;

            tax = taxRateResult1 + taxRateResult2 + taxRateResult3 + taxRateResult4 + taxRateResult5 +
                    taxRateResult6 + taxRateResult7 + (int) (income * 0.45);
            finalDTax = findDTax(income, 35400000, 42);

            System.out.printf("%d * t6%% = %d\n", 120000, taxRateResult1);
            System.out.printf("%d * 15%% = %d\n", 34000000, taxRateResult2);
            System.out.printf("%d * 24%% = %d\n", 42000000, taxRateResult3);
            System.out.printf("%d * 35%% = %d\n", 62000000, taxRateResult4);
            System.out.printf("%d * 38%% = %d\n", 150000000, taxRateResult5);
            System.out.printf("%d * 40%% = %d\n", 200000000, taxRateResult6);
            System.out.printf("%d * 42%% = %d\n", 500000000, taxRateResult7);

            System.out.printf("%d * 45%% = %d\n", taxM, (int) ((taxM) * 0.45));
        }

        System.out.println();
        System.out.println("[세율에 의한 세금]:\t" + tax);
        System.out.println("[누진공제 계산에 의한 세금]:\t" + finalDTax);


    }

    //누진 공제 계산에 의한 세금을 구하는 메소드
    public static int findDTax(int condition, int deduction, int percent) {
        int result;
        result = (int) ((condition * (percent * 0.01)) - deduction);

        return result;
    }
}
