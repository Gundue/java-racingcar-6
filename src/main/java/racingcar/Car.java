package racingcar;

import java.util.HashMap;
import camp.nextstep.edu.missionutils.Randoms;

public class Car {
    private HashMap<String, String> carList;

    public Car(HashMap<String, String> carList) {
        this.carList = carList;
    }
    public void goFoward() {
        for(String key: carList.keySet()){
            String value = carList.get(key);
            if(makeRandom(0, 9) >= 4){
                carList.put(key, value.concat("-"));
            }
        }
    }

    private int makeRandom(int startNum, int endNum) {
        return Randoms.pickNumberInRange(startNum, endNum);
    }
}
