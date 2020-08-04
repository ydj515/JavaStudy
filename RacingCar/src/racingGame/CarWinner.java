package racingGame;

import domain.Car;

import java.util.List;
import java.util.stream.Collectors;

public class CarWinner {

    /* 우승자 list return */
    public List<String> collectWinnerListNames(List<Car> carList) {
        int maxPosition = getWinnerPosition(carList);
        return carList.stream().filter(i -> i.getPosition() == maxPosition).map(i -> i.getName()).collect(Collectors.toList());
    }

    /* 1등인 position 찾기 */
    private int getWinnerPosition(List<Car> carList) {
        return carList.stream().mapToInt(i -> i.getPosition()).boxed().max(Integer::compare).orElse(-1);
    }
}
