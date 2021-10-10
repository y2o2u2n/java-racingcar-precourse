package racinggame;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CarTest {
	private final String name = "youn";
	private Car car;

	@BeforeEach
	void setUp() {
		car = CarFixture.CAR(name);
	}

	@DisplayName("자동차를 생성할 수 있다.")
	@Test
	void constructor() {
		// given & when

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
		// given & when
		car.drive(() -> true);

		// then
		assertThat(car.getPosition()).isEqualTo(new Position(1));
	}

	@DisplayName("자동차를 운전해서 멈출 수 있다.")
	@Test
	void drive_stop() {
		// given & when
		car.drive(() -> false);

		// then
		assertThat(car.getPosition()).isEqualTo(new Position(0));
	}
}
