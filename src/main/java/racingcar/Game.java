package racingcar;

import java.util.List;
import racingcar.view.OutputView;

public class Game {

    private Cars cars;
    private int gameTimes;

    public Game(List<String> carNames, int gameTimes) {
        cars = new Cars(carNames);
        this.gameTimes = gameTimes;
    }

    public void start() {
        OutputView.result();
        for (int i = 0; i < gameTimes; i++) {
            for (Car car : cars.getCars()) {
                playOneGame(car, Dice.roll());
            }
        }
        System.out.println();
    }

    public void judge() {
        Judgement judgement = new Judgement(cars);
        judgement.announceResult();
    }

    public void playOneGame(Car car, Boolean diceResult) {
        if (diceResult) {
            car.move();
        }
        OutputView.printCurrentLocation(car.getName(), car.getPosition());
    }

}
