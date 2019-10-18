package account;

public class Account {

    long balance;

    public void deposit(long amount){
        balance = balance + amount;
        //System.out.println(balance);
    }

    public void inquiry(){
        System.out.println("잔액: " + balance);
    }
}
