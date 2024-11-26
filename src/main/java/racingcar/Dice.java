package racingcar;

import camp.nextstep.edu.missionutils.Randoms;

public class Dice {

    public static final int DICE_THRESHOLD = 4;

    public static boolean roll() {
        return Randoms.pickNumberInRange(0, 9) >= DICE_THRESHOLD;
    }
}
