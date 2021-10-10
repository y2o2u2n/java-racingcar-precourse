package racinggame;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class PlayerTest {
	@DisplayName("입력값으로부터 자동차들을 만들어낼 수 있다.")
	@ParameterizedTest
	@ValueSource(strings = {"pobi,crong,honux"})
	void inputCarNames(String namesWithComma) {
		// given
		Player player = new Player();

		// when
		Cars cars = player.inputCarNames(namesWithComma);

		// then
		assertAll(
			() -> assertThat(cars).isNotNull(),
			() -> assertThat(cars.isEmpty()).isFalse(),
			() -> assertThat(cars.getValues()).hasSize(namesWithComma.split(",").length)
		);
	}

	@DisplayName("입력값이 옳지 않은 경우 자동차들을 만들어낼 수 없다.")
	@ParameterizedTest
	@ValueSource(strings = {"pobi,crong,longname"})
	void inputCarNames_fail(String namesWithComma) {
		// given
		Player player = new Player();

		// when & then
		assertThatExceptionOfType(BadInputException.class).isThrownBy(() -> player.inputCarNames(namesWithComma));
	}

	@DisplayName("입력값으로부터 라운드수를 만들어낼 수 있다.")
	@ParameterizedTest
	@ValueSource(strings = {"0", "1", "5"})
	void inputNumberOfRounds(String numberStr) {
		// given
		Player player = new Player();

		// when
		NumberOfRounds numberOfRounds = player.inputNumberOfRounds(numberStr);

		// then
		assertThat(numberOfRounds.getValue()).isEqualTo(Integer.parseInt(numberStr));
	}

	@DisplayName("입력값이 옳지 않은 경우 라운드수를 만들어낼 수 없다.")
	@ParameterizedTest
	@ValueSource(strings = {"-5", "-1", "a"})
	void inputNumberOfRounds_fail(String numberStr) {
		// given
		Player player = new Player();

		// when & then
		assertThatExceptionOfType(BadInputException.class).isThrownBy(() -> player.inputNumberOfRounds(numberStr));
	}
}
