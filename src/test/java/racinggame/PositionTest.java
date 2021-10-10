package racinggame;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class PositionTest {

	@DisplayName("위치를 생성할 수 있다.")
	@Test
	void constructor() {
		// given & when
		Position position = new Position();

		// then
		assertThat(position.getValue()).isEqualTo(0);
	}

	@DisplayName("위치를 1만큼 증가시킬 수 있다.")
	@ParameterizedTest
	@ValueSource(strings = {"1", "5"})
	void increment(int countOfIncrement) {
		// given
		Position position = new Position();

		// when
		for (int i = 0; i < countOfIncrement; i++) {
			position.increment();
		}

		// then
		assertThat(position.getValue()).isEqualTo(countOfIncrement);
	}

	@DisplayName("동등성")
	@ParameterizedTest
	@ValueSource(strings = {"0", "3", "7"})
	void equals(int countOfIncrement) {
		// given
		Position p1 = new Position();
		Position p2 = new Position();

		// when
		for (int i = 0; i < countOfIncrement; i++) {
			p1.increment();
			p2.increment();
		}

		// then
		assertThat(p1).isEqualTo(p2);
		assertThat(p1.getValue()).isEqualTo(p2.getValue());
	}
}
