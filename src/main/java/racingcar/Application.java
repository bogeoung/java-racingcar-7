package racingcar;

import racingcar.view.InputView;

public class Application {

    public static void main(String[] args) {
        InputValidator inputvalidator;
        do {
            String inputNames = InputView.startRacingCar();
            String inputTimes = InputView.getRacingTimes();
            inputvalidator = new InputValidator(inputNames, inputTimes);
        } while (!inputvalidator.validate());
        Game game = new Game(inputvalidator.getCarNames(), inputvalidator.getTimes());
        game.start();
        game.judge();
    }

}
