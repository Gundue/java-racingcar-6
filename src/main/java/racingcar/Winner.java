package racingcar;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Winner {
    private HashMap<String, String> carList;
    private int maxValue = 0;
    private List<String> winnerList = new ArrayList<>();

    public Winner(HashMap<String, String> carList) {
        this.carList = carList;
    }
    private void findMaxValue() {
        for(String key: carList.keySet()){
            int value = carList.get(key).length();
            if(value > maxValue) {
                maxValue = value;
            }
        }
    }

    private void findWinner() {
        for(Map.Entry<String, String> entry : carList.entrySet()) {
            if(entry.getValue().length() == maxValue) {
                winnerList.add(entry.getKey());
            }
        }
    }

    public String getWinners() {
        findMaxValue();
        findWinner();
        return String.join(", ", winnerList);
    }

}
