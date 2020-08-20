package view;

import common.ConstValue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LadderGameInputView {

    public static List<String> inputPlayers() {
        System.out.println("참여할 사람 이름을 입력하세요. (이름은 쉼표(,)로 구분하세요)");
        return new ArrayList<>(Arrays.asList(ConstValue.SCANNER.nextLine().split(ConstValue.SEPERATOR)));
    }

    public static int inputLadderHigh() {
        System.out.println("최대 사다리 높이는 몇 개인가요?");
        return ConstValue.SCANNER.nextInt();
    }

}
