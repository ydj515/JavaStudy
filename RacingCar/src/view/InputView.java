package view;

import common.ConstValue;
import domain.Car;
import exception.NotPositiveNumberException;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static java.lang.System.exit;

public class InputView {

    public static List<Car> inputCarName() {
        System.out.println(ConstValue.INPUT_CAR_NAMES_QUESTION);
        return Arrays.asList(ConstValue.SCANNER.nextLine().split(ConstValue.SEPARATOR_COMMA)).stream().map(Car::of).collect(Collectors.toList());
    }

    public static int inputTryNumAndReturnNum() {
        System.out.println(ConstValue.INPUT_HOW_MANY_TRY_GAMES_QUESTION);
        return validInputNum(ConstValue.SCANNER.nextLine());
    }

    private static int validIsNumber(String inputString) {

        int inputNumber = -1;
        try {
            inputNumber = Integer.parseInt(inputString);
        } catch (NumberFormatException e) {
            System.out.println(ConstValue.NUMBER_FORMAT_EXCEPTION_MESSAGE);
            exit(0);
        }

        return inputNumber;
    }

    private static int validIsPositiveNumber(int num) {
        try {
            NotPositiveNumberException.checkPositiveNumber(num);
        } catch (NotPositiveNumberException e) {
            System.out.println(ConstValue.INPUT_TRY_AGAIN_QUESTION);
            exit(0);
        }
        return num;
    }

    private static int validInputNum(String inputString) {
        int num = validIsNumber(inputString); // 숫자인지 check
        num = validIsPositiveNumber(num); // 양수인지 check

        return num;
    }

}
