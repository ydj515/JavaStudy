package common;

import java.util.Scanner;

public class ConstValue {
    public static final Scanner SCANNER = new Scanner(System.in);

    public static final String INPUT_CAR_NAMES_QUESTION = "경주할 자동차 이름을 입력하세요.(이름은 쉽표(,) 기준으로 구분)";
    public static final String INPUT_HOW_MANY_TRY_GAMES_QUESTION = "시도할 횟수는 몇회인가요?";
    public static final String INPUT_TRY_AGAIN_QUESTION = "시도할 횟수를 다시 입력하세요.";
    public static final String SEPARATOR_COMMA = ",";

    public static final String OUTPUT_STRING_DELIMITER = ", ";
    public static final String OUTPUT_FINAL_WINNER_STRING_SUFFIX = "가 최종우승했습니다.";
    public static final String OUTPUT_PROCESS_RESULT = "[실행 결과]";

    public static final String POSITION_STRING = "-";
    public static final String COLON = " : ";

    public static final int movingStepCondition = 4;
    public static final int forwardStep = 1;
    public static final int stopStep = 0;

    public static final int randomNumberRange = 10;

}
