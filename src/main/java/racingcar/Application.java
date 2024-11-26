package racingcar;

import racingcar.view.Inputview;

public class Application {

    public static void main(String[] args) {
        Inputvalidator inputvalidator;
        do {
            String inputNames = Inputview.startRacingCar();
            String inputTimes = Inputview.getRacingTimes();
            inputvalidator = new Inputvalidator(inputNames, inputTimes);
        } while (!inputvalidator.validate());
        Game game = new Game(inputvalidator.getCarNames(), inputvalidator.getTimes());
        game.start();
        game.judge();
    }

}
