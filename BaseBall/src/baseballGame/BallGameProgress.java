package baseballGame;

import common.ConstValue;
import domain.ManageMentAllBalls;
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

    public void startGame(ManageMentAllBalls allBalls) {

        while (continueGameFlag) {
            List<Integer> userInputNumbers = BaseBallGameInputView.inputNumber();

            allBalls.putUserNumbers(userInputNumbers);

            judge(allBalls);

            allBalls.clearUserInputNumbers();
        }
    }

    private void judge(ManageMentAllBalls managementBallsAndUserNumbers) {

        int strike = managementBallsAndUserNumbers.countStrike();
        int ball = managementBallsAndUserNumbers.countBall();

        BaseBallGameOutputView.printStrikeAndBall(strike, ball);

        validThreeStrike(strike);
    }

    private void validThreeStrike(int strike) {
        if (strike == ConstValue.THREE_STRIKE) {
            continueGameFlag = false;
        }
    }

}
