package elevator;

import java.util.Random;

/**
 * Created by jack on 18/07/2019.
 */
public class Client {

    public static void main(String[] args){
        Random r = new Random();
        ElevatorManager em = new ElevatorManager(3);
        em.requestElevator(r.nextInt(20)+1);
        em.requestElevator(r.nextInt(20)+1);
        em.requestElevator(r.nextInt(20)+1);
    }
}
