package common;

import java.util.Scanner;

public class ConstantValue {

    public static final Scanner SCANNER = new Scanner(System.in);

    public static final int LOTTO_TICKET_PRICE = 1000;

    public static final int MAX_SIZE = 6;
    public static final int MAX_RANDOM_NUMBER_LIMIT = 45;

    public static final int THREE_MATCH_PRIZE = 5000;
    public static final int FOUR_MATCH_PRIZE = 50000;
    public static final int FIVE_MATCH_PRIZE = 1500000;
    public static final int SIX_MATCH_PRIZE = 2000000000;

    public static final int MATCH_THREE = 3;
    public static final int MATCH_FOUR = 4;
    public static final int MATCH_FIVE = 5;
    public static final int MATCH_SIX = 6;

    public static final String SEPARATOR = ",";

    public static final String INPUT_MONEY_QUESTION = "구입금액을 입력해주세요.(천단위)";
    public static final String NUMBER_FORMAT_EXCEPTION_MESSAGE = "숫자를 입력해주세요.";
    public static final String LAST_WEEK_PRIZE_NUMBER_INPUT_QUESTION = "지난주 당첨 번호를 입력해주세요.";
    public static final String INPUT_BONUS_BALL_QUESTION = "보너스 볼을 입력해 주세요.";
    public static final String INPUT_HAND_LOTTO_TICKETS_NUMBER = "수동으로 구매할 로또 수를 입력해 주세요.";
    public static final String INPUT_HAND_LOTTO_TICKETS = "수동으로 구매할 번호를 입력해 주세요.";

    public static final String HORIZONTAL_LINE = "==================";
    public static final String WINNING_STATISTICS = "당첨통계";
    public static final String TOTAL_BENEFIT_MESSAGE_FORMAT = "총 수익률은 %.1f%%입니다.";


    /* 버퍼 지우기 */
    public static void CLEAR_BUFFER() {
        SCANNER.nextLine();
    }


}
