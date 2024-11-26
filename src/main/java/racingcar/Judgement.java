package racingcar;

import java.util.ArrayList;
import java.util.List;
import racingcar.view.OutputView;

public class Judgement {

    private final Cars cars;

    public Judgement(Cars cars) {
        this.cars = cars;
    }

    public void announceResult() {
        List<String> winners = getWinners();
        OutputView.announceWinner(winners);
    }

    private List<String> getWinners() {
        List<String> winners = new ArrayList<>();
        int maxLocation = getMaxLocation();
        for (Car car : cars.getCars()) {
            if (car.getPosition() == maxLocation) {
                winners.add(car.getName());
            }
        }
        return winners;

    }

    private int getMaxLocation() {
        int maxLocation = 0;
        for (Car car : cars.getCars()) {
            if (car.getPosition() > maxLocation) {
                maxLocation = car.getPosition();
            }
        }
        return maxLocation;
    }
}
