package racinggame;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class RoundTest {

	@DisplayName("라운드를 생성할 수 있다.")
	@ParameterizedTest
	@ValueSource(strings = {"0", "1", "2"})
	void constructor(int value) {
		// given & when
		Round round = new Round(value);

		// then
		assertThat(round.getValue()).isEqualTo(value);
	}

	@DisplayName("동등성")
	@ParameterizedTest
	@ValueSource(strings = {"0", "1", "2"})
	void equals(int value) {
		// given & then
		Round round = new Round(value);

		// then
		assertThat(round).isEqualTo(new Round(value));
	}
}
