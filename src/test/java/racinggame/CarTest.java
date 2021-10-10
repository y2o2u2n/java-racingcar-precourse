package racinggame;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class CarTest {

	@DisplayName("자동차를 생성할 수 있다.")
	@ParameterizedTest
	@ValueSource(strings = {"pobi", "crong", "honux"})
	void constructor(String name) {
		// given & when
		Car car = new Car(new Name(name));

		// then
		assertAll(
			() -> assertThat(car).isNotNull(),
			() -> assertThat(car.getName()).isEqualTo(new Name(name)),
			() -> assertThat(car.getPosition()).isEqualTo(new Position(0))
		);
	}

	@DisplayName("자동차를 운전해서 전진할 수 있다.")
	@Test
	void drive_forward() {
		// given
		Car car = new Car(new Name("youn"));

		// when
		car.drive(() -> true);

		// then
		assertThat(car.getPosition()).isEqualTo(new Position(1));
	}

	@DisplayName("자동차를 운전해서 멈출 수 있다.")
	@Test
	void drive_stop() {
		// given
		Car car = new Car(new Name("youn"));

		// when
		car.drive(() -> false);

		// then
		assertThat(car.getPosition()).isEqualTo(new Position(0));
	}
}
