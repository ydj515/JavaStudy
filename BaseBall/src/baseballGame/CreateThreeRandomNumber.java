package baseballGame;

import common.ConstValue;

import java.util.*;

public class CreateThreeRandomNumber {


    public static List<Integer> createRandomNumbers(int maxBall) {

        Set<Integer> randomNumberSet = new HashSet<>();

        while (randomNumberSet.size() != maxBall) {
            int randomNumber = (int) (Math.random() * ConstValue.MAX_RANDOM_LIMIT + 1);
            randomNumberSet.add(randomNumber);
            randomNumberSet.remove(0);
        }

        return shuffleList(randomNumberSet);
    }

    /* list 순서 섞기 */
    private static List<Integer> shuffleList(Set<Integer> randomNumberSet) {
        List<Integer> shuffledList = new ArrayList<>(randomNumberSet);
        Collections.shuffle(shuffledList);
        return shuffledList;
    }

}
