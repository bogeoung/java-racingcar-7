package racingcar;

import java.util.LinkedList;
import java.util.List;

public class Cars {

    private List<Car> cars;

    public Cars(List<String> carNames) {
        cars = new LinkedList<>();
        for (String carName : carNames) {
            cars.add(new Car(carName));
        }
    }

    public List<Car> getCars() {
        return cars;
    }

}
