package racinggame;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EmptySource;
import org.junit.jupiter.params.provider.NullSource;
import org.junit.jupiter.params.provider.ValueSource;

class NameTest {

	@DisplayName("이름을 생성할 수 있다.")
	@ParameterizedTest
	@ValueSource(strings = {"pobi", "crong", "honux"})
	void constructor(String value) {
		// given & when
		Name name = new Name(value);

		// then
		assertThat(name.getValue()).isEqualTo(value);
	}

	@DisplayName("이름이 1자 이상 5자 이하가 아니면 생성할 수 없다.")
	@ParameterizedTest
	@NullSource
	@EmptySource
	@ValueSource(strings = {"y2o2u2n"})
	void constructor_fail(String value) {
		// given & when & then
		assertThatThrownBy(() -> new Name(value)).isInstanceOf(IllegalArgumentException.class);
	}

	@DisplayName("동등성")
	@ParameterizedTest
	@ValueSource(strings = {"pobi", "crong", "honux"})
	void equals(String value) {
		// given & then
		Name name = new Name(value);

		// then
		assertThat(name).isEqualTo(new Name(value));
	}
}
