package controller;

import domain.Car;
import racingGame.CarGameProgress;
import racingGame.CarWinner;
import view.InputView;
import view.OutputView;

import java.util.List;
import java.util.stream.Collectors;

public class RacingCar {

    public void run() {
        List<String> carNames = InputView.inputCarName();
        int tryNum = InputView.inputTryNumAndReturnNum();
        List<Car> carList = makeCarList(carNames);

        CarGameProgress.startGame(carList, tryNum); // 게임 실행

        List<String> winnerList = new CarWinner().collectWinnerListNames(carList);
        OutputView.printResult(winnerList);
    }

    private List<Car> makeCarList(List<String> carNames) {
        return carNames.stream().map(Car::of).collect(Collectors.toList());
    }

}
