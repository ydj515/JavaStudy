package view;

import common.ConstValue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InputView {

    public static List<String> inputCarName() {
        System.out.println(ConstValue.INPUT_CAR_NAMES_QUESTION);
        return new ArrayList<>(Arrays.asList(ConstValue.SCANNER.nextLine().split(ConstValue.SEPARATOR_COMMA)));
    }

    public static int inputTryNumAndReturnNum() {
        System.out.println(ConstValue.INPUT_HOW_MANY_TRY_GAMES_QUESTION);
        int num = ConstValue.SCANNER.nextInt();
        return validInputNum(num);
    }

    private static int validInputNum(int num) {
        while (num < 1) {
            System.out.println(ConstValue.INPUT_TRY_AGAIN_QUESTION);
            num = ConstValue.SCANNER.nextInt();
        }
        return num;
    }

}
