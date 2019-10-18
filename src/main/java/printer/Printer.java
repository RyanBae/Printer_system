package printer;

import java.util.LinkedList;

public class Printer extends Thread {
    private static Printer instance = new Printer();
    private Printer(){}
    public static Printer getInstance(){return instance;}
     LinkedList<Document> que = new LinkedList<Document>();

    public void standByPrinter(Document document){
       // System.out.println(" standBy :: "+document.toString());
        que.add(document);

    }

    @Override
    public void run() {
        while (true){
            if(que.size() > 0){
                System.out.println(" // 대기열 :: "+que.size());
                Document printDocu = que.poll();
                System.out.println("출력시작 ==================================================> page : "+printDocu.page);
                for (int i = 0; i < printDocu.page; i++) {
                    System.out.println(printDocu.userNo+" 문서제목 : " + printDocu.title+" 문서내용 : " + printDocu.content+" page : " + i);
                }
                System.out.println("출력종료 ===================================================> ");
            }
        }

    }
}
