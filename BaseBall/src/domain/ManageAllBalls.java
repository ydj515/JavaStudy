package domain;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ManageAllBalls {

    private List<BaseBall> userInputBalls;
    private List<BaseBall> AnswerBalls;

    /* 컴퓨터가 뽑은 정답 */
    public void putAnswerBalls(List<Integer> createdRandomNumbers) {
        AnswerBalls = createdRandomNumbers.stream().map(BaseBall::of).collect(Collectors.toList());
    }

    /* 사용자가 입력한 숫자 */
    public void putUserNumbers(List<Integer> userInputNumbers) {
        userInputBalls = userInputNumbers.stream().map(BaseBall::of).collect(Collectors.toList());
    }

    /* 볼 갯수 세기 */
    public int countBall() { // 숫자는 있으나 자리가 다르면 ball
        return IntStream.range(0, 3).map(i -> ((AnswerBalls.get(i).getNumber() == userInputBalls.get((i + 1) % 3).getNumber()) || (AnswerBalls.get(i).getNumber() == userInputBalls.get((i + 2) % 3).getNumber())) ? 1 : 0).sum();
    }

    /* 스트라이크 갯수 세기 */
    public int countStrike() { // 자리수가 같으면 strike
        return IntStream.range(0, 3).map(i -> ((AnswerBalls.get(i).getNumber() == userInputBalls.get(i).getNumber())) ? 1 : 0).sum();
    }

    public void clearUserInputNumbers() {
        userInputBalls.clear();
    }

}
