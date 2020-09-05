package domain;

import common.ConstantValue;

import java.util.HashMap;
import java.util.stream.IntStream;

public class Prize {

    private static int sum = 0;

    private HashMap<Integer, Integer> prizeMap;
    private HashMap<Integer, Integer> resultHashMap;

    public Prize(HashMap<Integer, Integer> resultHashMap) {
        prizeMap = new HashMap<>();
        prizeMap.put(3, ConstantValue.THREE_MATCH_PRIZE);
        prizeMap.put(4, ConstantValue.FOUR_MATCH_PRIZE);
        prizeMap.put(5, ConstantValue.FIVE_MATCH_PRIZE);
        prizeMap.put(6, ConstantValue.SIX_MATCH_PRIZE);

        this.resultHashMap = resultHashMap;
    }

    public HashMap<Integer, Integer> getPrizeMap() {
        return prizeMap;
    }

    public int getPrize() {
        IntStream.range(3, prizeMap.size() + 3).forEach(i -> sum += prizeMap.get(i) * resultHashMap.get(i));
        return sum;
    }

}