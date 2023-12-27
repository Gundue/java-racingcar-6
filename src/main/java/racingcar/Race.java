package racingcar;

import java.util.HashMap;
import camp.nextstep.edu.missionutils.Console;
import racingcar.util.message.InputMessage;
import racingcar.util.message.OutputMessage;

public class Race {

    private String[] carList;
    private int tryNum;
    private HashMap<String, String> cmap;
    private Winner winner;
    private Car car;

    public void inputInfo() {
        System.out.println(InputMessage.GET_CARNAME_MESSAGE.getMessage());
        carList = Console.readLine().split(",");
        checkArgs(carList);

        System.out.println(InputMessage.GET_TRYNUM_MESSAGE.getMessage());
        tryNum = Integer.parseInt(Console.readLine());
        System.out.println();

        start();
    }

    private void start() {
        // 타입 변환
        typeConvert();
        // 전진 반복
        forwardRepeat();
        // 승자
        printWinner();
    }

    private void printWinner() {
        winner = new Winner(cmap);
        String finalWinner = winner.getWinners();
        System.out.print(OutputMessage.GET_FINAL_WINNER.getMessage());
        System.out.println(finalWinner);
    }

    // list -> map
    private void typeConvert() {
        cmap = new HashMap<>();
        for(String carName: carList) {
            cmap.put(carName, "");
        }
    }


    private void checkArgs(String[] cn) {
        for(String name: cn){
            if(name.length() >= 5) {
                throw new IllegalArgumentException("Invalid argument : " + name);
            }
        }
    }

    private void forwardRepeat() {
        car = new Car(cmap);
        for(int i = 0; i < tryNum; i++) {
            car.goFoward();
            fowardResult();
        }
    }

    public void fowardResult() {
        System.out.println(OutputMessage.GET_EXECUTE_RESULT.getMessage());
        for(String key: cmap.keySet()){
            String value = cmap.get(key);
            System.out.println(key+" : "+value);
        }
        System.out.println();
    }
}
