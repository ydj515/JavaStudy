package controller;

import baseballGame.BallGameProgress;
import baseballGame.CreateThreeRandomNumber;
import common.ConstValue;
import domain.ManageAllBalls;
import view.BaseBallGameOutputView;

import java.util.List;

public class BaseBallGameController {

    public void run() {
        BallGameProgress ballGameProgress = new BallGameProgress(true);
        ManageAllBalls allBalls = new ManageAllBalls();

        do {
            List<Integer> createdRandomNumbers = CreateThreeRandomNumber.createRandomNumbers(ConstValue.MAX_BALL);

            allBalls.putAnswerBalls(createdRandomNumbers);

            ballGameProgress.startGame(allBalls);

            ballGameProgress.setContinueGameFlag(true);
        } while (BaseBallGameOutputView.restartOREndGame() == ConstValue.RESTART_GAME);
    }

}