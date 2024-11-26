package racingcar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import racingcar.view.OutputView;

public class InputValidator {

    private final String inputNames;
    private final String inputTimes;

    public InputValidator(String inputsNames, String inputTimes) {
        this.inputNames = inputsNames;
        this.inputTimes = inputTimes;
    }

    public boolean validate() {
        //콤마와 이름으로 구성되어 있는지
        //이름에 중복이 없는지
        if (getCarNames().isEmpty()) {
            return false;
        }
        return checkDuplicate() && checkValidTimes();
    }

    private boolean checkValidTimes() {
        int times;
        try {
            times = Integer.parseInt(inputTimes);
        } catch (NumberFormatException e) {
            OutputView.inputTimeNotValid();
            return false;
        }
        return times > 0;
    }

    private boolean checkDuplicate() {
        List<String> carNames = getCarNames();
        Set<String> carNameSet = new HashSet<>();
        for (String carName : carNames) {
            if (carNameSet.contains(carName)) {
                OutputView.inputNameDuplicate();
                return false;
            }
            carNameSet.add(carName);
        }
        return carNames.size() == carNameSet.size();
    }


    public List<String> getCarNames() {
        if (inputNames == null || inputNames.isEmpty() || inputNames.equals(" ")) {
            return new ArrayList<>();
        }
        return Arrays.stream(inputNames.split(",", 0)).map(String::toLowerCase).map(String::strip).toList();
    }

    public int getTimes() {
        return Integer.parseInt(inputTimes);
    }

}
