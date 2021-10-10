package racinggame;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

class PositionTest {

	@DisplayName("위치를 생성할 수 있다.")
	@ParameterizedTest
	@ValueSource(strings = {"1", "5"})
	void constructor(int value) {
		// given & when
		Position position = new Position(value);

		// then
		assertThat(position.getValue()).isEqualTo(value);
	}

	@DisplayName("위치를 1만큼 증가시킬 수 있다.")
	@ParameterizedTest
	@ValueSource(strings = {"1", "5"})
	void increment(int count) {
		// given
		Position position = new Position(0);

		// when
		for (int i = 0; i < count; i++) {
			position = position.increment(1);
		}

		// then
		assertThat(position.getValue()).isEqualTo(count);
	}

	@DisplayName("동등성")
	@ParameterizedTest
	@ValueSource(strings = {"0", "3", "7"})
	void equals(int value) {
		// given & when & then
		assertThat(new Position(value)).isEqualTo(new Position(value));
	}

	@DisplayName("비교")
	@ParameterizedTest
	@CsvSource({"1,2,-1", "2,1,1", "1,1,0"})
	void compareTo(int aValue, int bValue, int comparison) {
		// given & when
		Position aPosition = new Position(aValue);
		Position bPosition = new Position(bValue);

		// then
		assertThat(aPosition.compareTo(bPosition)).isEqualTo(comparison);
	}
}
