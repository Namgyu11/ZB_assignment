package Mini_assignment.assignment_99;

public class Work2 {

    public static void main(String[] args) {
        String filePath = "C:\\Users\\hagaj\\Desktop\\냄규\\ZB_assignment\\test";

        FileUtils fileUtils = new FileUtils();

        String fileText = fileUtils.getLoadText(filePath);
        fileText = fileText.toLowerCase();

        int[] alphaCnt = {
                0,0,0,0,0,0,0,0,0,0,
                0,0,0,0,0,0,0,0,0,0,
                0,0,0,0,0,0};
        int totalCnt = 0;

        for (int i = 0; i < fileText.length(); i++) {
            char c1 = fileText.charAt(i);
            if(c1 == 'a'){alphaCnt[0]++;}
            else if(c1 == 'b'){alphaCnt[1]++;}
            else if(c1 == 'c'){alphaCnt[2]++;}
            else if(c1 == 'd'){alphaCnt[3]++;}
            else if(c1 == 'e'){alphaCnt[4]++;}
            else if(c1 == 'f'){alphaCnt[5]++;}
            else if(c1 == 'g'){alphaCnt[6]++;}
            else if(c1 == 'h'){alphaCnt[7]++;}
            else if(c1 == 'i'){alphaCnt[8]++;}
            else if(c1 == 'j'){alphaCnt[9]++;}
            else if(c1 == 'k'){alphaCnt[10]++;}
            else if(c1 == 'l'){alphaCnt[11]++;}
            else if(c1 == 'm'){alphaCnt[12]++;}
            else if(c1 == 'n'){alphaCnt[13]++;}
            else if(c1 == 'o'){alphaCnt[14]++;}
            else if(c1 == 'p'){alphaCnt[15]++;}
            else if(c1 == 'q'){alphaCnt[16]++;}
            else if(c1 == 'r'){alphaCnt[17]++;}
            else if(c1 == 's'){alphaCnt[18]++;}
            else if(c1 == 't'){alphaCnt[19]++;}
            else if(c1 == 'u'){alphaCnt[20]++;}
            else if(c1 == 'v'){alphaCnt[21]++;}
            else if(c1 == 'w'){alphaCnt[22]++;}
            else if(c1 == 'x'){alphaCnt[23]++;}
            else if(c1 == 'y'){alphaCnt[24]++;}
            else if(c1 == 'z'){alphaCnt[25]++;}
        }
        for (int i = 0; i < alphaCnt.length; i++) {
            totalCnt += alphaCnt[i];
        }
        for (int i = 0; i < alphaCnt.length ; i++) {
            double rate = (double)alphaCnt[i] / totalCnt * 100;
            String format = String.format("%c = %6d, \t %.2f%%", i + 65, alphaCnt[i], rate);
            System.out.println(format);
        }
    }
}
