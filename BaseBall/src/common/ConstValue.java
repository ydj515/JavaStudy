package common;

import java.util.Scanner;

public class ConstValue {
    public static final Scanner SCANNER = new Scanner(System.in);

    public static final String INPUT_NUMBER = "숫자를 입력해주세요 : ";
    public static final String RESTART_OR_END_GAME_STRING = "게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요 : ";
    public static final String SEPARATOR_BLANK = " ";

    public static final String NOTHING = "낫싱";
    public static final String STRIKE = "스트라이크";
    public static final String BALL = "볼";


    public static final int MAX_RANDOM_LIMIT = 9;

    public static final int RESTART_GAME = 1;
    public static final int THREE_STRIKE = 3;
    public static final int MAX_BALL = 3;

    /* 버퍼 지우기 */
    public static void CLEAR_BUFFER() {
        SCANNER.nextLine();
    }
}
