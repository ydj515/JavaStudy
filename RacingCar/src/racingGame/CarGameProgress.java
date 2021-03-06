package racingGame;

import common.ConstValue;
import domain.Car;
import view.OutputView;

import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;

public class CarGameProgress {

    public static void startGame(List<Car> carList, int num) {
        OutputView.printProcessResultString(); // 실행 결과
        IntStream.range(0, num).forEach(i -> gameOneSet(carList));
    }

    /* 자동차 경주 한게임 세트 */
    private static void gameOneSet(List<Car> carList) {
        carList.stream().forEach(i -> gameProcess(i));
        OutputView.printNewLine();
    }

    private static void gameProcess(Car car) {
        car.movingOneStep(forwardStep());
        String countingPositionHyphenString = calculatePosition(car.getPosition());
        OutputView.printCarNameAndPosition(car.getName(), countingPositionHyphenString);
    }

    /* 한칸 갈지 말지 움직임 */
    private static int forwardStep() {
        return (createdRandomNumber() >= ConstValue.MOVING_STEP_CONDITION) ? ConstValue.FORWARD_STEP : ConstValue.STOP_STEP;
    }

    /* 랜덤 번호 생성 */
    private static int createdRandomNumber() {
        return new Random().nextInt(ConstValue.randomNumberRange); // 0 ~ 9
    }

    private static String calculatePosition(int n) {
        StringBuilder countPosition = new StringBuilder();

        for (int i = 0; i < n; i++) {
            countPosition.append(ConstValue.POSITION_STRING);
        }

        return countPosition.toString();
    }
}
