package racingcar.util.message;

import racingcar.util.EnumUtil;

public enum OutputMessage implements EnumUtil {
    GET_EXECUTE_RESULT("실행 결과"),
    GET_FINAL_WINNER("최종 우승자 : ");

    private String message;

    OutputMessage(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
