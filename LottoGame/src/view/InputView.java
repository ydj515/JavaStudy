package view;

import common.ConstantValue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class InputView {

    private static final Scanner scanner = new Scanner(System.in);


    public static int inputMoney() {
        System.out.println("구입금액을 입력해주세요.");
        return ConstantValue.SCANNER.nextInt();
    }

    public static List<Integer> inputLastWeekWinningNumbers() {
        System.out.println("지난주 당첨 번호를 입력해주세요.");
        return new ArrayList<>(Arrays.asList(scanner.nextLine().split(ConstantValue.SEPERATOR)).stream().map(Integer::new).collect(Collectors.toList()));
    }

    public static int inputBonusBall() {
        System.out.println("보너스 볼을 입력해 주세요.");
        return ConstantValue.SCANNER.nextInt();
    }

    public static int inputHandMadeLottoTicketsNumber() {
        System.out.println("수동으로 구매할 로또 수를 입력해 주세요.");
        return ConstantValue.SCANNER.nextInt();
    }

    public static void inputHandMadeTicketMessage() {
        ConstantValue.CLEAR_BUFFER();
        System.out.println("수동으로 구매할 번호를 입력해 주세요.");
    }

    public static List<Integer> inputHandMadeTicket() {
        return new ArrayList<>(Arrays.asList(scanner.nextLine().split(ConstantValue.SEPERATOR)).stream().map(Integer::new).collect(Collectors.toList()));
    }
}