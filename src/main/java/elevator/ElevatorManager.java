package elevator;

import java.text.SimpleDateFormat;
import java.util.*;

/**
 * Created by jack on 18/07/2019.
 *
 *  문제 1.  엘리베이터 선택기준 랜덤 -> 건물주가 요청이 있어서 엘레베이터 회사에다가 요구사항
 *  오전에는 A 라는 로직으로 엘레베이터 홀수 번호 선택, 오후에는 B 라는 로직으로 엘레베이터를 짝수 번호 선택해주세요.
 *  * 객체지향적으로 - 어떤 디자인 패턴을 쓰냐.
 *
 */
public class ElevatorManager {

    private List<ElevatorController> controllers;
    private SelectAlgoElevator selectAlgoElevator;


    // el 컨트롤 count 만큼 생성 하여 controller 타입 리스트에 담음
    public ElevatorManager(int controllerCount){
        controllers = new ArrayList<>(controllerCount);
        for(int i=0;i<controllerCount;i++){
            ElevatorController controller = new ElevatorController(i);
            controllers.add(controller);
        }
    }

    //해당 el 의 1~ 20까지 목적지 셋팅하여 프린트
    // 생성자에서 만든 controllers list 중 selectElevator 번째 엘베의 목적지
    // selectElevator = 아이디
    // 파라미터 destination = 랜덤으로 생성된 1~20 중의 목적지
    public void requestElevator(int destination){
        int selectedElevator = selectElevator(destination);
        controllers.get(selectedElevator).gotoFloor(destination);
    }

    private int selectElevator(int destination){
        //some algorithm
        Calendar calendar = Calendar.getInstance();
        //calendar.add(Calendar.HOUR,14);

        SimpleDateFormat dateFormat = new SimpleDateFormat();
        String date =  dateFormat.format(calendar.getTime());
        String subDate = date.substring(11, 13);
        int res=0;
        SelectFactory selectFactory = new SelectFactory();
        for(int i=0; i<controllers.size(); i++){
            // 문자열이 포함되어 있지 않으면 -1을 리턴
            res = selectFactory.selectElevator(subDate);
        }
        return res;
    }


}
