package racingcar;

import java.util.HashMap;

public class Result {
    private HashMap<String, String> carList;

    public Result(HashMap<String, String> carList) {
        this.carList = carList;
    }
    public void printResult() {
        for(String key: carList.keySet()){
            String value = carList.get(key);
            System.out.println(key+" : "+value);
        }
    }
}
