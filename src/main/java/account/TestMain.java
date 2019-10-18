package account;

public class TestMain extends Thread {
    public static void main(String[] args) {
        Account myAccount = new Account();

        for(int i=0; i<10 ; i++){
            Thread t = new Thread(new Deposit(myAccount));
            t.start();
        }
    }
}
