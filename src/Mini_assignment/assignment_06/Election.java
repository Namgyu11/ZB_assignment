package Mini_assignment.assignment_06;

import java.util.*;

public class Election {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<String> cdList = new LinkedList<>();
        HashMap<String, Integer> cdMap = new HashMap<>();

        int vote = 0;
        int candidate = 0;
        String name = "";
        while (true) {
            System.out.print("총 진행할 투표수를 입력해주세요. ");
            vote = sc.nextInt();
            if (vote < 1 || vote > 10000) {
                System.out.println("투표수는 1~10000사이의 값을 입력해주세요");
            } else {
                break;
            }

        }
        while (true) {
            System.out.print("가상 선거를 진행할 후보자 인원을 입력해주세요. ");
            candidate = sc.nextInt();
            if (candidate < 2 || candidate > 10) {
                System.out.println("후보자 인원 수는 2~10 사이의 값을 입력해주세요");
            } else {
                break;
            }
        }

        for (int i = 1; i <= candidate; i++) {
            while (true) {
                System.out.print(i + "번째 후보자 이름을 입력해주세요. ");
                name = sc.next();
                if (name.length() >= 10) {
                    System.out.println("후보자 이름은 10자 미만으로 입력하세요.");
                }else {
                    break;
                }
            }
            cdList.add(name);
            cdMap.put(name, 0);// 후보자 이름과 투표수를 저장할 해쉬맵
        }
        System.out.println();

        for (int i = 1; i <= vote; i++) {
            Random random = new Random();
            double progress = (double) i / vote * 100; // 투표 진행률
            int voting = random.nextInt(candidate); // 임의번호로 후보자 투표

            String votingName = cdList.get(voting); // 임의번호로 후보자 리스트에서 후보자 이름 추출
            int count = cdMap.get(votingName) + 1;
            cdMap.put(votingName, count); // 후보자 맵에서 후보자 투표수 증가
            System.out.println("[투표 진행률]: " + String.format("%.2f", progress) + "%, " + i + "명 투표 => " + votingName);

            for (int j = 0; j < cdList.size(); j++) {
                double numberOfVote = (double) cdMap.get(cdList.get(j));
                System.out.print("[기호:" + (j + 1) + "] " + cdList.get(j) + ":" + String.format("%.2f", numberOfVote / vote * 100));
                System.out.println("% " + "(투표수: " + cdMap.get(cdList.get(j)) + ")");
            }
            System.out.println();
        }

        String maxKey = null;
        int maxValue = Integer.MIN_VALUE; // 최대값 초기화

        for (Map.Entry<String, Integer> entry : cdMap.entrySet()) {
            if (entry.getValue() > maxValue) {
                maxValue = entry.getValue(); // 최대값 갱신
                maxKey = entry.getKey(); // 최대값을 갖는 키 갱신
            }
        }
        System.out.println("[투표결과] 당선인 : " + maxKey);

    }

}
