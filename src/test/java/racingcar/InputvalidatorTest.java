package racingcar;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.ValueSource;

class InputvalidatorTest {

    @ParameterizedTest(name = "{0} 이 입력됐을 떄")
    @ValueSource(strings = {"1", "100"})
    void 양수가_입력되면_참을_반환한다(String candidate) {

        InputValidator inputvalidator = new InputValidator("pobi,dori", candidate);
        assertThat(inputvalidator.validate()).isTrue();
    }

    @ParameterizedTest(name = "{0} 이 입력됐을 떄")
    @NullAndEmptySource
    @ValueSource(strings = {"!", "0", "-1", "abc"})
    void 양수가_아닌값이_입력되면_거짓을_반환한다(String candidate) {
        InputValidator inputvalidator = new InputValidator("pobi,dori", candidate);
        assertThat(inputvalidator.validate()).isFalse();
    }

    @ParameterizedTest(name = "{0} 이 입력됐을 떄")
    @ValueSource(strings = {"Pobi, dori", "pobi1, pobi2"})
    void 중복된_이름이_입력이_존재하지_않으면_참을_반환한다(String candidate) {
        InputValidator inputvalidator = new InputValidator(candidate, "1");
        assertThat(inputvalidator.validate()).isTrue();
    }

    @ParameterizedTest(name = "{0} 이 입력됐을 떄")
    @ValueSource(strings = {"Pobi, pobi", "pobi, pobi"})
    void 중복된_이름이_입력되면_거짓을_반환한다(String candidate) {
        InputValidator inputvalidator = new InputValidator(candidate, "1");
        assertThat(inputvalidator.validate()).isFalse();
    }

    @ParameterizedTest
    @NullAndEmptySource
    void 공백이_입력되면_거짓을_반환한다(String candidate) {
        InputValidator inputvalidator = new InputValidator(candidate, "1");
        assertThat(inputvalidator.validate()).isFalse();
    }
}