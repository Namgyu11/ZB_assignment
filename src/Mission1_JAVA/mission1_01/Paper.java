package Mission1_JAVA.mission1_01;

public class Paper {
    public static void main(String[] args) {

        StringBuilder s = new StringBuilder();
        s.append("D" + "D");
        s.append("A");

        int a = 14;
        int sa = 15;
        int b = (sa < a)? 1:2;
        System.out.println(b);
    }
}
// a를 10으로 나눴는데 나머지가 0이면  a+1를 반환하고 나머지가 0이 아니라면 a를 반환하는 코드