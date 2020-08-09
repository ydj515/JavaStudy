package domain;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ManageMentAllBalls {

    private List<BaseBall> userInputBlls;
    private List<BaseBall> AnswerBalls;

    public void putAnswerBalls(List<Integer> createdRandomNumbers) {
        AnswerBalls = createdRandomNumbers.stream().map(BaseBall::of).collect(Collectors.toList());
    }

    public void putUserNumbers(List<Integer> userInputNumbers) {
        userInputBlls = userInputNumbers.stream().map(BaseBall::of).collect(Collectors.toList());
    }

    public int countBall() {
        return IntStream.range(0, 3).map(i -> ((AnswerBalls.get(i).getNumber() == userInputBlls.get((i + 1) % 3).getNumber()) || (AnswerBalls.get(i).getNumber() == userInputBlls.get((i + 2) % 3).getNumber())) ? 1 : 0).sum();
    }

    public int countStrike() { // 자리수가 같으면 strike
        return IntStream.range(0, 3).map(i -> ((AnswerBalls.get(i).getNumber() == userInputBlls.get(i).getNumber())) ? 1 : 0).sum();
    }

    public void clearUserInputNumbers() {
        userInputBlls.clear();
    }

}
