package Printer;

public class Printer  {
    private static Printer instance = new Printer();
    private Printer(){}
    public static Printer getInstance(){return instance;}


    public void standByPrinter(Document document){
        System.out.println(" standBy :: "+document.toString());

    }

    public void printQueue(Document document){

    }

}
