package racinggame;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
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
}
