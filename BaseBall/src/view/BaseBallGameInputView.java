package view;

import common.ConstValue;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class BaseBallGameInputView {

    public static List<Integer> inputNumber() {
        List<String> list;
        do {
            System.out.print(ConstValue.INPUT_NUMBER);
             list = Arrays.asList(ConstValue.SCANNER.nextLine().split(ConstValue.SEPARATOR_BLANK));
        } while(list.size() < 3);
        return list.stream().map(Integer::new).collect(Collectors.toList());
    }
}
