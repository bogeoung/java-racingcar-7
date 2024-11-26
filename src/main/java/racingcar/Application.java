package racingcar;

import racingcar.view.Inputview;

public class Application {

    public static void main(String[] args) {
        Inputvalidator inputvalidator;

        do {
            String inputNames = Inputview.startRacingCar();
            inputvalidator = new Inputvalidator(inputNames);
        } while (!inputvalidator.validate());
    }
}
