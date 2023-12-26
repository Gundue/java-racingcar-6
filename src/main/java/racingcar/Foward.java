package racingcar;

import java.util.HashMap;
import camp.nextstep.edu.missionutils.Randoms;

public class Foward {
    private HashMap<String, String> carList;

    public Foward(HashMap<String, String> carList) {
        this.carList = carList;
    }
    public void goFoward() {
        for(String key: carList.keySet()){
            String value = carList.get(key);
            // 무작위 값이 4이상
            if(Randoms.pickNumberInRange(0,9) >= 4){
                carList.put(key, value.concat("-"));
            }
        }
        System.out.println(carList);
    }
}
