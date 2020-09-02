package domain;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static org.junit.Assert.assertEquals;

public class ManageAllBallsTest {

    BaseBall userBall1;
    BaseBall userBall2;
    BaseBall userBall3;
    BaseBall userBall4;
    BaseBall userBall5;
    BaseBall userBall6;
    BaseBall userBall7;
    BaseBall userBall8;
    BaseBall userBall9;

    List<BaseBall> userInputBalls;
    List<BaseBall> AnswerBalls;


    @Before
    public void setUp() {
        System.out.println("===Set up===");
        userBall1 = new BaseBall(1);
        userBall2 = new BaseBall(2);
        userBall3 = new BaseBall(3);
        userBall4 = new BaseBall(4);
        userBall5 = new BaseBall(5);
        userBall6 = new BaseBall(6);
        userBall7 = new BaseBall(7);
        userBall8 = new BaseBall(8);
        userBall9 = new BaseBall(9);

        userInputBalls = Arrays.asList(userBall1, userBall3, userBall5);
        AnswerBalls = Arrays.asList(userBall1, userBall3, userBall5);
    }

    @Test
    public void putAnswerBallsTest() {
        assertEquals(Arrays.asList(userBall1.getNumber(), userBall2.getNumber(), userBall3.getNumber()), putAnswerBallsConvertLogic(Arrays.asList(1, 2, 3)).stream().map(i -> i.getNumber()).collect(Collectors.toList()));
        assertEquals(Arrays.asList(userBall5.getNumber(), userBall9.getNumber(), userBall1.getNumber()), putAnswerBallsConvertLogic(Arrays.asList(5, 9, 1)).stream().map(i -> i.getNumber()).collect(Collectors.toList()));
    }

    private List<BaseBall> putAnswerBallsConvertLogic(List<Integer> numbers) {
        return numbers.stream().map(BaseBall::of).collect(Collectors.toList());
    }


    /* putAnswerBallsTest 와 동일*/
    @Test
    public void putUserNumbersTest() {
    }

    @Test
    public void countBallTest() {
        assertEquals(0, countBall());
    }

    private int countBall() {
        return IntStream.range(0, 3).map(i -> ((AnswerBalls.get(i).getNumber() == userInputBalls.get((i + 1) % 3).getNumber()) || (AnswerBalls.get(i).getNumber() == userInputBalls.get((i + 2) % 3).getNumber())) ? 1 : 0).sum();
    }

    @Test
    public void countStrikeTest() {
        assertEquals(3, countStrike());
    }

    private int countStrike() { // 자리수가 같으면 strike
        return IntStream.range(0, 3).map(i -> ((AnswerBalls.get(i).getNumber() == userInputBalls.get(i).getNumber())) ? 1 : 0).sum();
    }

}