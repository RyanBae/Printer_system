package Printer;

public class User extends Thread{
    Printer printer = Printer.getInstance();
    Printer printer2 = Printer.getInstance();

    @Override
    public void run() {
        super.run();
        Document document = new Document();
        document.page = (int)(Math.random()*50)+1;
        document.title = "제목_"+document.getPage();
        document.content = "내용입니다._"+document.getPage();
        System.out.println(document);
        printer.standByPrinter(document);
        if(printer == printer2){
            System.out.println(" print == print 2  : true");
        }else {
            System.out.println(" print == print 2  : false");
        }
    }
}
