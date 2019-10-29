package elevator;

import java.util.Random;

public class AfternoonSelect implements SelectElevator{
    @Override
    public int algorithm() {
        Random r = new Random();

        int e = 0;
        for(int i = 0; i<10; i++){
            e = r.nextInt(3);
            if(e % 2 == 0){
                break;
            }
        }

        return e;
    }
}
