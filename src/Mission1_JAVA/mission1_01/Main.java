package Mission1_JAVA.mission1_01;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        StringBuilder html = new StringBuilder();
        html.append("<!DOCTYPE html>\n" +
                "<html lang=\"en\">\n" +
                "\n" +
                "<head>\n" +
                "  <meta charset=\"UTF-8\">\n" +
                "  <title></title>\n" +
                "  <h1>자바 환경정보</h1>\n" +
                "  <style>\n" +
                "    table{border-collapse: collapse; width: 100%; }\n" +
                "    th, td{border: solid 1px #000;}\n" +
                "  </style>\n" +
                "\n" +
                "  <table>\n" +
                "    <tr>\n" +
                "      <th>키</th>\n" +
                "      <th></th>\n" +
                "    </tr>\n" +
                "    <tr>");

        //자바 시스템 속성값 출력
        for(Object k : System.getProperties().keySet()){
            String key = k.toString();
            String value = System.getProperty(key);
            html.append("<tr>\n" + "      <td>").
                    append(key).append("</td>\n").
                    append("      <td>").append(value).append("</td>\n").
                    append("    </tr>");
        }
        html.append("</table>\n" +
                "\n" +
                "</head>\n" +
                "<body>\n" +
                "\n" +
                "</body>\n" +
                "</html>");

        //파일 저장
        try {
            File file = new File("C:\\Users\\hagaj\\Desktop\\냄규\\ZB_assignment\\src\\Mission1_JAVA\\mission1_01\\property.html");
            BufferedWriter writer =  new BufferedWriter(new FileWriter(file));
            writer.write(html.toString());
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();;
        }
    }
}
