package baseballGame;

import common.ConstValue;
import domain.ManageAllBalls;
import view.BaseBallGameInputView;
import view.BaseBallGameOutputView;

import java.util.List;

public class BallGameProgress {

    private boolean continueGameFlag;

    public BallGameProgress(boolean continueGameFlag) {
        this.continueGameFlag = continueGameFlag;
    }

    public void setContinueGameFlag(boolean continueGameFlag) {
        this.continueGameFlag = continueGameFlag;
    }

    public void startGame(ManageAllBalls allBalls) {

        while (continueGameFlag) {
            List<Integer> userInputNumbers = BaseBallGameInputView.inputNumber();

            allBalls.putUserNumbers(userInputNumbers);

            judge(allBalls);

            allBalls.clearUserInputNumbers();
        }
    }

    private void judge(ManageAllBalls managementBallsAndUserNumbers) {

        int strike = managementBallsAndUserNumbers.countStrike();
        int ball = managementBallsAndUserNumbers.countBall();

        BaseBallGameOutputView.printStrikeAndBall(strike, ball);

        validThreeStrike(strike);
    }

    /* 3스트라이크인지 판단 */
    private void validThreeStrike(int strike) {
        if (strike == ConstValue.THREE_STRIKE) {
            continueGameFlag = false;
        }
    }

}
