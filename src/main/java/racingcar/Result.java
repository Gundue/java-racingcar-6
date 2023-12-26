package racingcar;

import java.util.HashMap;

public class Result {
    private HashMap<String, String> carList;

    public Result(HashMap<String, String> carList) {
        this.carList = carList;
    }
    public void printResult() {
        System.out.println("실행 결과");
        for(String key: carList.keySet()){
            String value = carList.get(key);
            System.out.println(key+" : "+value);
        }
        System.out.println();
    }
}
