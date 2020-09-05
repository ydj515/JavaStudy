package common;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RandomLottoNumberGenerator {

    public List<Integer> createLottoNumbers() {

        Set<Integer> randomNumberSet = new HashSet<>();

        while (randomNumberSet.size() != ConstantValue.MAX_SIZE) {
            int randomNumber = (int) (Math.random() * ConstantValue.MAX_RANDOM_NUMBER_LIMIT + 1);
            randomNumberSet.add(randomNumber);
            randomNumberSet.remove(0);
        }

        return new ArrayList<>(randomNumberSet);
    }

}