package racingcar;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import racingcar.view.Outputview;

public class Inputvalidator {

    private final String inputNames;
    private final String inputTimes;

    public Inputvalidator(String inputsNames, String inputTimes) {
        this.inputNames = inputsNames;
        this.inputTimes = inputTimes;
    }

    public boolean validate() {
        //콤마와 이름으로 구성되어 있는지
        //이름에 중복이 없는지
        //
        return checkDuplicate() && checkValidTimes();
    }

    private boolean checkValidTimes() {
        int times;
        try {
            times = Integer.parseInt(inputTimes);
        } catch (NumberFormatException e) {
            Outputview.inputTimeNotValid();
            return false;
        }
        return times > 0;
    }

    private boolean checkDuplicate() {
        List<String> carNames = getCarNames();
        Set<String> carNameSet = new HashSet<>();
        for (String carName : carNames) {
            if (carNameSet.contains(carName)) {
                Outputview.inputNameDuplicate();
                return false;
            }
            carNameSet.add(carName);
        }
        return carNames.size() == carNameSet.size();
    }


    public List<String> getCarNames() {
        return Arrays.stream(inputNames.split(",", 0)).map(String::toLowerCase).toList();
    }

    public int getTimes() {
        return Integer.parseInt(inputTimes);
    }

}
