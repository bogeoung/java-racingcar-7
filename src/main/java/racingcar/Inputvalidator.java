package racingcar;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import racingcar.view.Outputview;

public class Inputvalidator {

    String inputs;

    public Inputvalidator(String inputs) {
        this.inputs = inputs;
    }

    public boolean validate() {
        //콤마와 이름으로 구성되어 있는지
        //이름에 중복이 없는지
        //
        return checkDuplicate();
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
        return Arrays.stream(inputs.split(",", 0)).map(String::toLowerCase).toList();
    }

}
