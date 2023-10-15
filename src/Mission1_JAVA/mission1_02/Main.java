package Mission1_JAVA.mission1_02;

import java.util.*;
import java.lang.Math;

class Main {
    // 좌표를 표현하는 클래스
    static class Point {
        int x;
        int y;


        Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        // 다른 좌표와의 거리를 계산하는 메소드
        // 두 점 사이의 거리를 계산하는 공식(피타고라스 정리 a² + b² = c²)
        double distance(Point point) {
            return Math.sqrt(Math.pow(this.x - point.x, 2) + Math.pow(this.y - point.y, 2));
        }

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Point> pointList = new ArrayList<>(); // 좌표를 담을 리스트
        ArrayList<String> checkList = new ArrayList<>(); // 좌표가 중복되어 있는지 체크하는 리스트

        System.out.print("나의 좌표를 입력하세요: ");
        Point myPoint = new Point(sc.nextInt(), sc.nextInt());

        while (pointList.size() < 10) {
            System.out.print("임의의 좌표를 입력하세요: ");
            int x = sc.nextInt();
            int y = sc.nextInt();

            String checkStr = x + "," + y; // 중복 체크를 위해 string 값 담기
            if (!checkList.contains(checkStr)) {
                checkList.add(checkStr);
                pointList.add(new Point(x, y));
            } else {
                System.out.println("동일한 좌표값이 존재합니다. 다시 입력해주세요.");
            }
        }
        // 가장 가까운(최소) 거리 값을 저장하기 위해 최댓값으로 초기화
        double minDisPoint = Double.MAX_VALUE;
        Point minPoint = null;

        for (Point point : pointList) {
            double dis = myPoint.distance(point);
            if (dis < minDisPoint) { //최댓값으로 초기화 하여 가까운(최소) 거리를 업데이트
                minDisPoint = dis;
                minPoint = point;
            }
        }


        System.out.printf("나와 가장 가까운 좌표값은 (%d,%d) 입니다.\n", minPoint.x, minPoint.y);
    }
}
