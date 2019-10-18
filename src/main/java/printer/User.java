package printer;

public class User extends Thread{
    Printer printer = Printer.getInstance();

    @Override
    public void run() {
        super.run();

        for(int i = 0; i<10; i++){
        Document document = new Document();
        document.page = (int)(Math.random()*10)+1;
        document.title = "제목_"+document.getPage();
        document.content = "내용입니다._"+document.getPage();
        document.userNo = "user_"+ (int)(Math.random()*10)+1;
        printer.standByPrinter(document);
        }

    }
}
