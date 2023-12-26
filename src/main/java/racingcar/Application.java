package racingcar;

import java.util.HashMap;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
        Scanner carName = new Scanner(System.in);
        String cn[] = carName.next().split(",");
        HashMap<String, String> map = new HashMap<>();
        for(String name: cn){
            map.put(name, "");
        }
        Foward fw = new Foward(map);
        fw.goFoward();
        Result rs = new Result(map);
        rs.printResult();
        System.out.println("시도할 회수는 몇회인가요?");
        Scanner tryNum = new Scanner(System.in);
        int tn = tryNum.nextInt();
        System.out.println(tn);
    }
}
