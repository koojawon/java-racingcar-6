package racingcar.enums;

public enum StringEnum {

    PARTICIPANT_STRING("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)"),
    ROUND_STRING("시도할 횟수는 몇회인가요?"),
    RESULT_STRING("최종 우승자 : ");
    private final String expression;

    StringEnum(String expression) {
        this.expression = expression;
    }

    @Override
    public String toString() {
        return expression;
    }
}
