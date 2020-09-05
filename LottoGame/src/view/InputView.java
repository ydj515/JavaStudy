package view;

import common.ConstantValue;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class InputView {

    private static final Scanner scanner = new Scanner(System.in);

    public static int inputMoney() {
        String inputMoney;
        do {
            System.out.println(ConstantValue.INPUT_MONEY_QUESTION);
            inputMoney = ConstantValue.SCANNER.nextLine();
        } while (validIsNumberFormat(inputMoney) || !validThousandInputNumber(inputMoney));
        return Integer.parseInt(inputMoney);
    }

    public static List<Integer> inputLastWeekWinningNumbers() {
        System.out.println(ConstantValue.LAST_WEEK_PRIZE_NUMBER_INPUT_QUESTION);
        return Arrays.stream(scanner.nextLine().split(ConstantValue.SEPARATOR)).map(Integer::new).collect(Collectors.toList());
    }

    public static int inputBonusBall() {
        String inputBonusBall;
        do {
            System.out.println(ConstantValue.INPUT_BONUS_BALL_QUESTION);
            inputBonusBall = ConstantValue.SCANNER.nextLine();
        } while (validIsNumberFormat(inputBonusBall));
        return Integer.parseInt(inputBonusBall);
    }

    public static int inputHandMadeLottoTicketsNumber() {
        String handLottoTicketNumber;
        do {
            System.out.println(ConstantValue.INPUT_HAND_LOTTO_TICKETS_NUMBER);
            handLottoTicketNumber = ConstantValue.SCANNER.nextLine();
        } while (validIsNumberFormat(handLottoTicketNumber));
        return Integer.parseInt(handLottoTicketNumber);
    }

    private static boolean validIsNumberFormat(String inputNumber) { // 사실상 if else 문인감..?
        try {
            Integer.parseInt(inputNumber);
            return false;
        } catch (NumberFormatException e) {
            System.out.println(ConstantValue.NUMBER_FORMAT_EXCEPTION_MESSAGE);
            return true;
        }
    }

    private static boolean validThousandInputNumber(String inputMoney) {
        return Integer.parseInt(inputMoney) % 1000 == 0;
    }

    public static void inputHandMadeTicketMessage() {
        System.out.println(ConstantValue.INPUT_HAND_LOTTO_TICKETS);
    }

    public static List<Integer> inputHandMadeTicket() {
        return Arrays.stream(scanner.nextLine().split(ConstantValue.SEPARATOR)).map(Integer::new).collect(Collectors.toList());
    }
}