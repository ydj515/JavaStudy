package view;

import common.ConstValue;

public class BaseBallGameOutputView {

    public static void printStrikeAndBall(int strike, int ball) {
        if ((strike == 0) && (ball == 0)) {
            System.out.println(ConstValue.NOTHING);
        } else {
            System.out.println(strike + ConstValue.STRIKE + ball + ConstValue.BALL);
        }
    }

    public static int restartOREndGame() {
        System.out.print(ConstValue.RESTART_OR_END_GAME_STRING);
        int newGameOrEndGameInputNumber = ConstValue.SCANNER.nextInt();
        ConstValue.CLEAR_BUFFER();
        return newGameOrEndGameInputNumber;
    }

}
