package common;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RandomLottoNumberGenrator {

    private final int MAX_SIZE = 6;
    private final int MAX_RANDOM_NUMBER_LIMIT = 45;

    public List<Integer> createLottoNumbers() {

        Set<Integer> randomNumberSet = new HashSet<>();

        while (randomNumberSet.size() != MAX_SIZE) {
            int randomNumber = (int) (Math.random() * MAX_RANDOM_NUMBER_LIMIT + 1);
            randomNumberSet.add(randomNumber);
            randomNumberSet.remove(0);
        }

        return new ArrayList<>(randomNumberSet);
    }

}