package racinggame;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class CarsTest {

	@DisplayName("자동차들을 생성할 수 있다.")
	@ParameterizedTest
	@ValueSource(strings = {"pobi,crong,honux", "youn,yoon"})
	void constructor(String namesWithComma) {
		// given & when
		Cars cars = new Cars(namesWithComma);

		// then
		assertAll(
			() -> assertThat(cars).isNotNull(),
			() -> assertThat(cars.isEmpty()).isFalse(),
			() -> assertThat(cars.getValues()).hasSize(namesWithComma.split(",").length)
		);
	}

	@DisplayName("자동차들을 운전해서 전진할 수 있다.")
	@ParameterizedTest
	@ValueSource(strings = {"pobi,crong,honux"})
	void drive_forward(String namesWithComma) {
		// given
		Cars cars = new Cars(namesWithComma);

		// when
		cars.drive(() -> true);

		// then
		for (Car car : cars.getValues()) {
			assertThat(car.getPosition()).isEqualTo(new Position(1));
		}
	}

	@DisplayName("자동차들을 운전해서 멈출 수 있다.")
	@ParameterizedTest
	@ValueSource(strings = {"pobi,crong,honux"})
	void drive_stop(String namesWithComma) {
		// given
		Cars cars = new Cars(namesWithComma);

		// when
		cars.drive(() -> false);

		// then
		for (Car car : cars.getValues()) {
			assertThat(car.getPosition()).isEqualTo(new Position(0));
		}
	}
}
