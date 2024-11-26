package racingcar;

import camp.nextstep.edu.missionutils.Randoms;
import java.util.List;
import racingcar.view.Outputview;

public class Game {

    public static final int DICE_THRESHOLD = 4;
    private Cars cars;
    private int gameTimes;

    public Game(List<String> carNames, int gameTimes) {
        cars = new Cars(carNames);
        this.gameTimes = gameTimes;
    }

    public void start() {
        Outputview.result();
        for (int i = 0; i < gameTimes; i++) {
            playOneGame();
        }
    }

    public void judge() {
        Judgement judgement = new Judgement(cars);
        judgement.announceResult();
    }

    private void playOneGame() {
        for (Car car : cars.getCars()) {
            if (throwDice()) {
                car.move();
            }
            Outputview.printCurrentLocation(car.getName(), car.getPosition());
        }
        System.out.println();
    }

    private boolean throwDice() {
        return Randoms.pickNumberInRange(0, 9) >= DICE_THRESHOLD;
    }
}
