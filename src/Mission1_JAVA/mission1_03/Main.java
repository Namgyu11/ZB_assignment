package Mission1_JAVA.mission1_03;

public class Main {
    static class Paper {
        // 페이지당 게시물 수
        final int postPerpage = 9;
        //최대로 보일 수 있는 인덱스
        final int maxIdx = 5;

        long totalCount;

        public Paper(long totalCount) {
            this.totalCount = totalCount;
        }

        public String html(long pageIndex) {
            StringBuilder st = new StringBuilder();

            st.append("<a href=\"#\">[처음]</a>\n" +
                    "<a href=\"#\">[이전]</a>\n\n");

            // 총 페이지
            int totalPage = (int) ((totalCount % postPerpage == 0) ? (totalCount/postPerpage) : (totalCount/postPerpage) + 1);

            // 페이지에서 처음으로 시작하는 인덱스
            int beginningIdx = (int) (((pageIndex -1) / maxIdx) * maxIdx) + 1;

            // 페이지에서 마지막으로 나오는 인덱스
            int lastIdx =  Math.min(beginningIdx + maxIdx -1, totalPage);

            for (int i = beginningIdx; i <= lastIdx; i++) {
                if (i == pageIndex) {
                    st.append("<a href=\"#\" class='on'>").append(i).append("</a>\n");
                } else {
                    st.append("<a href=\"#\">").append(i).append("</a>\n");
                }
            }

            st.append("\n<a href=\"#\">[다음]</a>\n" +
                    "<a href=\"#\">[마지막]</a>");

            return st.toString();
        }
    }

    public static void main(String[] args) {

        long totalCount = 115;
        long pageIndex = 12;

        Paper paper = new Paper(totalCount);
        System.out.println(paper.html(pageIndex));
    }
}
