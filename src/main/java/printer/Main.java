package printer;

public class Main {
    public static void main(String[] args) {
        Thread thread = new User();
        Thread thread2 =  Printer.getInstance();
        thread2.start();
        thread.start();


    }
}
