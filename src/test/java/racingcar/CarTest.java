package racingcar;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

import org.junit.jupiter.api.Test;

class CarTest {

    @Test
    void 메소드가_호출된후_위치값이_1_증가한다() {
        Car testCar = new Car("test");
        assertThat(testCar.getPosition() == 0).isTrue();
        testCar.move();
        assertThat(testCar.getPosition() == 1).isTrue();
    }
}