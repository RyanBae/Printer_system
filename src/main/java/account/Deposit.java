package account;

public class Deposit implements Runnable {
    Account myAccount;

    Deposit(Account thisAccount){
        myAccount = thisAccount;
    }

    @Override
    public void run() {

        for(int i=0; i<1000; i++){
            myAccount.deposit(1);
        }
        myAccount.inquiry();
    }

}
