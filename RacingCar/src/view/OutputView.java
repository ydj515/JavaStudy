package view;

import common.ConstValue;

import java.util.List;

public class OutputView {
    public static void printProcessResultString() {
        System.out.println(ConstValue.OUTPUT_PROCESS_RESULT);
    }

    public static void printResult(List<String> winnerList) {
        System.out.println(String.join(ConstValue.OUTPUT_STRING_DELIMITER, winnerList) + ConstValue.OUTPUT_FINAL_WINNER_STRING_SUFFIX);
    }

    public static void printCarNameAndPosition(String carName, String countingPositionHyphenString) {
        System.out.println(carName + ConstValue.COLON + countingPositionHyphenString);
    }

    public static void printNewLine() {
        System.out.println();
    }
}
