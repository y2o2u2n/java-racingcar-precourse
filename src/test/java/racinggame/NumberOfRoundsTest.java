package racinggame;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class NumberOfRoundsTest {

	@DisplayName("자연수일 경우 생성할 수 있다.")
	@ParameterizedTest
	@ValueSource(strings = {"0", "1", "5"})
	void constructor(String numberStr) {
		// given & when
		NumberOfRounds numberOfRounds = new NumberOfRounds(numberStr);
		// then
		assertThat(numberOfRounds.getValue()).isEqualTo(Integer.parseInt(numberStr));
	}

	@DisplayName("자연수가 아닐 경우 생성할 수 없다.")
	@ParameterizedTest
	@ValueSource(strings = {"-5", "-1"})
	void constructor_fail(String numberStr) {
		// given & when & then
		assertThatThrownBy(() -> new NumberOfRounds(numberStr)).isInstanceOf(IllegalArgumentException.class);
	}

	@DisplayName("동등성")
	@ParameterizedTest
	@ValueSource(strings = {"1"})
	void equals(String numberStr) {
		// given & when & then
		assertThat(new NumberOfRounds(numberStr)).isEqualTo(new NumberOfRounds(numberStr));
	}
}
