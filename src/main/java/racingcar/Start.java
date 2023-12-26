package racingcar;

import java.util.HashMap;
import java.util.Scanner;

public class Start {

    private int tn;
    private HashMap<String, String> cmap;

    public void startProgram() {
        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
        Scanner carName = new Scanner(System.in);
        String cn[] = carName.next().split(",");
        checkArgs(cn);

        System.out.println("시도할 회수는 몇회인가요?");
        Scanner tryNum = new Scanner(System.in);
        tn = tryNum.nextInt();

        System.out.println();
        cmap = new HashMap<>();
        // list -> map
        for(String name: cn) {
            cmap.put(name, "");
        }

        forwardRepeat();

        Winner wn = new Winner(cmap);
        wn.printWinner();
    }

    private void checkArgs(String[] cn) {
        for(String name: cn){
            if(name.length() >= 5) {
                System.out.println("이름이 5글자 이상입니다");
                throw new IllegalArgumentException("Invalid argument : " + name);
            }
        }
    }

    private void forwardRepeat() {
        Foward fw = new Foward(cmap);
        Result rs = new Result(cmap);
        for(int i = 0; i < tn; i++) {
            fw.goFoward();
            rs.printResult();
        }
    }


}
