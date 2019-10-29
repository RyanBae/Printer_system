package elevator;

public class SelectFactory {
    public int selectElevator(String param){
        int res = 0;

        switch (param){
            case "오전":
                res = new MorningSelect().algorithm();
                break;
            case "오후":
                res = new AfternoonSelect().algorithm();
                break;

        }
        return res;
    }
}
