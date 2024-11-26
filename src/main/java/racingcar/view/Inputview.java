package racingcar.view;

import camp.nextstep.edu.missionutils.Console;

public class Inputview {

    public static String startRacingCar() {
        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
        return getline();
    }

    public static String getRacingTimes() {
        System.out.println("시도할 횟수는 몇 회인가요?");
        return getline();
    }

    private static String getline() {
        return Console.readLine();
    }
}
