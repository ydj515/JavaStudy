package view;

import common.ConstValue;
import domain.Car;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class InputView {

    public static List<Car> inputCarName() {
        System.out.println(ConstValue.INPUT_CAR_NAMES_QUESTION);
        return Arrays.asList(ConstValue.SCANNER.nextLine().split(ConstValue.SEPARATOR_COMMA)).stream().map(Car::of).collect(Collectors.toList());
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
