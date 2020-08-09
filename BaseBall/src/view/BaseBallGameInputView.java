package view;

import common.ConstValue;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class BaseBallGameInputView {

    public static List<Integer> inputNumber() {
        System.out.print(ConstValue.INPUT_NUMBER);
//        String inputNumber = ConstValue.SCANNER.nextLine();
//        List<Integer> userInputNumbers = new ArrayList<>();
//        IntStream.range(0, inputNumber.length()).forEach(i -> userInputNumbers.add(Character.getNumericValue(inputNumber.charAt(i))));
        return Arrays.asList(ConstValue.SCANNER.nextLine().split(ConstValue.SEPARATOR_BLANK)).stream().map(Integer::new).collect(Collectors.toList());
    }
}
